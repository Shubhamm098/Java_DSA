package com.shubham;

import java.util.Scanner;

public class upper_lower_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char str = in.next().trim().charAt(0);
        if(str>=65 && str<91){
            System.out.println("its an upper case char");
        }
        else if (str>=97 && str<122){
            System.out.println("Its an lower case char");
        }
    }
}
