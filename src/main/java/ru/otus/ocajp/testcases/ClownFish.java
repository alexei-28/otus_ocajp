package ru.otus.ocajp.testcases;

public class ClownFish implements  Aquatic {
    public String getNumber() {
        return "4";
    }

    /*- Compile error: return type String is not compatible with int (in Aquatic)
    public String getNumber(int input) {
        return "9";
    }
     */

}
