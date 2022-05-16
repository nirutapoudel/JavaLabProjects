package Core;

import java.sql.SQLOutput;
import java.util.Scanner;


public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your name"); // msg to the user in console
        String name= scanner.nextLine(); //name variable is to store the string entered by the user through keyboard in console
        System.out.println(name);
        System.out.println("enter your roll no");
        int rollNumber= scanner.nextInt();
        System.out.println(rollNumber);
        System.out.println("enter your section");
        String section= scanner.next();
        System.out.println("your section is"+ " "+section); //string concatenation


    }
}
