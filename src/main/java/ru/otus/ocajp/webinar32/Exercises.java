package ru.otus.ocajp.webinar32;

public class Exercises {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
            //System.err.print("unreachable"); // выброс исключения ведёт к недоступности последующих строк кода
        } catch (Error e) {
            System.err.print("catch");
        } finally {
            System.err.print("finally");
        }
        System.err.print("end");
    }

    public static void main2(String[] args) throws Exception {
        try {
            throw new RuntimeException();
        } catch (Error e) {
            throw new Exception();
        } finally {
            System.err.print("finally");

        }
        //System.err.print("unreachable");
    }

    public static void main3(String[] args) throws Exception {
        try {
            throw new RuntimeException();
        } catch (Error e) {
            throw new Exception();
        } catch (NumberFormatException e) {
            //throw new Exception();
        } finally {
            System.err.print("finally");
        }
        System.err.print("end");
    }

    public static void main4(String[] args) throws Exception {
        try {
            throw new RuntimeException();
        } catch (Error | NumberFormatException e) { // multi-catch
            throw new Exception();
        } finally {
            System.err.print("finally");
        }
        //System.err.print("unreachable");
    }

    public static void main5(String[] args) throws Exception {
        try {
            //throw new RuntimeException();
        } catch (Error | NumberFormatException e) {
            throw new Exception();
        } finally {
            System.err.print("finally");
        }
        System.err.print("end");
    }

    public static void main6(String[] args) {
        try {
            //throw new RuntimeException();
        } catch (Error | NumberFormatException e) {
            //throw new Exception();
        } finally {
            throw new RuntimeException();
        }
        //System.err.print("unreachable");
    }

    public static void main7(String[] args) throws Exception {
        try {
            return;
        } catch (Error e) {
            return;
        } catch (NumberFormatException e) {
            return;
        } finally {
            System.err.print("finally");
        }
        //System.err.print("unreachable");
    }

    public static void main8(String[] args) throws Exception {
        try {
            //return;
        } catch (Error e) {
            //return;
        } catch (NumberFormatException e) {
            //return;
        } finally {
            return;
        }
        //System.err.print("unreachable");
    }
}
