/* Write a program that prompts for and reads a person's name,
   age, college, and pet's name.  Then print the following paragraph,
   inserting the appropriate data:
   Hello, my name is *name* and I am *age* years old.  I'm enjoying my 
   time at *college*, though I miss my pet *petnname* very much! */
//Project 2.4

import java.util.Scanner;
public class Contact { 
    public static void main(String[]args) { 
        Scanner scan=new Scanner (System.in);
        String name, age, college, petname;
        System.out.println("What is your name:"); name=scan.nextLine(); 
        System.out.println("How old are you?: "); age=scan.nextLine();
        System.out.println("Where do you want to go to college: "); college=scan.nextLine();
        System.out.println("What is your petname:"); petname=scan.nextLine();
        System.out.println("Hello, my name is "+name+" and I am "+age+" years old.  I'm my time at  "+college+", though I miss my pet "+petname+" very much!");
}}