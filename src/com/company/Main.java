package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        main.countNumber(12345);
        main.countNumberByLog(12345);
    }
    public void countNumber(int number) {
        int count = 0;
        while (number> 0) {
            if(number %10 !=0 ) {
                count++;
                number = number/10;
            }
        }
        System.out.println("the total digit is "+count);
    }
    public void countNumberByLog(int n) {
        if(n != 0) {
            int count = (int) Math.floor(Math.log10(n) +1);
            System.out.println("the total digit is "+count);
        }
    }
}
