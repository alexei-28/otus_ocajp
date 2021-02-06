package ru.otus.ocajp.homework23.pond.goose;

import ru.otus.ocajp.homework23.pond.shore.Bird;

public class Goose extends Bird {

    public void helpGooseSwim() {
        Goose otherGoose = new Goose();
        otherGoose.floatInWatcher(); // success access to protected method from superclass
        System.out.println(otherGoose.text); // success access to protected property from superclass
    }

    // Класс(Bird) инстанцированный вне своего пакета и хочет обратиться к своему же protected члену.
    // Bird и не наследник и не в том же пакете -> compile error
    public void helpOtherGooseSwim() {
        // Bird и не наследник(Bird) и не в том же пакете -> compile error
        Bird otherBird = new Goose(); // Компилятор видит левую часть(Bird)
        // otherBird.floatInWatcher();// compile error - Компилятор видит левую часть(Bird)
        // System.out.println(otherBird.text); // compile error - Компилятор видит левую часть(Bird)
        ((Goose) otherBird).floatInWatcher();// Компилятор видит левую часть(Goose) - OK
        System.out.println(((Goose)otherBird).text); // Компилятор видит левую часть(Goose) - OK
        String str = "";
    }
}
