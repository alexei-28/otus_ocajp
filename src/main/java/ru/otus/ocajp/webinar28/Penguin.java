package ru.otus.ocajp.webinar28;

public class Penguin {
    public int size = 33;

    public int getHeight() {
        return 3;
    }

    public void printInfo() {
        System.out.println("Penguin.printInfo, getHeight = " + this.getHeight());

        // compile error because in class Object not exist method getHeight()
        //System.out.println("printInfo, getHeight = " + super.getHeight());
    }

    public static int getHeight2() {
        return 3;
    }

    public void printInfo2() {
        // Compiler replace "this" by "Penguin.getHeight2()" because "getHeight2()" is static method.
        // Static method can't override. It can be only hide.
        System.out.println("printInfo2, getHeight = " + this.getHeight2());
    }
}
