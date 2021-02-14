package ru.otus.ocajp.webinar13;

// Применение оператора switch
public class Main {
    public static void main(String... args) {
        System.out.println("Webinar#13!\nJDK: " + System.getProperty("java.version"));
        int testInt = 11;
        switch (testInt) { // ok, no "case" and no "default"
        }
        System.out.println("after_switch");

        switch (testInt) {
            case 10: {
                System.out.println(" ---> 10");
                break;
            }
            /*- compile error: incompatible types: possible lossy conversion from long to int
            // Any value that can be implicitly promoted to int will work for the case statement with an int input.
            case 11L : {
                System.out.println(" ---> 11");
                break;
            }
             */
        }

        int testChar = 'b';
        switch (testChar) {
            case 'a': {
                System.out.println("testChar = " + testChar);
                break;
            }
            case 'b': {
                System.out.println("testChar2 = " + testChar); // print this 98
                break;
            }
        }

        String testStr = "hello";
        switch (testStr) {
            case "hello2": {
                System.out.println("testStr = " + testStr);
                break;
            }
            case "hello": {
                System.out.println("testStr2 = " + testStr); // print this "hello"
                break;
            }
            default: {
                System.out.println("default");
            }
        }

        int color = 3;
        int red = 2;
        final int redFinal = 3;
        switch (color) {
            default:  {
                System.out.println("color_default");
                break;
            }
            case redFinal: {
                System.out.println("color_redFinal");
                break;
            }
            //case red: { // compile error. The value of a case statement must be constant, a literal value, or final variable.
            case 5 : {
                System.out.println("color_red ");
            }
        }

        color = 21;
        int test  = 4;
        final Integer testInteger = 10;
        // switch не может принять boolean
        switch (color) {
            default:
            case 1: case 2: System.out.println("hello");
            // Each case statement must have the keyword case
            // case 1: 2: System.out.println("hello"); // compile error,  not a statement
            //case 2: continue; // compile error
            case 10: System.out.println("hello_10");
            // case test : System.out.println("test"); // compile error: constant expression required

            // Классы-оболочки(testInteger) не считаются константами времени компиляции, даже когда их помечают модификатором final.
            // case testInteger: System.out.println("hello_integer"); // compile error: constant expression required
        }
        // print: "hello" and "hello_10"
    }
}
