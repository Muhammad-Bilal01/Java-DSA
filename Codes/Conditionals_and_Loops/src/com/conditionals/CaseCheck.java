package com.conditionals;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Character: ");
        char letter  = in.next().trim().charAt(0);

        if(letter >= 'a' && letter <= 'z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }


    }
}
