import java.util.*;
class Surbhi_PositiveOrNegative_q1
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter the number:");
        num = in.nextInt();
        if(num == 0){
            System.out.println("Number is Zero");
        }
        else {
            String res = num < 0 ? "Number is Negative" : "Number is positive";
            System.out.println(res);
        }
    }
}