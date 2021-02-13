package ru.otus.ocajp.webinar27;

/*-
 OK.
 Потому что теперь мы сами прописали конструктор, который вызывает тот родительский конструктор (super(int)),
 который ему доступен. И ошибки нет.
 */
public class MyChild2 extends MyParent {

    public MyChild2() {
        super(10);
        System.out.println("MyChild2 constructor with param");
    }
}
