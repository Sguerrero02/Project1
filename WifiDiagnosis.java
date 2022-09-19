/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: Wifi Diagnostic
 * Due: 09/18/22
 * Platform/compiler: Mac/Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Steven Guerrero
*/

import java.util.Scanner;

public class WifiDiagnosis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("If you have a problem with internet connectivity this WiFi Diagnosis might work.");
        System.out.println("Reboot the computer and try to connect");
        System.out.println("");
        System.out.println("Did that fix the problem?");

        String answer = sc.nextLine();

        if (answer.equals("yes") || answer.equals("Yes")) {
            System.out.println("Done");
        } else if (answer.equals("no") || answer.equals("No")) {
            System.out.println("Reboot the router and try to connect");

            System.out.println("Did that fix the problem?");
            answer = sc.nextLine();

            if (answer.equals("yes") || answer.equals("Yes")) {
                System.out.println("Done");
            } else if (answer.equals("no") || answer.equals("No")) {
                System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");

                System.out.println("Did that fix the problem?");
                answer = sc.nextLine();

                if (answer.equals("yes") || answer.equals("Yes")) {
                    System.out.println("Done");
                } else if (answer.equals("no") || answer.equals("No")) {
                    System.out.println("Move the computer closer to the router and try to connect");

                    System.out.println("Did that fix the problem?");
                    answer = sc.nextLine();

                    if (answer.equals("yes") || answer.equals("Yes")) {
                        System.out.println("Done");
                    } else if (answer.equals("no") || answer.equals("No")) {
                        System.out.println("Contact your ISP");
                    } else {
                        System.out.println("Invalid answer; try again");
                    }
                } else {
                    System.out.println("Invalid answer; try again");
                }
            } else {
                System.out.println("Invalid answer; try again");
            }            

        } else {
            System.out.println("Invalid answer; try again");
        }
        
        System.out.println("Programmer: Steven Guerrero");

        sc.close();
    }
}