package org.example;
import java.util.Random;
import java.util.Scanner;

public class sayitahminoyunu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int tutulansayi = rand.nextInt(100);
        int tahminedilnesayi,i;
        int tahminhakki =5 ;
        System.out.println(tutulansayi + " doğru tahmindi.");


        for(i=1;i<=tahminhakki;i++){
            System.out.println("SAYI TAHMİN EDİNİZ");
            tahminedilnesayi = scan.nextInt();
            if(tahminedilnesayi== tutulansayi){
                System.out.println(tahminedilnesayi + " EŞİTTİR " + tutulansayi);
                System.out.println(i + " . tahmininizde buldunuz");
                System.out.println("OYUN BİTTİ TEBRİKLER");
                break;
            }
            else if(i == 5){
                System.out.println("YANLIŞ TAHMİN!!!!!");
                System.out.println("TAHMİN HAKKINIZ DOLDU KAYBETTİNİZ.");
                System.out.println(tutulansayi + " doğru tahmindi.");

            }
            else{
                System.out.println("YANLIŞ TAHMİN!!!!!");
            }

        }

    }

}
