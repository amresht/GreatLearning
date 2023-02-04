/**
 * @task            Read two numbers min and max and Find  even and off between min to max : novice solution
 * @author          Amresh Tripathi
 * @date            4-Feb-2023
 * @version         1.0
 */
import java.util.*;  

public class EvenOddChecker {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter total numbers in series to generate : ");  
        int num= sc.nextInt();  

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        System.out.print(num1 + " " + num2 + " " );
        // Now generate the series
        for (int i=0  ; i<= num;i++) {
            sum = num1 + num2;
            System.out.print(" " + sum );
            num1=num2;
            num2=sum;
        }

    }
}