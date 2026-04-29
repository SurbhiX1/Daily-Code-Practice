import java.util.*;
public class Surbhi_CheckArmstrongNum_q14 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check armstrong : ");
        int num = in.nextInt();
        int m = num;
        int dig = 0;
        while(m!=0)
        {
            m = m /10;
            dig++;
        }
        m = num;
        int sum = 0;
        while(m!=0){
            int r = m % 10;
            sum += Math.pow(r,dig);
            m = m/10;
        }
        if(sum == num){
            System.out.println("Number is Armstrong.");
        }
        else{
            System.out.println("Number is not Armstrong.");
        }
    }
    
}
