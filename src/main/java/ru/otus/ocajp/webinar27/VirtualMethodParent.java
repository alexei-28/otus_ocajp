package ru.otus.ocajp.webinar27;

public class VirtualMethodParent {
    public String getName() {
        return "Unknown";
    }
    public void displayInformation() {
        System.out.println("The bird name is: "+getName());
    }
}
