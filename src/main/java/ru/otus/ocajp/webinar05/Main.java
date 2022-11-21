package ru.otus.ocajp.webinar05;

/*-
    Определение областей действия переменных

    The "javac" command compiles into bytecode, which must be run in a Java virtual machine (JVM),
    and is not native machine code, so III is false as well.

    JVM not allows direct access to object in memory.
    JVM manages the location of objects in memory that can change and is transparent to the Java application.
    JVM does require an entry point method to begin executing the application.

    Test: https://docs.google.com/forms/d/e/1FAIpQLSeXA9ZYo25Li4msiVkgwgJGDdejdCrKIsQKELN17iuMB29xBg/viewform
    Answer: https://docs.google.com/forms/d/e/1FAIpQLSeXA9ZYo25Li4msiVkgwgJGDdejdCrKIsQKELN17iuMB29xBg/viewscore?viewscore=AE0zAgCXw6ian2VJkaziVceyb0CM5Z2AoMLpWPcdU4AOhTonuD9CGTt-ym7cpyMkT713Shc
    Test2: https://docs.google.com/forms/d/e/1FAIpQLScogFnhliEPCJHb2yJ7UL7mOSKeo-Ti5hdjbLd072SGDKTYWQ/viewform
    Answer: https://docs.google.com/forms/d/e/1FAIpQLScogFnhliEPCJHb2yJ7UL7mOSKeo-Ti5hdjbLd072SGDKTYWQ/viewscore?viewscore=AE0zAgCeb6td5aJm4xusLiP-Mu_B9_I1ivKxwtlD6jxmPqBNJRPsct3Fqf3qBiSvRh1HyMA

 */
public class Main {
    int x = 5;

    public static final void main(String... args) {
        System.out.println("Webinar#05.\nJDK: " + System.getProperty("java.version"));
        //x++; // compile error: on-static variable x cannot be referenced from a static context\
        boolean test = false;
        System.out.println("test_reverse = " + !test);
        boolean test2 = (boolean) test;
        System.out.println("test2 = " + test2);
    }

    // Локальные переменные нельзя затенять.
    private void myMethod(int w) {
        //int w = 10; // compile error: variable w is already defined in method myMethod(int)
        System.out.println(15); // ok

    }
}
