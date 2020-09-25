package org.vsanyc.interfaces;

public interface Interface1 {
    default String defaultMethod() {
        System.out.println("Interface1.defaultMethod()");
        return "";
    }
}
