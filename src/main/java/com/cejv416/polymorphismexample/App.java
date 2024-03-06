package com.cejv416.polymorphismexample;

import com.cejv416.polymorphismexample.inheritance.InheritanceSuperClass;
import com.cejv416.polymorphismexample.inheritance.InheritanceSubClass;
import com.cejv416.polymorphismexample.interfacex.InterfaceUser;
import com.cejv416.polymorphismexample.interfacex.InterfaceClass;

/**
 * This is an example of how polymorphism works when employing Inheritance or
 * Interface.
 *
 * @author omniprof
 */
public class App {

    /**
     * Demonstrate how inheritance and interface works
     */
    public void perform() {
        // Instantiate an object of the subclass and assign the reference to a 
        // superclass reference 
        InheritanceSubClass inheritEx = new InheritanceSubClass();
        
        inheritEx.doSomething01();
        inheritEx.doSomething02();
        polyInherit(inheritEx);

        // Instantiate an object of a class that implements an interface to a 
        // reference to the interface class.
        InterfaceUser interEx = new InterfaceUser();
        polyInterface(interEx);
    }

    /**
     * This method declares that it will receive a reference to a super class.
     * It can also accept a reference to a subclass and any methods that you
     * override from the super class will be called instead of the super class
     * version.
     *
     * @param ix Any class that extends InheritanceSuperClass
     */
    public void polyInherit(InheritanceSuperClass ix) {
        ix.doInheritanceMethod();
        ix.doInheritOverride();
    }

    /**
     * Any class that implements the interface can be passed to this method.
     * Only methods declared in the Interface and implemented in the
     * implementing class can be called.
     *
     * @param ix A class that implements the InterfaceClass
     */
    public void polyInterface(InterfaceClass ix) {
        ix.doInterfaceMethod();
    }

    /**
     * Where it all begins
     *
     * @param args
     */
    public static void main(String... args) {
        new App().perform();
    }
}
