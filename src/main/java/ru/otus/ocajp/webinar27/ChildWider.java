package ru.otus.ocajp.webinar27;

public class ChildWider extends ParentNarrow {

    /*-
     The method in the child class must be at least as accessible or more accessible than the method in the parent class.
    @Override
    protected void method1() { // compile error: attempting to assign weaker access privileges; was public
        System.out.println("ChildWider: method1");
    }
     */

    public void method1() {
        System.out.println("ChildWider: method1");
    }

    public static void main(String[] args) {
        System.out.println("Entry point ChildWider");
        new ChildWider().method1();
    }

}
