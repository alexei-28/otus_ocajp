package ru.otus.ocajp.webinar27;

/*-
 OK.
 Потому что теперь мы сами прописали конструктор, который вызывает тот родительский конструктор (super(int)),
 который ему доступен. И ошибки нет.
 */
public class MyChild2 extends MyParent {

    public MyChild2() {
        // If comment super(10) then compile error: There is no default constructor available in 'MyParent'
        super(10);
        System.out.println("MyChild2 constructor without param");
    }
}
