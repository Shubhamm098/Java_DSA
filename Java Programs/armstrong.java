import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner inp  = new Scanner(System.in);
        int num = inp.nextInt();
        boolean ans = arms(num);
        System.out.println(ans);
    }
    static int temp = 0;

    static boolean arms(int num) {
        int y = num;
        while(y != 0){
            int x = y %10;
            temp = temp + x*x*x;
            y = y /10;
        }
        if(temp== num){
            return true;
        }
        else{
            return false;
        }
    }
}




