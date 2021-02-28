package ru.otus.ocajp.webinar29;

// compile error
// error: doIt() in MyClass cannot implement doIt() in MyInterfaceB
//public abstract  class MyClass implements MyInterfaceA, MyInterfaceB {

public class MyClass extends Object implements MyInterfaceA, MyInterfaceC {

    @Override
    public int doIt() {
        return 0;
    }
}
