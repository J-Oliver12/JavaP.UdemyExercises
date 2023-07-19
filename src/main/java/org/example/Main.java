package org.example;

public class Main {
    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;

        double sum = ((var1 + var2) * 100);
        System.out.println("\nMy values total = " +sum);

        double mod = sum % 40.00;
        System.out.println("\nThe remainer is = " +mod);

        boolean zero = (mod == 0) ? true : false;

        if (!zero) {
            System.out.println("Got some remainer");
        }

        System.out.println("\nGot no remainer= " +zero);





    }
}