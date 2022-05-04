// Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100. 
// Store 1 and 100 in variables lowerbound and upperbound, so that we can change their values easily.
// Also compute and display the average. The output shall look like:

The sum of 1 to 100 is 5050
The average is 50.5

package com.company;

import java.util.Scanner;

public class SumAverageRunningInt {
    public static void main (String[] args) {
        // Define variables

        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("num");

        int num = scan.nextInt();
        System.out.println("sum");
        int sum =scan.nextInt();        // The accumulated sum, init to 0
        double average;       // average in double
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
            sum += number;     // same as "sum = sum + number"
        }
        // Compute average in double. Beware that int / int produces int!

        // Print sum and average
        System.out.println("Sum = "+sum);
        do {

            sum += num;
            count++;
        } while (count < 5);
        average = sum / 5;
        System.out.println("Average = "+average);
    }
}

