import java.util.*;
public class Surbhi_SumOfNumInRange_q5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num1, num2,sum = 0;
        System.out.println("Enter the starting number : ");
        num1 = in.nextInt();
        System.out.println("Enter the ending number : ");
        num2 = in.nextInt();
        for(int i = num1; i <= num2; i++){
            sum += i;
        }
        System.out.println("Sum: "+sum);
    }
    
}
