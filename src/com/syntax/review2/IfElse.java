package com.syntax.review2;

public class IfElse {
    public static void main(String[] args) {

        int num=12;

        if(num>100){
            System.out.println(num+" is greater than a 100");
        }else{
            System.out.println(num+" is less than a 100");
        }


        String expectedButton="Enroll Today";

        if(expectedButton.equals("Enroll Today")){
            System.out.println("Test Case Pass");
        }else{
            System.out.println("Test Case Failed");
        }

    }
}
