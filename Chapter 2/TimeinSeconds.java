/* Write a program that reads values representing a time duration in
 * hours, minutes, ands seconds and then prints the equivalent total 
 * number of seconds and then prints the equivalent total number of 
 * seconds.  (For example, 1 hour, 28 minutes, and 42 seconds is 
 * equivalent to 5322 seconds.) */
//Project 2.8

import java.util.Scanner;
public class TimeinSeconds {
    public static void main(String[] args) {    
        int hours;  int minutes; int seconds; int output; int time;
        Scanner scan = new Scanner(System.in); 
        System.out.println("Hours: ");
        time = 3600*scan.nextInt();
        System.out.println("Minutes: ");
        time = time+(scan.nextInt()*60);
        System.out.println("Seconds: ");
        time = time+scan.nextInt();
        System.out.println("The time in seconds is " + time + " seconds.");
    }}