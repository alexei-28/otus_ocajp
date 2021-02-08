package ru.otus.ocajp.webinar25;

// Перегрузка методов. Наследование и его преимущества.
// Применение ключевых слов super и this для доступа к объектам и конструкторам.

// Method Overloading and Ambiguity in Varargs in Java
// https://www.geeksforgeeks.org/method-overloading-ambiguity-varargs-java/

// How is ambiguous overloaded method call resolved in java?
// https://javabypatel.blogspot.com/2016/05/ambiguous-method-overloading.html
public class Main {

    /*-
    Tips:
    Overloading allows different methods to have same name,
    but different signatures where signature can differ by number of input parameters
    or type of input parameters or both.

    According to (JLS 15.2.2), there are 3 phases used in overload resolution:
    - First phase performs overload resolution without permitting boxing or unboxing conversion
    - Second phase performs overload resolution while allowing boxing and unboxing
    - Third phase allows overloading to be combined with variable arity methods, boxing, and unboxing.

    If no applicable method is found during these phases, then ambiguity occurs(compile error).

    Example:
    Method "System.out.println()" is overloaded:
        print(char[] c)
        print(String s)
        print(Object o)
        and so on
    */
    public static void main(String args[]) {
        System.out.println("Webinar#25.\nJDK: " + System.getProperty("java.version"));

        MyParent myParent = new MyParent();
        myParent.printText(); // print "MyParent_printText"

        System.out.println("---");

        MyParent classA = new Child(); // Компилятор видит левую часть(MyParent)
        classA.printText();// print "Child_printText" -> call method "printText()" of child class(Child)

        // This output is due to the fact that "int" is more specific than "double".
        fun(); // print "int varargs"

        test(1, 2, 3);// OK
        test(true, false, true, false); // OK
        // The call above could be translated into a call to test(int …) or test(boolean …).
        // Both are equally valid and do not be resolved after all three phases(see above) of overload resolution
        // because both the data types are different.
        // Thus, the call is inherently ambiguous(compile error).
        // test(); // compile error: Reference to test is ambiguous

        /*-
            In the class Car, the static method getModelName() hides the static method of
            the same name in the superclass Vehicle. In the class Car, the instance method
            getRegNo() overrides the instance method of the same name in the superclass
            Vehicle. The declared type of the reference determines the method to execute
            when a static method is called, but the actual type of the object at runtime
            determines the method to execute when an overridden method is called.
        */
        Car car = new Car();
        Vehicle obj = car;
        /*-
        Can call static method by class name or by instance reference (obj).
        Как только есть объект класса, на нём можно вызвать его методы.
        E.g.
            Vehicle obj = new Vehicle();
            Vehicle.getSomeStaticMethod();
            obj.getSomeStaticMethod()
        */
        System.out.println("obj.getStaticModelName = " + obj.getStaticModelName() // same as "Vehicle.getModelName()"
                + "\ncar.getStaticModelName = " + car.getStaticModelName()
                + "\nobj.getRegNumber() = " + obj.getRegNumber()
                + "\ncar.getRegNumber() = " + car.getRegNumber()
        );
        obj = null;
        System.out.println("obj_null_getStaticModelName = " + obj.getStaticModelName()); // same as "Vehicle.getModelName()"
        /*-
        Result print:

          obj.getStaticModelName = Vehicle_Volvo
          car.getStaticModelName = Car_Toyota
          obj.getRegNumber() = 54321
          car.getRegNumber() = 54321

        */
    }

    //varargs method with float datatype
    static void fun(float... x) {
        System.out.println("float varargs");
    }

    //varargs method with int datatype
    static void fun(int... x) {
        System.out.println("int varargs");
    }

    //varargs method with double datatype
    static void fun(double... x) {
        System.out.println("double varargs");
    }

    static void test(int...a) {
        System.out.println("test(int ...): " + "Number of args: " + a.length + " Contents: ");
    }

    static void test(boolean...a) {
        System.out.println("test(boolean ...) " + "Number of args: " + a.length + " Contents: ");
    }
}
