package com.company;

import java.util.Scanner;
import com.company.Player;
import com.company.Mechanic;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        Scanner skaner = new Scanner(System.in);
        System.out.println("Jak się nazywasz?");
        player.name = skaner.nextLine();
        System.out.println("Cześć " + player.name + "!. Miło mi Cię powitać w Twoim nowym komisie samochodowym :-)");
        System.out.println("Nie masz jeszcze żadnych aut, więc na początek polecam Ci jakieś kupić , żeby móc je potem sprzedać z zyskiem. Widzę, że masz $" + (player.getFunds()) + ". To na początek wystarczy." );
        //MENU WYBORU
        boolean mainLoop = true;

        int choice;
       while(true) {
           System.out.println("0. BAZA SAMOCHODÓW DO KUPIENIA");
           System.out.println("1. KUP SAMOCHÓD");
           System.out.println("2. POSIADANE SAMOCHODY");
           System.out.println("3. NAPRAW SAMOCHÓD");
           System.out.println("4. KLIENCI");
           System.out.println("5. SPRZEDAJ SAMOCHÓD");
           System.out.println("6. KUP REKLAMĘ");
           System.out.println("7. STAN KONTA");
           System.out.println("8. HISTORIA TRANSAKCJI");
           System.out.println("9. HISTORIA NAPRAW");
           System.out.println("10. SUMA KOSZTÓW NAPRAW I MYCIA DLA KAŻDEGO Z POSIADANYCH POJAZDÓW");

           choice = skaner.nextInt();


           switch (choice){
               case 0:
                   //BAZA SAMOCHODÓW
                   break;
               case 1:
                   //KUP SAMOCHÓD
                   break;
               case 2:
                   //POSIADANE SAMOCHODY
                   break;
               case 3:
                   //NAPRAW SAMOCHÓD
                   break;
               case 4:
                   //KLIENCI
                   break;
               case 5:
                   //SPRZEDAJ SAMOCHÓD
                   break;
               case 6:
                   //KUP REKLAMĘ
                   break;
               case 7:
                   System.out.println("Twój stan konta to:");
                   System.out.println("$" + player.getFunds());
                   break;
               case 8:
                   //HISTORIA TRANSAKCJI
                   break;
               case 9:
                   //HISTORIA NAPRAW
                   break;
               case 10:
                   //SUMA KOSZTÓW NAPRAW I MYCIA DLA KAŻDEGO Z POSIADANYCH POJAZDÓW
                   break;
               default:
                   System.out.println("Błędna komenda! Wpisz numer akcji którą chcesz wykonać.");
                   break;
           }

       }






    }

}
