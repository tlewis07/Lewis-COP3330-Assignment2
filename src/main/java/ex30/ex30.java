package ex30;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tristan Lewis
 */
public class ex30 {
    public static class Main{
        public static void main(String[] args)
        {
            for(int a = 1 ; a <= 12; a++)
            {
                for(int b = 1; b <= 12; b++)
                {
                    System.out.print(a*b + "\t");
                }
                System.out.println();
            }
        }
    }
}
