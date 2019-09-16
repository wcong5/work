package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[][] a = new Integer[][] {{2,5,3,4},{1,6,4,2},{3,1,1,4},{2,6,5,1}};
        Integer[][] b = new Integer[][] {{1,1,0,1},{0,2,1,3},{1,2,1,2},{3,2,4,7}};
        IntegerMatrix im = new IntegerMatrix();
        System.out.println("\na + b = ");
        GenericMatrix.printResult(a, b, im.addMatrix(a, b), '+');
        System.out.println("\na * b = ");
        GenericMatrix.printResult(a, b, im.multiplyMatrix(a, b), '*');



    }
}