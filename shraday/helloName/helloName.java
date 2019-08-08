package javaExperiments.shraday.helloName;

import java.util.Scanner;

public class helloName {
    public static void main(String[] args) {
        System.out.print("Enter name:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Your name is " + name);
    }
}
