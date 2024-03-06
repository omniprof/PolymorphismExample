package com.cejv416.polymorphismexample.inheritance;

/**
 * A subclass that inherits a superclass for a demo of polymorphism
 *
 * @author omniprof
 */
public class InheritanceSubClass extends InheritanceSuperClass {

    /**
     * Method that only exists in this subclass
     */
    public void doSomething01() {
        super.doSomething01();
        System.out.println("SubClass - doSomething01");
    }

    /**
     * 
     * Method that only exists in this subclass
     */
    public void doSomething02() {
        super.doSomething02();
        System.out.println("SubClass - doSomething02");
    }

    /**
     * This method is overriding a method with the same name in the superclass.
     * You do not need to override superclass methods. If commented out then the
     * superclass method is called.
     */
    @Override
    public void doInheritOverride() {
        System.out.println("SubClass - doInheritOverride");
    }

}
