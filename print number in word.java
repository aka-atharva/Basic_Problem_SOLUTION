//Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively. 
//Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.


package com.company;

import java.util.Scanner;

public class PrintNumberInWord { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("give number");
    int number = sc.nextInt();  // Set the value of "number" here!

    // Using nested-if
    if (number == 1)   // Use == for comparison
        System.out.println("one" );
     else if (number==2) {
        System.out.println("two");
    } else if (number==3) {
        System.out.println("three");
    } else if (number==4){
        System.out.println("four");
    }else if (number==5){
        System.out.println("five");
    }else if (number==6){
        System.out.println("six");
    }else if (number==7){
        System.out.println("seven");
    }else if (number==8){
        System.out.println("eight");
    }
    else if (number==9){
        System.out.println("nine");
    }
    else {
        System.out.println("out of range!!!!!!!!!!!!! :(8");
    }

//    // Using switch-case-default
    switch(number) {
        case 1:
            System.out.println("one");
            break;  // Don't forget the "break" after each case!
        case 2:
            System.out.println("two" );
            break;
         case 3:
                System.out.println("three");
                break;
        case 4:
            System.out.println("four");
            break;
        case 5:
            System.out.println("five");
            break;
        case 6:
            System.out.println("six");
       default: System.out.println( "invalid number");
    }
}
}
