package ex35;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tristan Lewis
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        ArrayList<String> nameList = new ArrayList<>();
        do {
            System.out.println("Enter a name:");
            name= input.nextLine();
            if(!name.isBlank() && !name.isEmpty())
                nameList.add(name);
        }while(!name.isBlank() && !name.isEmpty());

        Random random = new Random();
        int randomIndex = random.nextInt(nameList.size());

        System.out.println("The winner is... "+nameList.get(randomIndex));

    }
}
