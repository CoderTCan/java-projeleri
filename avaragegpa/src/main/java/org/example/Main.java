package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double avarage,finalnote,midtermnote;

        System.out.println("write your midterm note");
        midtermnote= input.nextDouble();

        System.out.println("write your finalnote");
        finalnote = input.nextDouble();

        avarage= (midtermnote*0.4) + (finalnote*0.6);

        System.out.println("The average note is "+avarage);

        if(avarage>=60 && finalnote>=50){
            System.out.println("successful  " + avarage);
        }
        else{
            System.out.println("failed  "+ avarage);
        }
    }

}
