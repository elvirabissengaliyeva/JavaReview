package com.syntax.review3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you tired");
        boolean tired=scan.nextBoolean();

        while(!tired){
            System.out.println("This is great");
            System.out.println("Let's study Java");
            System.out.println("Are you tired");
        }
        }

     }


