package ex31;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tristan Lewis
 */
import java.util.*;
import java.lang.*;

public class ex31 {
    public static void main (String[] args) throws java.lang.Exception
    {
        int restingHR;
        int age;
        Scanner sc=new Scanner(System.in);
        restingHR = sc.nextInt();
        age = sc.nextInt();

        System.out.println("Resting Pulse: " + restingHR + "      Age: " + age);

        int intensity = 55;
        System.out.println("Intensity | Rate ");
        System.out.println("--------------------");

        while(intensity<96){
            int TargetHeartRate = ((((220 - age) - restingHR) * intensity / 100) + restingHR);
            System.out.println(intensity+"%       |   "+TargetHeartRate +"bpm");
            intensity+=5;
        }
    }
}
