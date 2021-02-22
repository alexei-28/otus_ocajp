package ru.otus.ocajp.webinar28;

public class Child2 extends Parent2 {
    String str = " Hi! ";

    // overriding method
    void greet() {
        //System.out.print("Child2.greet() ");
        System.out.print(str);
    }

    public static void main(String[] args) {
        Parent2 obj = new Child2(); // Parent2 - reftype, Child2 - actype
        obj.greet(); // print Hi!

        // Result print "null Hi!"
    }
}
