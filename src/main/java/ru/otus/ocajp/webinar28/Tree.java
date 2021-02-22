package ru.otus.ocajp.webinar28;

public abstract class Tree {

    // If comment this method "grow()" then compile error on "tree.grow()"
    private void grow() {
        System.out.println("Tree is growing");
    }

    public static void main(String args[]) {
        Tree tree = new Oak();// Tree - reftype, Oak - actype
        tree.grow(); // print "Tree is growing" -> because "grow()" is private method and it is can not be override.

        // tree.grow(); // compile error if comment method "grow()"
        // Методы ВСЕГДА берутся из reftype(то что слева).
        // Потом они подменяются на actype(то что справа) если методы переопределены.
        // На этапе компиляции смотрим на reftype.
    }
}
