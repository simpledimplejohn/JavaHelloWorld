package com.company.examples;

public class LoopsExamples {
    /**
     * an example of a for loop,
     * signature whatever parameters are and whatever it returns
     */
    char[] charArray = { 'a', 'b', 'c', 'd', 'e'};

    public void forLoopForward() {
        for(int i = 0; i < charArray.length; i ++) {
            System.out.printf("i is: %d ", i);
            System.out.printf("array is: %c %n", charArray[i]);
        }
    }
    public void forLoopBackwards() {
        for(int i = charArray.length - 1; i >= 0; i --) {
            System.out.println("revs: " + i + " " + charArray[i]);
        }
    }


}
