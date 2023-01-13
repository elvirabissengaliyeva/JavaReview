package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {

        int completed =10;
        if(completed>=25){
            System.out.println("great job");
    }else if(completed>=20){
        System.out.println("good job");
    }else if(completed>=10){
        System.out.println("ok job");
    }else if(completed>=5){
        System.out.println("not good job");

    }

        System.out.println("   ------------------------------------------------------------  ");

        String browser="opera";

        if(browser.equals("chrome")){
            System.out.println("Test cases executed on chrome browser");

        }else if (browser.equals("safari")){
            System.out.println("Test cases executed on Safari browser");

        }else if (browser.equals("firefox")){
            System.out.println("Test cases executed on firefox browser");

        }else{
            System.out.println("Browser is not supported");
        }
}}
