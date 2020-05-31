/*
Project: Lab 4 Solo Work Java Iterator using IntelliJ: for, while, do while, for each
Purpose Details: for, while, do while, for each
Course: IST 242
Author: Aneta ODonnell
Date Developed: 2/1/2020
Last Date Changed:
Rev:
*/

package edu.psu.abington.ist.ist242;

public class Main {

    public static void main(String[] args) {
        // args[0] = 4; args[1] = 3; args[2] = 5
        // (counter; condition; and increment)

        // SECTION 1 ---------------------------------------------------------------------------------------------------
        /* Create a for loop iteration structure:
        loop the number of times of args[0] passed in,
        printing the counter value each time to the command line.
        FOR LOOP: used when the number of iterations is known,
        and then repeatedly execute a block of code as long as those
        conditions are met.
         */
        int i = 1;

        for (i = 1; i <= Integer.parseInt(args[0]); i++)   // args [0] = 4;
        {
            System.out.println("for Loop counter: " + i);
        }

        System.out.println(" ");




        // SECTION 2 ---------------------------------------------------------------------------------------------------
        /*Create while loop iteration structure:
        loop the number of times of args[1] that was passed in,
        printing the counter value each time to the command line

        WHILE LOOP: loop with a test at the top,
        while a condition is valid, keep looping.
         */
        int j = 1;

        // statement reads - Exit when j becomes greater than args 1 = 3
        while (j <= Integer.parseInt(args[1])) { // args [1] = 3
            System.out.println("While Loop counter: " + j); // printing "While loop counter: and whatever j is
            j++; // incrementing j
        }

        System.out.println(" ");





        // SECTION 3 ---------------------------------------------------------------------------------------------------
        /* Create a do loop iteration structure:
        loop the number of times of args[2] that was passed in,
        printing the counter value each time to the command line

        DO WHILE: loop with the test at the bottom, rather than the more usual test at the top
        First, the statements are executed, then the condition is tested; if it is true, then the entire loop is executed again.
        */
        int a = 1;

        // do while loop starts with the execution of the statement(s).
        do {
            System.out.println("Do While Loop Counter: " + a); // printing "Do While Loop Counter + whatever k is
            a++; // incrementing k
        }
        /*After the execution of the statements,
        and update of the variable value, the condition is checked for true or false value.
        If it is evaluated to true, next iteration of loop starts.
         */
        while ((a <= Integer.parseInt(args[2]))); // args [2] = 5


        System.out.println(" ");





        // SECTION 4 ---------------------------------------------------------------------------------------------------
        /*Create a for each iteration structure to iterate through the args[]
        array printing the value in each element to the command line screen
        FOR EACH: for (Data_type variable : array)
                        String     arg
                         Int       age
        iterates through each item in the given collection or array (collection),
        stores each item in a variable (item)
        and executes the body of the loop.*/
        System.out.println("The array values are:");
        for (String str : args) {                             // str variable holds the reference of the current element
            System.out.println(str);
        }
    }
}


