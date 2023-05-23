package OverloadingPackage;

public class Main {
    public static void main(String[] args) {

        Multiplication multiplication = new Multiplication();

        System.out.println(multiplication.multiply(1,5));
        System.out.println(multiplication.multiply(3,7,8));
        System.out.println(multiplication.multiply(45,23,2,6));
        System.out.println(multiplication.multiply(1,2,3,4,5,6));
    }
}
