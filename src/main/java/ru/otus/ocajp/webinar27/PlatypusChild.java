package ru.otus.ocajp.webinar27;

/*-
  The code will not compile because the parent class MammalParent doesn't define a no-argument constructor,
  so the first line of a PlatypusChild constructor should be an explicit call to super(int age).
 */
public class PlatypusChild extends MammalParent {
    public PlatypusChild() {
        super(1);
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new MammalParent(5);
    }
}
