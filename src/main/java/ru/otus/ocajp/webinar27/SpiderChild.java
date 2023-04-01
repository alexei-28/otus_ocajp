package ru.otus.ocajp.webinar27;

public class SpiderChild extends ArthropodParent {

    // The printName() method is an overload in SpiderChild, not an override, so both methods may be called
    public void printName(int input) {
        System.out.print("Spider");
    }

    public static void main(String[] args) {
        SpiderChild spider = new SpiderChild();
        spider.printName(4);

        spider.printName(9.0);
    }
}
