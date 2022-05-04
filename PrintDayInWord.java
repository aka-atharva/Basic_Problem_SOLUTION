//Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday” if the int variable "dayNumber" is 0, 1, ..., 6, respectively.  
Otherwise, it shall print "Not a valid day". Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.

package com.company;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("day of week");
        int week = sc.nextInt();

        if (week==1){
            System.out.println("monday");

        }
        else if (week==2){
            System.out.println("tuesday");
        }
        else if (week==3){
            System.out.println("Wednesday");
        }
        else if (week==4){
            System.out.println("Thusday");
        }
        else if (week==5){
            System.out.println("friday");
        } else if (week==6) {
            System.out.println("saturday");
        } else if (week==7) {
            System.out.println("Sunday");
        }
        else{
            System.out.println("not a valid day!!!!!!!!!!!");
        }
        switch(week) {
            case 1:
                System.out.println("monday");
                break;  // Don't forget the "break" after each case!
            case 3:
                System.out.println("Wednesday" );
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
            case 2:
                System.out.println("tuesday");
            default: System.out.println( "Not a valid day!!!!!!!!!!!");
        }
    }
}
