package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner input= newScanner(System.in)
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un numar");
        int user_input_number = input.nextInt();
        System.out.println((user_input_number));
        int a = user_input_number;
        {
            System.out.println(a);
            if (a % 3 == 0) {
                System.out.println(+a + "  Numar divizibil cu 3" + "  Fizz");
            }
            if (a % 5 == 0) {
                System.out.println(+a + "  Numar divizibil cu 5" + "  Buzz");
            }
            if ((a % 3 == 0) && (a % 5 == 0))
            {
                System.out.println(+a + "  Numar divizibil cu 15" + "  FizzBuzz");
            }
            if ((a % 3 != 0) && (a % 5 != 0)) {
                System.out.println("Dragos");
            }
        }
    }
}






