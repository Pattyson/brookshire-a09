/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Scanner;

public class Solution09 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); //scanner object
            double sqFeetPerGallon = 350;

            System.out.print("Enter length: ");
            double length = input.nextDouble(); //take length from user

            System.out.print("Enter width: ");
            double width = input.nextDouble(); //take width from user

            double totalSq = length*width; //calculate total squre
            int gallon = (int)Math.ceil(totalSq/sqFeetPerGallon); //calculate number of gallon

            System.out.println("You will need to purchase "+gallon+" of paint to cover "+totalSq+" squre feet");
        }
}

