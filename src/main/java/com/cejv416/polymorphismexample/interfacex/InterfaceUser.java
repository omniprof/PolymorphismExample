package com.cejv416.polymorphismexample.interfacex;

/**
 * This is a class that implements an interface. It is required to override all
 * methods in the interface class.
 *
 * @author omniprof
 */
public class InterfaceUser implements InterfaceClass {

    /**
     * Method only in this class and not in the interface
     */
    public void doSomething01() {
        System.out.println("Interface - doSomething01");
    }

    /**
     * Method only in this class and not in the interface
     */
    public void doSomething02() {
        System.out.println("Interface - doSomething02");
    }

    /**
     * This is the method you are required to override as it appears in the
     * interface class
     */
    @Override
    public void doInterfaceMethod() {
        System.out.println("Override Interface - doInterfaceMethod");
    }

}
