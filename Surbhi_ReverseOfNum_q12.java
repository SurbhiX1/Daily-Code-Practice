import java.util.*;
public class Surbhi_ReverseOfNum_q12 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        int rev = 0;
        while(num != 0){
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        System.out.println("Reverse : "+rev);
    }
}
