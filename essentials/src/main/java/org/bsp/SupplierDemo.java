package org.bsp;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hi BSP";
        System.out.println(supplier.get());
    }
}
