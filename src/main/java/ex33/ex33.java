package ex33;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tristan Lewis
 */
import java.util.Random;
import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {

        String[] responses = {"Yes","No","Maybe","Ask again later"};

        Random random = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.println("What's your question?");
        String question = sc.nextLine();

        int randomResponseIndex = random.nextInt(responses.length);

        String response = responses[randomResponseIndex];

        System.out.println();
        System.out.println(response);
        System.out.println();
    }
}
