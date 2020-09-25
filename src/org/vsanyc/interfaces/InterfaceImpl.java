package org.vsanyc.interfaces;

public class InterfaceImpl implements Interface1, Interface2 {

    @Override
    public String defaultMethod() {
        Interface1.super.defaultMethod();
        System.out.println("InterfaceImpl.defaultMethod");

        return "InterfaceImpl";
    }

    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();
        impl.defaultMethod();
    }
}
