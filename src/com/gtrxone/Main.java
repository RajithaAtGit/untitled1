package com.gtrxone;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
	// write your code he/*
        /*
        rajithage exre resulslt 50
        saminra 35
        gayan ge 75
        amilage 95
        asanka ge 15
        nisanalsa 65;
        anuthara ge 45;

        35 -45 s
        50-65 c
        65 -75 b
        75 -100 a

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name : ");
        String name = scanner.nextLine();
        System.out.println("result Your name : ");
        int result = scanner.nextInt();
        char grade='0';
        if (result >= 35 && result <=45){
            grade ='S';
        }else if (result >= 50 && result <=65){
            grade ='C';
        }else if (result >= 65 && result <=75){
            grade ='B';
        }else if (result >= 75 ){
            grade ='A';
        }
        System.out.println("Name " + name);
        System.out.println("Result " + result);
        System.out.println("Grade " + grade);
        scanner.close();

    }


}
