package ru.otus.ocajp.webinar27;

public class PlatypusChild extends MammalParent {
    public PlatypusChild() {
        super(1);// without super(1) will be compile error: constructor MammalParent in class MammalParent cannot be applied to given types
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new MammalParent(5);
    }
}
