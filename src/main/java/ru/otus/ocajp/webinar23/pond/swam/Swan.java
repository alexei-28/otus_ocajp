package ru.otus.ocajp.webinar23.pond.swam;

import ru.otus.ocajp.webinar23.pond.shore.Bird;

public class Swan extends Bird {

    public void swim() {
        // Swam не в том пакете, но наследник -> OK
        floatInWatcher(); // subclass(Swan) has access to protected method "floatInWatcher()" of superclass(Bird) - OK
        System.out.println(text); // subclass(Swan) has access to protected property "text" of superclass(Bird) - OK
    }

    public void helpOtherSwanSwim() {
        // Swam не в том пакете, но наследник -> OK
        Swan otherSwan = new Swan();
        otherSwan.floatInWatcher(); // subclass(Swan) access to superclass(Bird) - OK
        System.out.println(otherSwan.text); // subclass(Swan) access to superclass(Bird) - OK
    }

    // Класс(Bird) инстанцированный вне своего пакета и хочет обратиться к своему же protected члену.
    // Bird и не наследник(Bird) и не в том же пакете -> compile error
    // Для protected доступа важно из какого класса(Swan) вызывается protected метод "floatInWatcher()"
    public void helpOtherBirdSwim() {
        Bird otherBird = new Bird();
        // otherBird.floatInWatcher(); // compile error. No access to protected method "floatInWatcher()" from another package
        // System.out.println(otherBird.text); // compile error. No access to protected property "text" from another package
    }

}
