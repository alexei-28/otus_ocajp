package ru.otus.ocajp.webinar27;

public class SpiderChild extends ArthropodParent {
    public void printName(int input) { // override method
        System.out.print("Spider");
    }

    public static void main(String[] args) {
        SpiderChild spider = new SpiderChild();
        spider.printName(4);
        spider.printName(9.0); // override method
    }
}
