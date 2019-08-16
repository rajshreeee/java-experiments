package javaExperiments.rajshree.ScopeChallenge;

import java.util.Scanner;

public class X {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    public void x(){
        for(int x = 1; x<=12;x++){
            System.out.println(this.x*x);
        }
    }
}
