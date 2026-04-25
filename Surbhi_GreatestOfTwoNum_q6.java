import java.util.*;
public class Surbhi_GreatestOfTwoNum_q6 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the two numbers :");
        a = in.nextInt();
        b = in.nextInt();
        int res = a > b ? a : b;
        System.out.println("Greatest number is : "+res);
    }
}
