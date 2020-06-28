package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Car car = new Car();
        Customer customer = new Customer();
        Player player = new Player();
        Scanner skaner = new Scanner(System.in);
        System.out.println("Jak się nazywasz?");
        player.name = skaner.nextLine();
        System.out.println("Cześć " + player.name + "! Miło mi Cię powitać w Twoim nowym komisie samochodowym :-)");
        System.out.println("Nie masz jeszcze żadnych aut, więc na początek polecam Ci jakieś kupić , żeby móc je potem sprzedać z zyskiem. Widzę, że masz $" + (player.getFunds()) + ". To na początek wystarczy." );
        int tury=0;

        //LISTY
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<Customer> potentionalcustomers = new ArrayList<Customer>();
        ArrayList<Car> cars = new ArrayList<Car>(25);
        ArrayList<Car> ownedcars = new ArrayList<Car>();
        ArrayList<Mechanic> mechanicy = new ArrayList<Mechanic>();
        ArrayList naprawy = new ArrayList();
        ArrayList transakcje = new ArrayList();

        //MECHANICY
        Mechanic Janusz = new Mechanic();
        mechanicy.add(Janusz);
        mechanicy.set(0, Janusz);
        Janusz.mechanikcena = 1000;
        Janusz.mechanikimie = "Janusz";
        Janusz.mechanikszansa = 100;

        Mechanic Marian = new Mechanic();
        mechanicy.add(Marian);
        mechanicy.set(1, Marian);

        Mechanic Adrian = new Mechanic();
        mechanicy.add(Adrian);
        mechanicy.set(2, Adrian);

        //KLIENCI
        Customer customer1 = new Customer();
        customers.add(customer1);

        Customer customer2 = new Customer();
        customers.add(customer2);

        Customer customer3 = new Customer();
        customers.add(customer3);

        Customer customer4 = new Customer();
        customers.add(customer4);

        Customer customer5 = new Customer();
        customers.add(customer5);

        Customer customer6 = new Customer();
        customers.add(customer6);

        Customer customer7 = new Customer();
        customers.add(customer7);

        Customer customer8 = new Customer();
        customers.add(customer8);

        Customer customer9 = new Customer();
        customers.add(customer9);

        Customer customer10 = new Customer();
        customers.add(customer10);

        //SAMOCHODY SAMOUCZKOWE
        Car samouczkowy1 = new Car();
        samouczkowy1.setValue(5000);
        samouczkowy1.setMarka("Ford");
        samouczkowy1.setSegment("Standard");
        cars.add(samouczkowy1);

        Car samouczkowy2 = new Car();
        car.setValue(4500);
        car.setMarka("Fiat");
        car.setSegment("Budget");
        cars.add(car);

        Car samouczkowy3 = new Car();
        samouczkowy3.setValue(6000);
        samouczkowy3.setSegment("Standard");
        cars.add(samouczkowy3);

        //SAMOCHODY LOSOWE
        Car car1 = new Car();
        cars.add(car1);

        Car car2 = new Car();
        cars.add(car2);

        Car car3 = new Car();
        cars.add(car3);

        Car car4 = new Car();
        cars.add(car4);

        Car car5 = new Car();
        cars.add(car5);

        Car car6 = new Car();
        cars.add(car6);

        Car car7 = new Car();
        cars.add(car7);

        Car car8 = new Car();
        cars.add(car8);

        Car car9 = new Car();
        cars.add(car9);

        Car car10 = new Car();
        cars.add(car10);

        Car car11 = new Car();
        cars.add(car11);

        Car car12 = new Car();
        cars.add(car12);

        Car car13 = new Car();
        cars.add(car13);

        Car car14 = new Car();
        cars.add(car14);

        Car car15 = new Car();
        cars.add(car15);

        Car car16 = new Car();
        cars.add(car16);

        Car car17 = new Car();
        cars.add(car17);

        Car car18 = new Car();
        cars.add(car18);

        Car car19 = new Car();
        cars.add(car19);

        Car car20 = new Car();
        cars.add(car20);

        Car car21 = new Car();
        cars.add(car21);

        cars.set(0, samouczkowy1);
        cars.set(1, samouczkowy2);
        cars.set(2, samouczkowy3);
        cars.set(3, car);
        cars.set(4, car1);
        cars.set(5, car2);
        cars.set(6, car3);
        cars.set(7, car4);
        cars.set(8, car5);
        cars.set(9, car6);
        cars.set(10, car7);
        cars.set(11, car8);
        cars.set(12, car9);
        cars.set(13, car10);
        cars.set(14, car11);
        cars.set(15, car12);
        cars.set(16, car13);
        cars.set(17, car14);
        cars.set(18, car15);
        cars.set(19, car16);
        cars.set(20, car17);
        cars.set(21, car18);
        cars.set(21, car19);
        cars.set(21, car20);
        cars.set(21, car21);

        //MENU
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
                   System.out.println("1. " + cars.get(0));
                   System.out.println("2. " + cars.get(1));
                   System.out.println("3. " + cars.get(2));
                   System.out.println("4. " + cars.get(3));
                   System.out.println("5. " + cars.get(4));
                   break;
               case 1:
                   //KUP SAMOCHÓD
                   System.out.println("Wybierz samochód który chcesz kupić.");
                   System.out.println("1. " + cars.get(0));
                   System.out.println("2. " + cars.get(1));
                   System.out.println("3. " + cars.get(2));
                   System.out.println("4. " + cars.get(3));
                   System.out.println("5. " + cars.get(4));
                   /*
                   System.out.println("6. " + cars.get(5));
                   System.out.println("7. " + cars.get(6));
                   System.out.println("8. " + cars.get(7));
                   System.out.println("9. " + cars.get(8));
                   System.out.println("10. " + cars.get(9));
                   System.out.println("11. " + cars.get(10));
                   System.out.println("12. " + cars.get(11));
                   System.out.println("13. " + cars.get(12));
                   System.out.println("14. " + cars.get(13));
                   System.out.println("15. " + cars.get(14));
                   System.out.println("16. " + cars.get(15));
                   System.out.println("17. " + cars.get(16));
                   System.out.println("18. " + cars.get(17));
                   System.out.println("19. " + cars.get(18));
                   System.out.println("20. " + cars.get(19));
                   System.out.println("21. " + cars.get(20));
                   System.out.println("22. " + cars.get(21));
                   System.out.println("23. " + cars.get(22));
                   System.out.println("24. " + cars.get(23));
                   System.out.println("25. " + cars.get(24));
                    */
                   int wybor = skaner.nextInt();
                   switch (wybor){
                       case 1:
                           if(player.getFunds() >= cars.get(0).getValue() + cars.get(0).getValue() * 2/100) {
                               ownedcars.add(cars.get(0));
                               tury += 1;
                               player.setFunds(player.getFunds() - cars.get(0).getValue() - cars.get(0).getValue() * 2/100);
                               System.out.println("KUPIŁEŚ: " + "\r\n" + cars.get(0));
                               System.out.println("ZAPŁACIŁEŚ $" + cars.get(0).getValue() * 2/100 + " PODATKU.");
                               cars.remove(0);
                               break;
                           } else {
                               System.out.println("Nie stać Cię na to auto! ");
                               break;
                           }
                       case 2:
                           if(player.getFunds() >= cars.get(1).getValue()) {
                               ownedcars.add(cars.get(1));
                               tury += 1;
                               player.setFunds(player.getFunds() - cars.get(1).getValue() - cars.get(1).getValue() * 2/100);
                               System.out.println("KUPIŁEŚ: " + "\r\n" + cars.get(1));
                               System.out.println("ZAPŁACIŁEŚ $" + cars.get(1).getValue() * 2/100 + " PODATKU.");
                               cars.remove(1);
                               break;
                           } else {
                               System.out.println("Nie stać Cię na to auto! ");
                               break;
                           }
                       case 3:
                           if(player.getFunds() >= cars.get(2).getValue()) {
                               ownedcars.add(cars.get(2));
                               tury += 1;
                               player.setFunds(player.getFunds() - cars.get(2).getValue() - cars.get(2).getValue() * 2/100);
                               System.out.println("KUPIŁEŚ: " + "\r\n" + cars.get(2));
                               System.out.println("ZAPŁACIŁEŚ $" + cars.get(2).getValue() * 2/100 + " PODATKU.");
                               cars.remove(2);
                               break;
                           } else {
                               System.out.println("Nie stać Cie na to auto! ");
                               break;
                           }
                       case 4:
                           if (player.getFunds() >= cars.get(3).getValue()) {
                               ownedcars.add(cars.get(3));
                               tury += 1;
                               player.setFunds(player.getFunds() - cars.get(3).getValue() - cars.get(3).getValue() * 2/100);
                               System.out.println("KUPIŁEŚ: " + "\r\n" + cars.get(3));
                               System.out.println("ZAPŁACIŁEŚ $" + cars.get(3).getValue() * 2/100 + " PODATKU.");
                               cars.remove(3);
                               break;
                           } else {
                               System.out.println("Nie stać Cie na to auto! ");
                               break;
                           }
                       case 5:
                           if (player.getFunds() >= cars.get(4).getValue()) {
                               ownedcars.add(cars.get(4));
                               tury += 1;
                               player.setFunds(player.getFunds() - cars.get(4).getValue() - cars.get(4).getValue() * 2/100);
                               System.out.println("KUPIŁEŚ: " + "\r\n" + cars.get(4));
                               System.out.println("ZAPŁACIŁEŚ $" + cars.get(4).getValue() * 2/100 + " PODATKU.");
                               cars.remove(4);
                           } else {
                               System.out.println("Nie stać Cie na to auto! ");
                               break;
                           }
                   }
               case 2:
                   //POSIADANE SAMOCHODY
                   if(ownedcars.size() == 0){
                       System.out.println("Nie masz żadnych samochodów.");
                       break;
                   } else {
                       System.out.println("TWOJE SAMOCHODY: " + "\r\n" + ownedcars);
                       break;
                   }
               case 3:
                   //NAPRAW SAMOCHÓD
                   break;
               case 4:
                   //KLIENCI
                   System.out.println(potentionalcustomers);
                   if(potentionalcustomers.size() == 0){
                       System.out.println("Nie masz żadnych klientów. Kup reklamę, aby ich pozyskać.");
                   }
                   break;
               case 5:
                   //SPRZEDAJ SAMOCHÓD
                  if(ownedcars.size() == 0){
                      System.out.println("Nie masz żadnych aut na sprzedania");
                  } else if(ownedcars.size() > 0){
                      for(int i = 0; i < ownedcars.size(); i++) {
                          System.out.println(i+1 + ". " + ownedcars.get(i));
                      }
                      System.out.println("KTÓRY SAMOCHÓD CHCESZ SPRZEDAĆ?");
                      int wyborauto = skaner.nextInt();
                      System.out.println(ownedcars.get(wyborauto - 1));
                      System.out.println("\r\n" + "WYBIERZ KLIENTA NA TO AUTO: ");
                      for(int i = 0; i < potentionalcustomers.size(); i++) {
                          System.out.println(i+1 + "." + potentionalcustomers.get(i));
                      }
                      int wyborklient = skaner.nextInt();
                      if(ownedcars.get(wyborauto-1).getMarka() == potentionalcustomers.get(wyborklient - 1).getCustomerFavoruite1() || ownedcars.get(wyborauto - 1).getMarka() == potentionalcustomers.get(wyborklient - 1).getCustomerFavoruite2()){
                          if(ownedcars.get(wyborauto - 1).getValue() < potentionalcustomers.get(wyborklient - 1).getCustomerMoney()) {
                              System.out.println("Sprzedano " + ownedcars.get(wyborauto - 1).getMarka() + " za $" + ownedcars.get(wyborauto - 1).getValue() + "\r\n" + ". PODATEK: " + ownedcars.get(wyborauto - 1).getValue() * 2 / 100);
                              player.setFunds(player.getFunds() - (ownedcars.get(wyborauto - 1).getValue() + ownedcars.get(wyborauto - 1).getValue() * 2 / 100));
                              int czyszczenie = 0;
                              System.out.println("CZYSZCZENIE: $150" );
                              player.setFunds(player.getFunds() - 150);
                              czyszczenie += 1;
                              ownedcars.remove(wyborauto - 1);
                              potentionalcustomers.remove(wyborklient - 1);
                          } else if (ownedcars.get(wyborauto - 1).getValue() > potentionalcustomers.get(wyborklient - 1).getCustomerMoney()) {
                              System.out.println("Klient nie dysponuje wystarczającą ilością gotówki.");
                          }
                      }
                          else {
                          System.out.println("Klient nie jest zainteresowany oferowaną przez Ciebie marką.");
                      }

                  }
                   break;
               case 6:
                   //KUP REKLAMĘ
                   System.out.println("1. KUP REKLAMĘ W INTERNECIE ZA $500");
                   System.out.println("2. KUP REKLAMĘ W GAZECIE ZA $800");
                   System.out.println("3. ROZMYŚLIŁEM SIĘ...");
                   int wybor1 = skaner.nextInt();
                   switch (wybor1){
                       case 1:
                           potentionalcustomers.add(customers.get(0));
                           customers.remove(0);
                           player.setFunds(player.getFunds() - 500);
                           System.out.println("Pozyskałeś jednego nowego klienta.");
                           break;
                       case 2:
                           int losowanie = random.nextInt(3);
                           if(losowanie == 0){
                               System.out.println("Reklama nie przyniosła żadnych rezultatów.");
                               player.setFunds(player.getFunds() - 800);
                           }else if (losowanie == 1){
                               potentionalcustomers.add(customers.get(0));
                               customers.remove(0);
                               System.out.println("Pozyskałeś jednego nowego klienta.");
                               player.setFunds(player.getFunds() - 800);
                           } else {
                               potentionalcustomers.add(customers.get(0));
                               customers.remove(0);
                               potentionalcustomers.add(customers.get(0));
                               customers.remove(0);
                               System.out.println("Pozyskałeś dwóch nowych klientów!");
                               player.setFunds(player.getFunds() - 800);
                           }
                        break;
                       case 3:
                           break;
                   }
                   //STAN KONTA
               case 7:
                   System.out.println("Twój stan konta to: ");
                   System.out.println("$" + player.getFunds());
                   System.out.println(tury);
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
