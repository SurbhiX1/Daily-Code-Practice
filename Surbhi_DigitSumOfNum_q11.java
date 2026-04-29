import java.util.*;
public class Surbhi_DigitSumOfNum_q11 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        int sum = 0;
        while(num != 0){
            int r = num % 10;
            sum += r;
            num = num / 10;
        }
        System.out.println("Sum of digits : "+sum);
    }
}
