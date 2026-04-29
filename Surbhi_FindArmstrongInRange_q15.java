import java.util.*;
public class Surbhi_FindArmstrongInRange_q15 {
    static int checkarmstrong(int num){
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
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the starting of range : ");
        int m = in.nextInt();
        System.out.print("Enter the ending of range : ");
        int n = in.nextInt();
        System.out.println("Armstrong numbers are : ");
        for(int i = m; i<=n; i++){
            int res = checkarmstrong(i);
            if(res == 1){
                System.out.print(i + ", ");
            }
        }
    }
}
