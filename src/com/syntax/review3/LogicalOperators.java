package com.syntax.review3;

import java.sql.SQLOutput;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean loginButtonDisplayed=true;
        boolean loginButtonClickable=false;
        if(loginButtonDisplayed && loginButtonClickable){
            System.out.println("Test case is passed");
        }else{
            System.out.println("Test case failed");
        }

        System.out.println("*****************************************");

        boolean dashboard=true;
        String message="Hello";
        if(dashboard || message.equals("Welcome admin")){
            System.out.println("User is successfully logged in");

        }else {
            System.out.println("User is not logged in");
        }

        boolean b=true;
        System.out.println(!true);

        boolean agreeCheckboxSelected=true;
        if(!agreeCheckboxSelected){
            System.out.println("I am clicking on checkbox");
        }
            System.out.println("I am clicking on submit button");
        }


    }

