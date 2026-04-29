import java.util.*;
public class Surbhi_CheckPalindromeNum_q13 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number to check palindrome : ");
        int num = in.nextInt();
        int m = num;
        int rev = 0;
        while(num != 0){
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        if(rev == m){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
