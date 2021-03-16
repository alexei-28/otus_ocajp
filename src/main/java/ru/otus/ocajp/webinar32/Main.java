package ru.otus.ocajp.webinar32;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Random;

// Создание блока try-catch и влияние исключений на штатный алгоритм работы программы.
public class Main {

   static {
        try {
            testthisStatic();
        } catch (FileNotFoundException ex) {

        } catch (Exception ex) {

        }
        finally {

        }


    }
    public static void testthisStatic() throws FileNotFoundException {
        System.out.println("testthisStatic");
    }

    public static void main(String[] args) {
        System.out.println("Webinar#32.\nJDK: " + System.getProperty("java.version"));
        // You can fill array's item by call method.
        int[] arrInt = {getRandomInt(), 2, getRandomInt()};
        System.out.println("arrInt = " + Arrays.toString(arrInt));

        int[] arrInt2 = new int[3];
        arrInt2[0] = 10;
        arrInt2[1] = 20;
        // You can set array's item by call method.
        arrInt2[2] = getRandomInt();
        System.out.println("arrInt2 = " + Arrays.toString(arrInt2));

        String result = testRef();
        System.out.println("result = " + result); // result = trying: finalized

        // tryWithHack();
        // notExecuteFinallyBlock();
        // notExecuteFinallyBlock2();
        // notExecuteFinallyBlock3();
        //notExecuteFinallyBlock4();
        //notExecuteCodeAfterFinally();
        // notCompile();
        //testCatches();
        // tetsManyExcpetions();
        testMultiCatch();
    }

    private static void tetsManyExcpetions() {
        System.out.println("a");
        try {
            System.out.println("b");
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("c");
            throw new RuntimeException("1");
        } catch (RuntimeException e) {
            System.out.println("d");
            throw new RuntimeException("2");
        } finally {
            System.out.println("e");
            throw new RuntimeException("3");
        }
    }

    private static void testCatches() {
        try {
            test();
            int test = 0/0; // throw ArithmeticException
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test() throws IOException, Exception {

    }

    /*-
    private static void notCompile() {
        IOException ioe = null; // local variable
        try {
            throw ioe;
        } catch (IOException ioe) { // Local variable "ioe" is already defined in method notCompile() -> not  compile
            System.err.println("notCompile: catch");
        }
    }

     */

    private static void notExecuteFinallyBlock4() {
        try {
            System.err.println("notExecuteCodeAfterFinally: try"); // print
            if (true) return; //  Without "if(true)" -> compile error, because row 39 never execute
        } finally {
            System.err.println("notExecuteCodeAfterFinally: finally"); // print
        }
        System.err.println("more"); // never execute
    }

    private static void notExecuteCodeAfterFinally() {
        try {
            System.err.println("notExecuteCodeAfterFinally: try"); // print
            if (true) throw new RuntimeException(); //  Without "if(true)" -> compile error, because row 39 never execute
            System.err.println("notExecuteCodeAfterFinally: after"); // never print
        } finally {
            System.err.println("notExecuteCodeAfterFinally: finally"); // print
        }
        System.err.println("more"); // never execute
    }

    private static void notExecuteFinallyBlock3() {
        try {
            while (true) { // infinity loop

            }
        } finally { // never execute
            System.err.println("finally");
        }
        // System.err.println("more"); // never execute -> compile error
    }

    private static void notExecuteFinallyBlock2() {
        try {
            System.err.println("notExecuteFinallyBlock2()");
            // kill JVM
            // Runtime.getRuntime().exit(42); // finished with non-zero exit value 42
            // or like this
            Runtime.getRuntime().halt(42); // finished with non-zero exit value 42
        } finally { // never execute
            System.err.println("finally");
        }
    }

    private static void tryWithHack() {
        try {
            /*-
               Without "if(true)" -> compile error, because row 76 never execute
             */
            System.err.println("before_if_true");
            if (true) throw new RuntimeException();
            System.err.println("after_if_true"); // never print this
        } catch (RuntimeException ex) {
            System.err.println("catch RuntimeException");
            throw new Error(); // throw java.lang.Error
        }
        System.err.println("After try block"); // never print this but compile
    }

    private static void notExecuteFinallyBlock() {
        try {
            System.err.println("notExecuteFinallyBlock()");
            System.exit(0); // force exist from application
        } finally { // never execute
            System.err.println("finally");
        }
    }

    private static String testRef() {
        String str = "trying: ";
        try {
            throw  new NullPointerException();
        } catch (NullPointerException ex) {
            return str + "catching";
        } finally {
            str += "finalized";
            return str;
        }
    }

    private static int getRandomInt() {
        return new Random().nextInt(100);
    }

    private static void testMultiCatch() {
        try {
            testThrows();
        } catch (IOException | SQLException e) {

        //} catch (IOException | FileNotFoundException e) { // compile error, because FileNotFoundException subclass of IOException
            System.err.println("");
        }
    }

    private static void testThrows() throws SQLException, IOException {
        System.out.println("testThrows");
    }
}
