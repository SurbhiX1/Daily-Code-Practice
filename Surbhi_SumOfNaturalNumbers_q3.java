import java.util.*;
public class Surbhi_SumOfNaturalNumbers_q3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers = "+ sum);
    }
}
