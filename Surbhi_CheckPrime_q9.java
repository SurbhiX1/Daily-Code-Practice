import java.util.*;
public class Surbhi_CheckPrime_q9 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check prime : ");
        int num = in.nextInt();
        int flag = 1;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println(num + " is a Prime Number.");
        }
        else{
            System.out.println(num + " is not a Prime Number.");
        }
    }    
}
