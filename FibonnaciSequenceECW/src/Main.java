/* Programmer Name: Evan Campbell-Weiner
   Program Name: Fibonnaci Sequence Timer
   Program Created: 2/2/19
   Program Last Updated:2/2/19

   Program Description:
   Create a program that will output the values of the fibonnaci sequence, using both iterative
   and recursive methods, up to the nth value as inputted by the user. The program should
   also time both methods and output results so the user can see which is faster.

   Data Dictionary (main Method):
   n : integer variable that will hold the value the user enters to say how many values of the sequence they want
   fibNum1 : integer variable used to send to the fiboRecSerie method that will hold the starting value
   fibNum2 : integer variable used to send to the fiboRecSerie method that will hold the second starting value

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
        System.out.println("Recursion:");
        fiboSerieRec(n, fibNum1, fibNum2);
        System.out.println("\nIteration:");
        fiboSerieIte(n);

    }
    //Function Name: fiboSerieRec
    //Function Description: Calculate the fibonacci series recursively based off of the
    //value inputted by the user.
    //Data Dictionary:
    //n : an integer parameter that holds the number of entries in the series we do.
    //fibNum1: an integer parameter that holds the initial value, and first value to be added.
    //fibNum2: an integer parameter to hold the second initial value, and the second values added, and the value outputted.
    //fibHold: an integer variable to temporarily hold the num2 so its never overwritten.
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
    //Function Name: fiboSerieIte
    //Function Description: Calculate the fibonacci series iteratively based off of the
    //value inputted by the user.
    //Data Dictionary:
    //n : an integer parameter that holds the number of entries in the series we do.
    //fibNum1: an integer variable that holds the initial value, and first value to be added.
    //fibNum2: an integer variable to hold the second initial value, and the second values added, and the value outputted.
    //fibHold: an integer variable to temporarily hold the num2 so its never overwritten.
    public static void fiboSerieIte(int n){
       int fibNum1=0; int fibNum2=1; int fibHold;
       System.out.print(fibNum1 + " ");
        for(int i=n; i>1; i--){
            System.out.print(fibNum2 + " ");
            fibHold=fibNum2;
            fibNum2=fibNum1+fibNum2;
            fibNum1=fibHold;
        }
    }
}

