package com.bridgelabz.test;
import java.util.Scanner;
public class LeapYear {
    {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  Any  4 Digit Number :");
        year=sc.nextInt();
        if(year > 999 && year < 10000)
        {
            if(year%400==0)
                System.out.println(year+" is a leap year");
            else  if(year%100!=0)
            {
                if(year%4==0)
                    System.out.println(year+" is a leap year");
                else
                    System.out.println(year+" is not a leap year");
            }
            else
                System.out.println(year+" is not a leap year");
        }
        else
            System.out.println("Year zero does not exist ");
    }
}
