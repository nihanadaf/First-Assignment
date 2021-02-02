
import java.util.Scanner;
public class Reverse_Number {
   public static void main(String args[]) {
      int d, number,temp, revnum = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      number = sc.nextInt();
      temp = number;
      while (temp >0) {
         d = temp %10;
         revnum = (revnum*10)+d;
         temp = temp/10;
      }
      System.out.println("Reverse of the given number is:"+revnum);
   }
}
