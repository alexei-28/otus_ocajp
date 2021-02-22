package ru.otus.ocajp.webinar28;

public class EmperorPenguin extends Penguin {
    public int size = 88;

    // overriding
    public int getHeight() {
        //System.out.println("EmperorPenguin.getHeight()");
        return 8;
    }


    public static int getHeight2() {
        return 8;
    }

    /*- if super.getHeight2 is final then compile error: Cannot override FINAL getHeight2() in Penguin
    public final static int getHeight2() {
        return 8;
    }

     */

    /*-
    // override
    public void printInfo() {
        System.out.println("printInfo, getHeight = " + super.getHeight());
     }
     */

    // overriding method
    public void printInfo() {
        System.out.println("EmperorPenguin.printInfo, getHeight = " + getHeight());
    }

    public static void main(String[] args) {
        // Полиморфизм метода.
        // Actype(справа) is class "EmperorPenguin", поэтому метод "printInfo()" выполняется у "EmperorPenguin".
        System.out.println("first");
        new EmperorPenguin().printInfo(); // print -> EmperorPenguin.printInfo, getHeight = 8
        System.out.println("second");
        Penguin penguin = new EmperorPenguin(); // reftype = Pengiun, actype = EmperorPenguin
        penguin.printInfo(); // print -> EmperorPenguin.printInfo, getHeight = 8

        System.out.println();
        // Reftype(слева) = "Penguin", поэтому переменная берется у "Penguin"
        System.out.println("penguin.size = " + penguin.size); // 33

        System.out.println("test static");
        penguin.printInfo2(); // printInfo = 3 because method "getHeight2()" is static
    }
}
