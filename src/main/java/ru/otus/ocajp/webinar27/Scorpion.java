package ru.otus.ocajp.webinar27;

public class Scorpion extends Arachnid {
    static {
        sb.append("q");
    }
    {
        sb.append("m");
    }

    public static void main(String arg[]) {
        System.out.print(Scorpion.sb + " ");
        System.out.print(Scorpion.sb + " ");
        new Arachnid();
        new Scorpion();
        System.out.println(Scorpion.sb); // uq uq uqcrcrm
    }
}
