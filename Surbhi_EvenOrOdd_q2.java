import java.util.*;
public class Surbhi_EvenOrOdd_q2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        String s = num % 2 == 0 ? "Number is Even" : "Number is Odd";
        System.out.println(s);
    }
}
