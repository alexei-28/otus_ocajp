package ru.otus.ocajp.webinar03;

import ru.otus.ocajp.webinar28.C;

public class MyClass {
    public static String myStaticField;
    public String myNonStaticField;
    private MyClass2 myClass2 = new MyClass2();

    public MyClass() {
        System.out.println("Create MyClass");
        System.out.println(MyClass.myStaticField);
        System.out.println(MyClass.myStaticField);
        System.out.println(this.myStaticField); // can access to static field via "this"
        System.out.println(myClass2.myStaticField2);// can access to static field(myStaticField2) via reference (myClass2)
        System.out.println("done");
    }
}
