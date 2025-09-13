package org.example;
import java.util.Scanner;


public class calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1,number2,choosechoice,result;
        System.out.print("Enter your choice: 1-multiplication 2-division 3-addition 4-subtraction  ");
        choosechoice= input.nextInt();

        System.out.print("Enter your first number: ");
        number1= input.nextInt();

        System.out.print("Enter your second number: ");
        number2= input.nextInt();

        switch(choosechoice){
            case 1:
                result=number1*number2;
                System.out.println(result);
                break;

            case 2:
                result=number1/number2;
                System.out.println(result);
                break;

            case 3:
                result=number1+number2;
                System.out.println(result);
                break;

            case 4:
                result=number1-number2;
                System.out.println(result);
                break;

            default:
                System.out.println("Invalid choice");


        }


    }
}
