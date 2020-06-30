package com.company;

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
        int ruchy=0;
        int czyszczenie = 0;
        int koszty = 0;

        //LISTY
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<Customer> potentionalcustomers = new ArrayList<Customer>();
        ArrayList<Car> cars = new ArrayList<Car>(25);
        ArrayList<Car> ownedcars = new ArrayList<Car>();
        ArrayList<Mechanic> mechanicy = new ArrayList<Mechanic>();
        ArrayList naprawy = new ArrayList();
        ArrayList<Car> transakcje = new ArrayList<Car>();

        //MECHANICY
        Mechanic Janusz = new Mechanic();
        mechanicy.add(Janusz);
        mechanicy.set(0, Janusz);
        Janusz.mechanikcenahamulce = 800;
        Janusz.mechanikcenazawieszenie = 900;
        Janusz.mechanikcenasilnik = 1000;
        Janusz.mechanikcenakaroseria = 700;
        Janusz.mechanikcenaskrzynia = 700;
        Janusz.mechanikimie = "JANUSZ";
        Janusz.mechanikszansa = 100;
        Janusz.mechanikbreak = 0;

        Mechanic Marian = new Mechanic();
        mechanicy.add(Marian);
        mechanicy.set(1, Marian);
        Marian.mechanikcenahamulce = 600;
        Marian.mechanikcenazawieszenie = 800;
        Marian.mechanikcenasilnik = 900;
        Marian.mechanikcenakaroseria = 600;
        Marian.mechanikcenaskrzynia = 600;
        Marian.mechanikimie = "MARIAN";
        Marian.mechanikszansa = 90;
        Marian.mechanikbreak = 0;

        Mechanic Adrian = new Mechanic();
        mechanicy.add(Adrian);
        mechanicy.set(2, Adrian);
        Adrian.mechanikcenahamulce = 500;
        Adrian.mechanikcenazawieszenie = 700;
        Adrian.mechanikcenasilnik = 750;
        Adrian.mechanikcenakaroseria = 450;
        Adrian.mechanikcenaskrzynia = 500;
        Adrian.mechanikimie = "ADRIAN";
        Adrian.mechanikszansa = 80;
        Adrian.mechanikbreak = 2;

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

        Customer customer11 = new Customer();
        customers.add(customer11);

        Customer customer12 = new Customer();
        customers.add(customer12);

        Customer customer13 = new Customer();
        customers.add(customer13);

        Customer customer14 = new Customer();
        customers.add(customer14);

        Customer customer15 = new Customer();
        customers.add(customer15);

        Customer customer16 = new Customer();
        customers.add(customer16);

        Customer customer17 = new Customer();
        customers.add(customer17);

        Customer customer18 = new Customer();
        customers.add(customer18);

        Customer customer19 = new Customer();
        customers.add(customer19);

        Customer customer20 = new Customer();
        customers.add(customer20);

        //KLIENCI SAMOUCZKOWI
        potentionalcustomers.add(customers.get(0));
        customers.remove(0);
        potentionalcustomers.add(customers.get(0));
        customers.remove(0);

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
           System.out.println("10. SUMA KOSZTÓW NAPRAW I MYCIA TWOICH POJAZDÓW");

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
                   System.out.println("6. POWRÓT DO MENU");
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
                               ruchy += 1;
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
                               ruchy += 1;
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
                               ruchy += 1;
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
                               ruchy += 1;
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
                               ruchy += 1;
                               player.setFunds(player.getFunds() - cars.get(4).getValue() - cars.get(4).getValue() * 2/100);
                               System.out.println("KUPIŁEŚ: " + "\r\n" + cars.get(4));
                               System.out.println("ZAPŁACIŁEŚ $" + cars.get(4).getValue() * 2/100 + " PODATKU.");
                               cars.remove(4);
                           } else {
                               System.out.println("Nie stać Cie na to auto! ");
                               break;
                           }
                       case 6:
                           break;
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
                   if(ownedcars.size() == 0){
                       System.out.println("Nie masz żadnych samochodów.");
                   } else {
                       System.out.println("\r\n" + "KTÓRY SAMOCHÓD CHCESZ NAPRAWIĆ?");
                       for(int nr = 0; nr < ownedcars.size(); nr++) {
                           System.out.println(nr + 1 + "." + ownedcars.get(nr) + "\r\n");
                       }
                       int wyborautonaprawa = skaner.nextInt();
                       System.out.println("Któremy mechanikowi chcesz zlecić naprawę?");
                       System.out.println("1. " + Janusz + "\r\n");
                       System.out.println("2." + Marian + "\r\n");
                       System.out.println("3. " + Adrian + "\r\n");
                       int wybormechanik = skaner.nextInt();
                           if (ownedcars.get(wyborautonaprawa - 1).isSprawny() == true){
                               System.out.println("To auto jest w pełni sprawne" + "\r\n");
                           } else {
                               System.out.println(ownedcars.get(wyborautonaprawa - 1));
                               System.out.println("CO CHCESZ NAPRAWIĆ?");
                               System.out.println("1. Hamulce");
                               System.out.println("2. Zawieszenie");
                               System.out.println("3. Silnik");
                               System.out.println("4. Karoseria");
                               System.out.println("5. Skrzynia biegów");
                               int wybornaprawa = skaner.nextInt();
                               if (wybornaprawa == 1){
                                   if(ownedcars.get(wyborautonaprawa - 1).isHamulce() == true) {
                                       System.out.println("Hamulce w tym aucie są sprawne.");
                                       break;
                                   }
                                   if(ownedcars.get(wyborautonaprawa - 1).isHamulce() == false) {
                                       if(wybormechanik == 1){
                                           player.setFunds(player.getFunds() - Janusz.mechanikcenahamulce);
                                           ownedcars.get(wyborautonaprawa - 1).setHamulce(true);
                                           ownedcars.get(wyborautonaprawa - 1).setShamulce("HAMULCE: Sprawne");
                                           ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                   + (ownedcars.get(wyborautonaprawa - 1).getValue() * 10/100));
                                           naprawy.add(wyborautonaprawa - 1);
                                           koszty += Janusz.mechanikcenahamulce;
                                           ruchy += 1;
                                           System.out.println("Hamulce zostały naprawione.");
                                           break;
                                       }
                                       if(wybormechanik == 2){
                                           int szansa = random.nextInt(10);
                                           if(szansa == 1){
                                               ownedcars.get(wyborautonaprawa - 1).setHamulce(true);
                                               ownedcars.get(wyborautonaprawa - 1).setShamulce("HAMULCE: Sprawne");
                                               System.out.println("Marian nie podołał naprawie i musiał poprosić o pomoc Janusza.");
                                               System.out.println("Zapłaciłeś: $" + Janusz.mechanikcenahamulce);
                                               player.setFunds(player.getFunds() - Janusz.mechanikcenahamulce);
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 10 / 100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Marian.mechanikcenahamulce;
                                               ruchy += 1;
                                               System.out.println("Hamulce zostały naprawione.");
                                               break;
                                           } else {

                                               player.setFunds(player.getFunds() - Marian.mechanikcenahamulce);
                                               ownedcars.get(wyborautonaprawa - 1).setHamulce(true);
                                               ownedcars.get(wyborautonaprawa - 1).setShamulce("HAMULCE: Sprawne");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 10 / 100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Marian.mechanikcenahamulce;
                                               ruchy += 1;
                                               System.out.println("Hamulce zostały naprawione.");
                                               break;
                                           }
                                       }
                                       if(wybormechanik == 3) {
                                           int szansa = random.nextInt(10);
                                           if (szansa == 1 || szansa == 8) {
                                               System.out.println("Naprawa się nie powiodła. Pieniądze przepadły.");
                                               player.setFunds(player.getFunds() - Adrian.mechanikcenahamulce);
                                               break;
                                           } else {
                                               player.setFunds(player.getFunds() - Adrian.mechanikcenahamulce);
                                               ownedcars.get(wyborautonaprawa - 1).setHamulce(true);
                                               ownedcars.get(wyborautonaprawa - 1).setShamulce("HAMULCE: Sprawne");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 10 / 100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Adrian.mechanikcenahamulce;
                                               ruchy += 1;
                                               System.out.println("Hamulce zostały naprawione.");
                                               break;
                                           }
                                       }
                                   }

                               }
                               if(wybornaprawa == 2){
                                   if(ownedcars.get(wyborautonaprawa - 1).isZawieszenie() == true) {
                                       System.out.println("Zawieszenie nie wymaga naprawy");
                                       break;
                                   }
                                   if(ownedcars.get(wyborautonaprawa - 1).isZawieszenie() == false){
                                       if(wybormechanik == 1){
                                           player.setFunds(player.getFunds() - Janusz.mechanikcenazawieszenie);
                                           ownedcars.get(wyborautonaprawa - 1).setZawieszenie(true);
                                           ownedcars.get(wyborautonaprawa - 1).setSzawieszenie("ZAWIESZENIE: W dobrym stanie");
                                           ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                   + (ownedcars.get(wyborautonaprawa - 1).getValue() * 20/100));
                                           naprawy.add(wyborautonaprawa - 1);
                                           koszty += Janusz.mechanikcenazawieszenie;
                                           ruchy += 1;
                                           System.out.println("Zawieszenie zostało naprawione.");
                                           break;
                                       }
                                       if(wybormechanik == 2){
                                           int szansa = random.nextInt(10);
                                           if(szansa == 1) {
                                               System.out.println("Marian nie podołał naprawie i musiał poprosić o pomoc Janusza");
                                               player.setFunds(player.getFunds() - Janusz.mechanikcenazawieszenie);
                                               ownedcars.get(wyborautonaprawa - 1).setZawieszenie(true);
                                               ownedcars.get(wyborautonaprawa - 1).setSzawieszenie("ZAWIESZENIE: W dobrym stanie");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 20/100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Janusz.mechanikcenazawieszenie;
                                               ruchy += 1;
                                               System.out.println("Zawieszenie zostało naprawione.");
                                               break;
                                           } else {
                                               player.setFunds(player.getFunds() - Marian.mechanikcenazawieszenie);
                                               ownedcars.get(wyborautonaprawa - 1).setZawieszenie(true);
                                               ownedcars.get(wyborautonaprawa - 1).setSzawieszenie("ZAWIESZENIE: W dobrym stanie");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 20 / 100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Marian.mechanikcenazawieszenie;
                                               ruchy += 1;
                                               System.out.println("Zawieszenie zostało naprawione.");
                                               break;
                                           }
                                       }
                                       if(wybormechanik == 3){
                                           int szansa = random.nextInt(10);
                                           if(szansa == 1 || szansa == 8){
                                               System.out.println("Naprawa się nie powiodła. Pieniądze przepadły.");
                                               player.setFunds(player.getFunds() - Adrian.mechanikcenazawieszenie);
                                               break;
                                           } else {
                                               player.setFunds(player.getFunds() - Adrian.mechanikcenazawieszenie);
                                               ownedcars.get(wyborautonaprawa - 1).setZawieszenie(true);
                                               ownedcars.get(wyborautonaprawa - 1).setSzawieszenie("ZAWIESZENIE: W dobrym stanie");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 20 / 100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Adrian.mechanikcenazawieszenie;
                                               ruchy += 1;
                                               System.out.println("Zawieszenie zostało naprawione.");
                                               break;
                                           }
                                       }
                                   }

                               }
                               if(wybornaprawa == 3){
                                   if(ownedcars.get(wyborautonaprawa - 1).isSilnik() == true) {
                                       System.out.println("Silnik jest sprawny.");
                                       break;
                                   }
                                   if(ownedcars.get(wyborautonaprawa - 1).isSilnik() == false){
                                       if(wybormechanik == 1){
                                           player.setFunds(player.getFunds() - Janusz.mechanikcenasilnik);
                                           ownedcars.get(wyborautonaprawa - 1).setSilnik(true);
                                           ownedcars.get(wyborautonaprawa - 1).setSsilnik("SILNIK: Sprawny");
                                           ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                   + (ownedcars.get(wyborautonaprawa - 1).getValue() * 100/100));
                                           naprawy.add(wyborautonaprawa - 1);
                                           koszty += Janusz.mechanikcenasilnik;
                                           ruchy += 1;
                                           System.out.println("Silnik został naprawiony.");
                                           break;
                                       }
                                       if(wybormechanik == 2){
                                           int szansa = random.nextInt(10);
                                           if(szansa == 1){
                                               System.out.println("Marian nie podołał naprawie i musiał poprosić o pomoc Janusza");
                                               player.setFunds(player.getFunds() - Janusz.mechanikcenasilnik);
                                               ownedcars.get(wyborautonaprawa - 1).setSilnik(true);
                                               ownedcars.get(wyborautonaprawa - 1).setSsilnik("SILNIK: Sprawny");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 100/100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Janusz.mechanikcenasilnik;
                                               ruchy += 1;
                                               System.out.println("Silnik został naprawiony.");
                                               break;
                                           } else {
                                               player.setFunds(player.getFunds() - Marian.mechanikcenasilnik);
                                               ownedcars.get(wyborautonaprawa - 1).setSilnik(true);
                                               ownedcars.get(wyborautonaprawa - 1).setSsilnik("SILNIK: Sprawny");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 100 / 100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Marian.mechanikcenasilnik;
                                               ruchy += 1;
                                               System.out.println("Silnik został naprawiony.");
                                               break;
                                           }
                                       }
                                       if(wybormechanik == 3){
                                           int szansa = random.nextInt(10);
                                           if(szansa == 1 || szansa == 8){
                                               System.out.println("Naprawa nie powiodła się. Pieniądze przepadły");
                                               player.setFunds(player.getFunds() - Adrian.mechanikcenasilnik);
                                               break;
                                           } else {
                                               player.setFunds(player.getFunds() - Adrian.mechanikcenasilnik);
                                               ownedcars.get(wyborautonaprawa - 1).setSilnik(true);
                                               ownedcars.get(wyborautonaprawa - 1).setSsilnik("SILNIK: Sprawny");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 100 / 100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Adrian.mechanikcenasilnik;
                                               ruchy += 1;
                                               System.out.println("Silnik został naprawiony.");
                                               break;
                                           }
                                       }
                                   }

                               }
                               if(wybornaprawa == 4){
                                   if(ownedcars.get(wyborautonaprawa - 1).isKaroseria() == true) {
                                       System.out.println("Karoseria jest w dobrym stanie.");
                                       break;
                                   }
                                   if(ownedcars.get(wyborautonaprawa - 1).isKaroseria() == false){
                                       if(wybormechanik == 1){
                                           player.setFunds(player.getFunds() - Janusz.mechanikcenakaroseria);
                                           ownedcars.get(wyborautonaprawa - 1).setKaroseria(true);
                                           ownedcars.get(wyborautonaprawa - 1).setSkaroseria("KAROSERIA: W dobrym stanie");
                                           ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                   + (ownedcars.get(wyborautonaprawa - 1).getValue() * 50/100));
                                           naprawy.add(wyborautonaprawa - 1);
                                           koszty += Janusz.mechanikcenakaroseria;
                                           ruchy += 1;
                                           System.out.println("Karoseria została naprawiona.");
                                           break;
                                       }
                                       if(wybormechanik == 2){
                                           int szansa = random.nextInt(10);
                                           if(szansa == 1){
                                               System.out.println("Marian nie podołał naprawie i musiał poprosić o pomoc Janusza");
                                               player.setFunds(player.getFunds() - Janusz.mechanikcenakaroseria);
                                               ownedcars.get(wyborautonaprawa - 1).setKaroseria(true);
                                               ownedcars.get(wyborautonaprawa - 1).setSkaroseria("KAROSERIA: W dobrym stanie");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 50/100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Janusz.mechanikcenakaroseria;
                                               ruchy += 1;
                                               System.out.println("Karoseria została naprawiona.");
                                               break;
                                           } else {
                                               player.setFunds(player.getFunds() - Marian.mechanikcenakaroseria);
                                               ownedcars.get(wyborautonaprawa - 1).setKaroseria(true);
                                               ownedcars.get(wyborautonaprawa - 1).setSkaroseria("KAROSERIA: W dobrym stanie");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 50 / 100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Marian.mechanikcenakaroseria;
                                               ruchy += 1;
                                               System.out.println("Karoseria została naprawiona.");
                                               break;
                                           }
                                       }
                                       if(wybormechanik == 3){
                                           int szansa = random.nextInt(10);
                                           if(szansa == 1 || szansa == 8){
                                               System.out.println("Adrian nie podołał naprawie. Pieniądze przepadły");
                                               player.setFunds(player.getFunds() - Adrian.mechanikcenakaroseria);
                                               break;
                                           } else {
                                               player.setFunds(player.getFunds() - Adrian.mechanikcenakaroseria);
                                               ownedcars.get(wyborautonaprawa - 1).setKaroseria(true);
                                               ownedcars.get(wyborautonaprawa - 1).setSkaroseria("KAROSERIA: W dobrym stanie");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 50 / 100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Adrian.mechanikcenakaroseria;
                                               ruchy += 1;
                                               System.out.println("Karoseria została naprawiona.");
                                               break;
                                           }
                                       }
                                   }

                               }
                               if(wybornaprawa == 5){
                                   if(ownedcars.get(wyborautonaprawa - 1).isSkrzynia() == true) {
                                       System.out.println("Skrzynia biegów nie wymaga naprawy.");
                                       break;
                                   }
                                   if(ownedcars.get(wyborautonaprawa - 1).isSkrzynia() == false){
                                       if(wybormechanik == 1){
                                           player.setFunds(player.getFunds() - Janusz.mechanikcenaskrzynia);
                                           ownedcars.get(wyborautonaprawa - 1).setSkrzynia(true);
                                           ownedcars.get(wyborautonaprawa - 1).setSskrzynia("SKRZYNIA BIEGÓW: Sprawna");
                                           ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                   + (ownedcars.get(wyborautonaprawa - 1).getValue() * 50/100));
                                           naprawy.add(wyborautonaprawa - 1);
                                           koszty += Janusz.mechanikcenaskrzynia;
                                           ruchy += 1;
                                           System.out.println("Skrzynia biegów została naprawiona.");
                                           break;
                                       }
                                       if(wybormechanik == 2){
                                           int szansa = random.nextInt(10);
                                           if(szansa == 1){
                                               System.out.println("Marian nie podołał naprawie i musiał prosić o pomoc Janusza");
                                               player.setFunds(player.getFunds() - Janusz.mechanikcenaskrzynia);
                                               ownedcars.get(wyborautonaprawa - 1).setSkrzynia(true);
                                               ownedcars.get(wyborautonaprawa - 1).setSskrzynia("SKRZYNIA BIEGÓW: Sprawna");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 50/100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Janusz.mechanikcenaskrzynia;
                                               ruchy += 1;
                                               System.out.println("Skrzynia biegów została naprawiona.");
                                               break;
                                           } else {
                                               player.setFunds(player.getFunds() - Marian.mechanikcenaskrzynia);
                                               ownedcars.get(wyborautonaprawa - 1).setSkrzynia(true);
                                               ownedcars.get(wyborautonaprawa - 1).setSskrzynia("SKRZYNIA BIEGÓW: Sprawna");
                                               ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                       + (ownedcars.get(wyborautonaprawa - 1).getValue() * 50 / 100));
                                               naprawy.add(wyborautonaprawa - 1);
                                               koszty += Marian.mechanikcenaskrzynia;
                                               ruchy += 1;
                                               System.out.println("Skrzynia biegów została naprawiona");
                                               break;
                                           }
                                       }
                                       if(wybormechanik == 3){
                                           int szansa = random.nextInt(10);
                                           if(szansa == 1 || szansa == 8){
                                               System.out.println("Adrian nie podołał naprawie. Pieniądze przepadły.");
                                               player.setFunds(player.getFunds() - Adrian.mechanikcenaskrzynia);
                                               break;
                                           }
                                           player.setFunds(player.getFunds() - Adrian.mechanikcenaskrzynia);
                                           ownedcars.get(wyborautonaprawa - 1).setSkrzynia(true);
                                           ownedcars.get(wyborautonaprawa - 1).setSskrzynia("SKRZYNIA BIEGÓW: Sprawna");
                                           ownedcars.get(wyborautonaprawa - 1).setValue(ownedcars.get(wyborautonaprawa - 1).getValue()
                                                   + (ownedcars.get(wyborautonaprawa - 1).getValue() * 50/100));
                                           naprawy.add(wyborautonaprawa - 1);
                                           koszty += Adrian.mechanikcenaskrzynia;
                                           ruchy += 1;
                                           System.out.println("Skrzynia biegów została naprawiona");
                                           break;
                                       }
                                   }

                               }
                           }

                   }
                   break;
               case 4:
                   //KLIENCI
                   System.out.println(potentionalcustomers);
                   if(potentionalcustomers.size() == 0){
                       System.out.println("Nie masz żadnych klientów. Kup reklamę, aby ich pozyskać.");
                       break;
                   }
                   break;
               case 5:
                   //SPRZEDAJ SAMOCHÓD
                  if(ownedcars.size() == 0){
                      System.out.println("Nie masz żadnych aut na sprzedania.");
                  if(potentionalcustomers.size() == 0){
                      System.out.println("Nie masz klientów.");
                  }
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
                              System.out.println("Sprzedano " + ownedcars.get(wyborauto - 1).getMarka() + " za $" + ownedcars.get(wyborauto - 1).getValue() + "." + "\r\n" + "PODATEK: $" + ownedcars.get(wyborauto - 1).getValue() * 2 / 100);
                              player.setFunds(player.getFunds() - (ownedcars.get(wyborauto - 1).getValue() * 2 / 100));
                              ruchy += 1;
                              System.out.println("CZYSZCZENIE: $150" );
                              player.setFunds(player.getFunds() - 150);
                              player.setFunds(player.getFunds() + ownedcars.get(wyborauto -1).getValue());
                              czyszczenie += 1;
                              transakcje.add(ownedcars.get(wyborauto -1));
                              ownedcars.remove(wyborauto - 1);
                              potentionalcustomers.remove(wyborklient - 1);
                              potentionalcustomers.add(customers.get(0));
                              customers.remove(0);
                              potentionalcustomers.add(customers.get(0));
                              customers.remove(0);
                              System.out.println("Dzięki tej sprzedaży pozyskałeś dwóch nowych klientów");
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
                           ruchy += 1;
                           potentionalcustomers.add(customers.get(0));
                           customers.remove(0);
                           player.setFunds(player.getFunds() - 500);
                           System.out.println("Pozyskałeś jednego nowego klienta.");
                           break;
                       case 2:
                           ruchy += 1;
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
                   System.out.println("Twój stan konta to: " + "\r\n" + "$" + player.getFunds());
                   break;
               case 8:
                   //HISTORIA TRANSAKCJI
                   System.out.println("Samochody które sprzedałeś:" + "\r\n" + transakcje);
                   break;
               case 9:
                   //HISTORIA NAPRAW
                   System.out.println(naprawy);
                   break;
               case 10:
                   //SUMA KOSZTÓW NAPRAW I MYCIA POJAZDÓW
                   System.out.println("Na czyszczenie aut wydałeś łącznie: $" + (czyszczenie * 150));
                   System.out.println("Na naprawę aut wydałeś łącznie: $" + koszty);
                   System.out.println("Koszty prowadzenia działalności do tej port: $" + (koszty + czyszczenie * 150));
                   break;
               default:
                   System.out.println("Błędna komenda! Wpisz numer akcji którą chcesz wykonać.");
                   break;
           }
           if (player.getFunds() >= 40000){
               System.out.println("WYGRAŁEŚ!!!" + "\r\n" + "GRATULACJE!!!" + "\r\n" + "ILOŚĆ RUCHÓW: " + ruchy );
           }



       }
    }
}
