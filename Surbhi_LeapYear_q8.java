import java.util.*;
public class Surbhi_LeapYear_q8 {
   public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a year to check : ");
    int y = in.nextInt();
    if( y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)){
        System.out.println(y + "is a leap year.");
    }
    else{
        System.out.println(y + " is not a leap year.");
    }
   } 
}
