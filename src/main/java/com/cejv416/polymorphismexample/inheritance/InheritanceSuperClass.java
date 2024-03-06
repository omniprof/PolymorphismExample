package com.cejv416.polymorphismexample.inheritance;

/**
 * This is a simple class that will be the superclass for this demonstration of
 * polymorphism
 *
 * @author omniprof
 */
public abstract class InheritanceSuperClass {

    public void doSomething01() {
        System.out.println("InheritanceSuperClass - doSomething01");
    }

    /**
     * Method only in this class and not in the interface
     */
    public void doSomething02() {
        System.out.println("InheritanceSuperClass - doSomething02");
    }
    
    
    /**
     * This method is not overridden in the subclass
     */
    public void doInheritanceMethod() {
        System.out.println("SuperClass - doInheritanceMethod");
    }

    /**
     * This method is overridden in the subclass. It is not required to be
     * overridden.
     */
    public abstract void doInheritOverride(); // {
//        System.out.println("SuperClass - doInheritOverride");
//    }
}
