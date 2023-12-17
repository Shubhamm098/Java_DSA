

import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        int n = 0;
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        while (n < 8){
            int c = a+b;
            if (n==7) {
                System.out.println(c);
            }
            a=b;
            b=c;
            n++;
        }


    }
}
