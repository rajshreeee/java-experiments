package javaExperiments.shraday.bank;

public class Main {
    public static void main(String args[]){
        Account shraday = new Account(1, 20000, "Shraday Shakya", "shradayshakya@gmail.com", "9840265616");
        System.out.println("Current balance:" + shraday.getBalance());
        shraday.withdraw(1000);
        System.out.println("Current balance:" + shraday.getBalance());
        shraday.deposit(5000);
        System.out.println("Current balance:" + shraday.getBalance());
    }
}
