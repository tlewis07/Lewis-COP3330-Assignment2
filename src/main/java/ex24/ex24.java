package ex24;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tristan Lewis
 */
import java.util.*;

public class ex24 {
    public static void main(String[] args) {

        Scanner myOBj = new Scanner(System.in);
        System.out.println("Enter the two strings and I'll tell you if they are anagrams");

        System.out.println("Enter the first string");
        String first_string = myOBj.nextLine();

        System.out.println("Enter the second string");
        String second_string = myOBj.nextLine();


        isAnagram(first_string, second_string);
    }
    public static void isAnagram(String first_string, String second_string) {
    if (first_string.equals(second_string)) {
        System.out.println(first_string + " and " + second_string + " are anagrams");
    } else {
        System.out.println(first_string + " and " + second_string + " are not anagrams");
    }

    }
}

