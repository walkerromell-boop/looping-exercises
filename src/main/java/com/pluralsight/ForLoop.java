package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{
        for (int count = 10; count>=0; count--) //do not add semi colon

            System.out.println(count);
        System.out.println("Launch");
        Thread.sleep(1000);
    }
}
