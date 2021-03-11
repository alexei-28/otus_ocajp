package ru.otus.ocajp.webinar30;

import ru.otus.ocajp.webinar30.sub.Author;
import ru.otus.ocajp.webinar30.sub.ClassA;
import ru.otus.ocajp.webinar30.sub.ClassC;
import ru.otus.ocajp.webinar30.sub.Programmer;

// Class of entry point can be abstract.
abstract public class Main {
    public static void main(java.lang.String[] args) {
        System.out.println("Webinar#30.\nJDK: " + System.getProperty("java.version"));

        // "instanceof" работает только с родственными классами. Иначе compile error.
        Fish fish = new Fish();

        /*-
        if (fish instanceof Bird) {  // compile error: incompatible types: Fish cannot be converted to Bird

        }
        */
        // Boxing and casting: Number <- Integer <- int
        Number number = (Number) 100;
        // Casting, boxing, casting: Object <- Integer <- int <- double
        Object obj = (Object) (int) 10.5;
        // Casting, unboxing, casting: double <- int <- Integer <- Object
        double d = (double) (Integer) obj;

        ClassC classC = new ClassC();
        // System.out.println(classC.str); // compile error: "str" has private access in ClassB
        System.out.println(((ClassA) classC).str); // Hello from ClassA
    }


    /*-
       A class cannot contain two methods with the same method signature,
       even if one is static and the other is not.
    */
    /*-
    public void playMusic() {

    }

    public static int playMusic() {
        return -1;
    }
     */
}
