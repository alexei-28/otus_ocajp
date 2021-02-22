package ru.otus.ocajp.webinar28;

public class Panda extends Bear {
    // Hiding static method "eat()" in Bear.
    // Метод становится скрытым(hiding), когда дочерний класс определяет статический метод
    // с тем же именем и сигнатурой, как у наследуемого статического метода, определённого в родительском классе.
    public static void eat() {
        System.out.println("Panda eat");
    }

    // Hiding of static method eat2().
    // Compile error: error: eat2() in Panda cannot override eat2() in Bear
    // Must return same type "int".
    /*-
    public static double eat2() {
        return 2;
    }
    */

    // Compile error because in parent has final static method.
    // Final method can't be overriding or hidden.
    // compile error: eat3() in Panda cannot override eat3() in Bear
    /*-
    public static final int eat3() {
        return 3;
    }
     */

    // Hiding static method.
    public static void someStaticMethod() {
        System.out.println("Panda someStaticMethod");
    }

    // Method that accepts java.lang.Object can accept any variable since all objects inherit java.lang.Object.
    // This also includes primitives, which can be autoboxed to their wrapper classes.
    public void someMethod(Object obj) {
        System.out.println("someMethod: obj = " + obj);
    }

    public static void main(String[] args) {
        eat();
        int i = 2;
        new Panda().someMethod(i);
    }
}
