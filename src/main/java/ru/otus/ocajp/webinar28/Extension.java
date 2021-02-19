package ru.otus.ocajp.webinar28;

public class Extension extends Base{

    Extension() {
        add(2);
    }

    void add(int v) {
        System.out.println("Extension.add");
        i += v *2;
    }
}
