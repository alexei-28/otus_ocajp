package ru.otus.ocajp.webinar29;

import java.util.List;

/*-
    Since the class is declared as abstract, it does not need to implement all abstract method
    declarations defined in these interfaces.
 */
// Abstract class can't implements method of interface MyInterfaceA
abstract class MyAbstractClass implements MyInterfaceA {

    // Abstract class can contain constructor
    public MyAbstractClass() {
        System.out.println("MyAbstractClass: constructor");
    }

    abstract protected List someAbstractMethod(int age);
}
