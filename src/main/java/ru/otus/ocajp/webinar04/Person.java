package ru.otus.ocajp.webinar04;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


/*- Compile error: Class 'PersonPublic' is public, should be declared in a file named 'PersonPublic.java'
public class PersonPublic {
}
 */

// OK because access modifier of class is default(private package)
class PersonDefault {
}

