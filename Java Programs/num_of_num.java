package com.shubham;

import java.util.Scanner;

public class num_of_num {
    public static void main(String[] args) {
        System.out.println("enter the number and the digit you want to find");
        Scanner inp = new Scanner(System.in);
        long num = inp.nextLong();
        int dig = inp.nextInt();
        int count=0;
        while(num != 0){
        long rem = num % 10;
        if(rem==dig){
            count++;
        }
            num = num/10;
        }
        System.out.println(count);
    }
}
