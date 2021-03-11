package ru.otus.ocajp.webinar30.sub;

import java.io.FileNotFoundException;
import java.util.List;

/*-
 - Вопрос:
    Почему в строке 21 ( (InterfaceA) test) нет ошибки компиляции?
 - Ответ:
    У нас есть класс Test и он не final. Значит от него можно наследоваться (например класс TestChild).
    И возможно класс наследник (TestChild) имплементирует интерфейс InterfaceA.
    Тогда получится, что в классе Test (reftype) может лежать наследник TestChild (actype).
    И мы не должны запрещать возможность actype (то что справа) закастовать до InterfaceA.
    Т.е если вместо строки 19 использовать строку 20, то не будет ClassCastException (JVM error),
    так как класс TestChild имплементирует интерфейс InterfaceA.
    Это работает ТОЛЬКО с интерфейсами.
 */

// There is no requirement that an abstract class cannot contain a runnable main() method.
// The object type relates to the attributes of the object that exist in memory,
// while the reference type dictates how the object is able to be used by the caller.
abstract public class Test {
    public static void main(String[] args) {
        //Test test = new Test();
        Test test = new TestChild();
        InterfaceA interfaceA = (InterfaceA) test; // compile success, but on runtime throw ClassCastException
        //InterfaceB interfaceB = (InterfaceB) interfaceA; // compile success, but on runtime throw ClassCastException

        /*-
            No error because, class Number is not final and List is a interface.
            Compile, even though interface "List" and non final class "Number" are unrelated types.
            While the compiler can enforce unrelated type rules for classes, it has limited ability to do so for
            interfaces, since there may be a subclass of "Number" that implements the "List" interface.

            Attention! "instanceof" смотрит actype (Number).
         */
        Number number = 5;
        if (number instanceof List) { // always false
            System.out.println("number instanceof List");
        } else {
            System.out.println("number NOT instanceof List"); // print this
        }

        Integer integer = 5;
        // Compile error because class Integer is a final class.
        /*-
        if (integer instanceof List) {

        }
         */

        /*-
        if (null instanceof null) { // compile error: illegal start of type

        }
         */

         /*-
            This line of code will compile successfully, but it will fail at
            runtime with a ClassCastException. An object of a base class can’t be cast to an
            object of its derived class.
        */
        // Programmer b = ((Author) new Programmer()); // ClassCastException


        /*-
            The expression ((Author)new Programmer()) is evaluated
            before it can be assigned to a reference variable of type Author. This line of code also
            tries to cast an object of the base class, Programmer, to an object of its derived class,
            Author. This code will also compile successfully but will fail at runtime with a Class-
            CastException. Using a reference variable of type Author won’t make a difference
            here. What matters here is the type that follows the new operator.
         */
        // Author a = ((Author) new Programmer()); // ClassCastException

        Programmer programmer = new Author();
        Author author = (Author) programmer; // Success cast
        System.out.println("Success");

        try {
            programmer.testMethod();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
