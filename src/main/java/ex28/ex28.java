package ex28;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tristan Lewis
 */
import java.util.*;
import java.lang.*;

public class ex28 {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int element;
        while(count <6){
            System.out.print("Enter a number: ");
            element =sc.nextInt();
            System.out.println(element);
            sum +=element;
            count++;
        }
        System.out.println("The total is " + sum);
    }
}
