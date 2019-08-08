import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of users to enter");
        String number = myObj.nextLine();
        Isaving readAndWrite=new ReadAndWrite();
        for (int i=0;i<Integer.parseInt(number);i++) {
            System.out.println("Enter the name of user:"+(i+1));
            String number1 = myObj.nextLine();
            if (i != Integer.parseInt(number) - 1) {
                readAndWrite.canWriteTo(number1);
            } else if (i == Integer.parseInt(number) - 1) {
                System.out.println("The dataset of the users is here:");
                readAndWrite.canReadFrom(readAndWrite.canWriteTo(number1));
            }
        }
    }
}
