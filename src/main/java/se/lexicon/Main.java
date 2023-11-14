package se.lexicon;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner yearNumber = new Scanner(System.in);
        System.out.println("Enter a 4 Digit Year number to check whether it is a Leap Year");

        int year = yearNumber.nextInt();

        boolean isDivisibleBy4 = (year % 4 == 0);
        boolean isDivisibleBy100 = (year % 100 == 0);
        boolean isDivisibleBy400 = (year % 400 == 0);



        if (!isDivisibleBy4){
            System.out.println("Not a Leap Year. Not divisible by 4");
        } else if (isDivisibleBy4 && isDivisibleBy400){
            System.out.println("Leap Year. Divisible by 4 & 400");
        }  else if (isDivisibleBy100 && !isDivisibleBy400){
            System.out.println("Not a Leap Year. Divisible by 100 but not by 400");
        } else {
            System.out.println("Leap Year 2");
        }





        //long whatInTheWorld = (year % 4);



        //System.out.println(whatInTheWorld);

        //int modulus = 12 % 3;
        //System.out.println(modulus);
    }
}







/*

What's a leap year

https://www.mathsisfun.com/leap-years.html

https://www.shiksha.com/online-courses/articles/leap-year-in-java/#:~:text=Check%20Leap%20Year%20in%20Java%20using%20Ternary%20Operator&text=Use%20boolean%20condition%20year%20%25%204,is%20not%20a%20leap%20year%E2%80%9D.

 */