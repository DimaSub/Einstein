//Milliseconds.java
//Maman 11 - Question 1
//Author: Dima Subotin
//ID: 311626519
//Converts milliseconds to user-friendly format display

import java.util.Scanner; //enables the ability to use scanner function in the class

public class Milliseconds { //start of class Milliseconds

    public static void main (String [] args) //start of method main
    {
        final int MS_IN_SEC = 1000; //represents the amount of milliseconds in a second
        final int MS_IN_MINUTE = MS_IN_SEC*60; //represents the amount of milliseconds in a minute
        final int MS_IN_HOUR = MS_IN_MINUTE*60; //represents the amount of milliseconds in a hour
        final int MS_IN_DAY = MS_IN_HOUR*24; //represents the amount of milliseconds in a day

        Scanner scan = new Scanner (System.in);
        System.out.println ("This program reads an integer which " +
                "represents Milliseconds and converts it to days, " +
                "hours, minutes and seconds. ");
        System.out.println ("Please enter the number of Milliseconds");
        long ms = scan.nextLong();

        long d = ms/MS_IN_DAY; //calculates days based on input milliseconds
        long h = ms%MS_IN_DAY/MS_IN_HOUR; //calculates hours based on input milliseconds
        long m = ms%MS_IN_DAY%MS_IN_HOUR/MS_IN_MINUTE; //calculates minutes based on input milliseconds
        long s = ms%MS_IN_DAY%MS_IN_HOUR%MS_IN_MINUTE/MS_IN_SEC; //calculates seconds based on input milliseconds

        System.out.print(d+" days "+h+":"+m+":"+s+" hours"); //prints the new input milliseconds display format
    } // end of method main
} //end of class Milliseconds