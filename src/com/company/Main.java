package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n =24;
CheckType(n);
    }

    private static void  CheckType(int n) {

        if (n%2 == 0 && (n>=2 && n<=5)){
            System.out.println("Not Weird");
        }
        else if(n%2 == 0 && (n>=6 && n<=20)){
            System.out.println("Weird");
        }

        else if(n%2 == 0 && n>20){
            System.out.println("Not Weird");
        }
        else if(n/2 != 0){
            System.out.println("Weird");
        }
    }
}
