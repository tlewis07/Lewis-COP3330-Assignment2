package ex32;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tristan Lewis
 */
import java.util.Scanner;

public class ex32 {
    public static void main(String[] args)
    {
        int a,b,c,d=0;
        char ch='y';
        Scanner sc=new Scanner(System.in);
        System.out.println("\nLets play Guess Number!\n");
        while(ch=='y' || ch=='Y')
        {
            System.out.print("\nEnter the difficulty level ( 1,2, or 3) : ");
            a=sc.nextInt();
            b= (int)Math.floor(Math.random()*(Math.pow(10,a)-1+1)+1);
            System.out.print("I have my number. What's your guess? ");
            while(true)
            {
                c= sc.nextInt();
                if(b==c)
                {
                    d++;
                    System.out.println("You got it in " + d + " guesses !");
                    break;
                }
                else if(b>c)
                {
                    System.out.print("Too low. Guess again: ");
                    d++;
                }
                else if(b<c)
                {
                    System.out.print("Too high. Guess again: ");
                    d++;
                }
            }
            System.out.print("\nDo you wish to play again (Y/N)?");
            ch=sc.next().charAt(0);
            d=0;
        }
    }
}
