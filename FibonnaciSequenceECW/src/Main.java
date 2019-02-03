/* Programmer Name: Evan Campbell-Weiner
   Program Name: Fibonnaci Sequence Timer
   Program Created: 2/2/19
   Program Last Updated:2/2/19

   Program Description:
   Create a program that will output the values of the fibonnaci sequence, using both iterative
   and recursive methods, up to the nth value as inputted by the user. The program should
   also time both methods and output results so the user can see which is faster.

   Data Dictionary (main Method):
   n : long variable that will hold the value the user enters to say how many values of the sequence they want
   fibNum1 : long variable used to send to the fiboRecSerie method that will hold the starting value
   fibNum2 : long variable used to send to the fiboRecSerie method that will hold the second starting value

    Note: Code for "totalTime, beginTime and lastTime" was taken from the example in class made by Prof. Alaadin Addas
 */
//Import scanner
import java.util.Scanner;
//Declare Main class
public class Main {
    //Declare main method
    public static void main(String args[]) {
        //Declare the variables
        long n, fibNum1=0, fibNum2=1;
        //
        Scanner sc = new Scanner(System.in);
        //ask for the nth value
        System.out.print("Please enter the nth value of the fibonnaci sequence\nyou wish for the program to write up to:");
        //get the nth value
        n=sc.nextInt();

        //error check the nth value
        if (n<=0){
            do{
                System.out.println("You entered an invalid number. Please make sure the number is positive.");
                System.out.println("Please enter the nth value of the sequence:");
                n=sc.nextInt();
            }
            while(n<=0);
        }
        //declare startTime
        long beginTime=System.nanoTime();
        //Output recursion layout, then call fiboSerieRec
        System.out.println("Recursion:");
        fiboSerieRec(n, fibNum1, fibNum2);
        //declare lasttime
        long lastTime = System.nanoTime();
        //calculate totalTime
        long totalTime=lastTime-beginTime;
        //output the length of time
        System.out.println("\nThe Length of time for Recursion (nanoseconds) was: "+ totalTime);

        //set start time
        beginTime=System.nanoTime();

        //output Iteration layout, call fiboSerieIte
        System.out.println("\nIteration:");
        fiboSerieIte(n);
        //set lastTime
        lastTime = System.nanoTime();
        //output length of time
        totalTime=lastTime-beginTime;
        System.out.println("\nThe Length of time for iteration (nanoseconds) was: "+ totalTime);

    }
    //Function Name: fiboSerieRec
    //Function Description: Calculate the fibonacci series recursively based off of the
    //value inputted by the user.
    //Data Dictionary:
    //n : a long parameter that holds the number of entries in the series we do.
    //fibNum1: a long parameter that holds the initial value, and first value to be added.
    //fibNum2: a long parameter to hold the second initial value, and the second values added, and the value outputted.
    //fibHold: a long variable to temporarily hold the num2 so its never overwritten.
    public static void fiboSerieRec(long n, long fibNum1, long fibNum2){
        long fibHold=fibNum2;
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
    //n : an long parameter that holds the number of entries in the series we do.
    //fibNum1: a long variable that holds the initial value, and first value to be added.
    //fibNum2: a long variable to hold the second initial value, and the second values added, and the value outputted.
    //fibHold: an long variable to temporarily hold the num2 so its never overwritten.
    private static void fiboSerieIte(long n){
       long fibNum1=0; long fibNum2=1; long fibHold;
       System.out.print(fibNum1 + " ");
        for(long i=n; i>1; i--){
            System.out.print(fibNum2 + " ");
            fibHold=fibNum2;
            fibNum2=fibNum1+fibNum2;
            fibNum1=fibHold;
        }
    }
}
