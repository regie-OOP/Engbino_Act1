//Java Activity #1
package javaactivity01;

import java.util.Scanner;

public class JavaActivity01 {

   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String lName, fName, mInitial, Gender;
        int age, month, day, year;

        System.out.println("Enter Your Last Name:");
        lName = scn.nextLine();

        System.out.println("Enter your First Name:");
        fName = scn.nextLine();

        System.out.println("Enter your Middle Initial:");
        mInitial = scn.nextLine();

        System.out.println("Enter your Gender:");
        Gender = scn.nextLine();

        System.out.println("Enter your age:");
        age = scn.nextInt();

        System.out.println("Enter the month of your birthday:");
        month = scn.nextInt();

        System.out.println("Enter the day of your birthday:");
        day = scn.nextInt();

        System.out.println("Enter the year of your birthday:");
        year = scn.nextInt();

        System.out.println("Your Data:");
        System.out.println("Last name: " + lName);
        System.out.println("First name: " + fName);
        System.out.println("Middle Initial: " + mInitial);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + Gender);
        System.out.println("Date of Birth: " + month + "/" + day + "/" + year);

        scn.close();
    }
}
    

