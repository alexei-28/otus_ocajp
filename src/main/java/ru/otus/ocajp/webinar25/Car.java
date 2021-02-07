package ru.otus.ocajp.webinar25;

public class Car extends Vehicle{
    // Static method can't be override.
    // The static method "getStaticModelName()" hides the static method of the same name in the superclass Vehicle.
    public static String getStaticModelName() {
        return "Car_Toyota";
    }

    // The instance method "getRegNo()" overrides the instance method of the same name in the superclass Vehicle.
    public long getRegNumber() {
        return 54321;
    }
}
