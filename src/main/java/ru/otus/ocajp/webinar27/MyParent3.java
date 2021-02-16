package ru.otus.ocajp.webinar27;

public class MyParent3 {

    // If one more constructor than compile error in MyChild constructor when try to call "super()".
    // Because after add new constructor not exist default constructor (without arguments)
    MyParent3() {
        System.out.println("MyParent3 constructor");
    }
}
