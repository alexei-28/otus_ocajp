package ru.otus.ocajp.webinar27;

/*-
    A virtual method is a method in which the specific implementation is not determined until runtime.
    In fact, all non-final, non-static, and non-private Java methods are considered virtual methods, since any of them can
    be overridden at runtime.
 */
public class VirtualMethodChild extends VirtualMethodParent {

    // Virtual mathod
    public String getName() {
        return "VirtualMethodChild";
    }

    /*-
        In other words, even though the parent class VirtualMethodParent defines its own version of getName()
        and doesn't know anything about the VirtualMethodChild class during compile-time, at runtime the
        instance uses the overridden version of the method, as defined on the instance of the object.
        We emphasize this point by using a reference to the VirtualMethodParent class in the main() method,
        although the result would have been the same if a reference to VirtualMethodChild was used.
     */
    public static void main(String[] args) {
        VirtualMethodParent virtualMethodParent = new VirtualMethodChild();
        virtualMethodParent.displayInformation(); // The bird name is: VirtualMethodChild
    }
}
