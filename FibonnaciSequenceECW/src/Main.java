/* Programmer Name: Evan Campbell-Weiner
   Program Name: Fibonnaci Sequence Timer
   Program Created: 2/2/19
   Program Last Updated:2/2/19

   Program Description:
   Create a program that will output the values of the fibonnaci sequence, using both iterative
   and recursive methods, up to the nth value as inputted by the user. The program should
   also time both methods and output results so the user can see which is faster.

   Data Dictionary:
 */
import java.io.Console;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        int n, fibNum1=0, fibNum2=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the nth value of the fibonnaci sequence\nyou wish for the program to write up to:");
        n=sc.nextInt();
        if (n<=0){
            do{
                System.out.println("You entered an invalid number. Please make sure the number is positive.");
                System.out.println("Please enter the nth value of the sequence:");
                n=sc.nextInt();
            }
            while(n<=0);
        }
        fiboSerieRec(n, fibNum1, fibNum2);

    }
    public static void fiboSerieRec(int n, int fibNum1, int fibNum2){
        int fibHold=fibNum2;
        if (fibNum1==0) {
            System.out.print(fibNum1 + " ");
        }
        if(n>1){
            System.out.print(fibNum2+" ");
            fibNum2=fibNum1+fibNum2;
            n--;
            fibNum1=fibHold;
            fiboSerieRec(n,fibNum1,fibNum2);
        }

    }
}

