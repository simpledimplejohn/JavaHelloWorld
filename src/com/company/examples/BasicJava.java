package com.company.examples;

public class BasicJava {
    byte firstByte = 12;
    short firstShort = 32_000;
    int intNum = 69;
    long longNum = 900_000_000;
    float floatNum = 900;
    double doubleNum = 69.96;
    boolean boolVal = true;
    char charVal = 'a';
    String newString = "works";

    public void printBasics() {
//        System.out.println("byte size 8: " + firstByte);
//        System.out.println("short size 16: " + firstShort);
//        System.out.println("int size 32: " + intNum);
//        System.out.println("long size 64: " + longNum);
//        System.out.println("float size 32: " + floatNum);
//        System.out.println("double size 64 " + doubleNum);
//        System.out.println(("boolean size 1: " + boolVal));
//        System.out.println("char size 15: " + charVal);
//        System.out.println("string " + newString);
        int[] nums = {2,9,1,5,8,3,2};
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 8) {
                continue;
            }
            else if (nums[i] == 8) {
                x = i;
                break;
            }
        }
        System.out.println(x);
    }
}

/*
Classes are how we organize our code

 */