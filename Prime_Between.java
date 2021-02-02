import java.util.Scanner;
 

public class Prime_Between {
 
   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, i, j, flag;
 
      
        System.out.printf("Enter the lower bound : ");
        a = sc.nextInt();
 

        System.out.printf("\nEnter upper bound : ");
        b = sc.nextInt(); 
 
        // Printing result
        System.out.printf("\nPrime numbers between %d and %d are: ", a, b);
 
      
        for (i = a; i <= b; i++) {
 
           
            if (i == 1 || i == 0)
                continue;
 
                       flag = 1;
 
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
 
            // flag = 1 -> i is prime
            // flag = 0 -> i is not prime
            if (flag == 1)
                System.out.println(i);
        }
    }
}
