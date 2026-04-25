import java.util.*;
public class Surbhi_PrimeInRange_q10 {
    static int CheckPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the start of range : ");
        int start = in.nextInt();
        System.out.print("Enter the end of range : ");
        int end = in.nextInt();
        System.out.println("Prime Numbers in the range from "+start+ " to "+end);
        for(int i = start; i <= end; i++){
            if (CheckPrime(i) == 1){
                System.out.print(i+", ");
            }
        }
    }
}
