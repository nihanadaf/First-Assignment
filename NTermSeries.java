
import java.util.Scanner;
public class NTermSeries {

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); 
     int n,i=1;
     System.out.println("Enter the range of number to print the series : ");
     n=sc.nextInt();
     while(i<=n)
     {
      System.out.print(i*i*i+" ");
      i++;
      }
      sc.close();
 }
}