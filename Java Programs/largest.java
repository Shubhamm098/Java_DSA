package com.shubham;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        System.out.println("Enter your numbers");

        Scanner inp = new Scanner(System.in);
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int num3 = inp.nextInt();

        int max = Math.max(num3, Math.max(num1, num2));
        System.out.println(max);

//        if(num3 > max) {
//            System.out.println("largest number = "+ num3);
//        }
//        else {
//            System.out.println("largest number = "+ max);
//        }
//

    }
}
