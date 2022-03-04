package com.nology.calculator;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter some maths: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                break;
            }

            StringTokenizer tokenizer = new StringTokenizer(command, " ");

            String leftString = tokenizer.nextToken();
            String operandString = tokenizer.nextToken();
            String rightString = tokenizer.nextToken();

            int left = Integer.parseInt(leftString);
            int right = Integer.parseInt(rightString);

            int result = left + right;

            System.out.println("The result is : " + result);

        }


    }

}