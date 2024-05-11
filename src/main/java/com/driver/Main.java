package com.driver;

public class Main {
    public static void main(String[] args) {

        Product p = new Product();

        int result1 = p.product(1,3);
        System.out.println("Result of product(int x, int y): "+result1);

        int result2 = p.product(1,2,3);
        System.out.println("Result of product(int x, int y, int z): "+ result2);

        double result3 = p.product(1.5,2.5);
        System.out.println("Result of product(double x,double y): "+result3);

    }


    public static class Product{
        int x;
        int y;
        int z;

        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }
}