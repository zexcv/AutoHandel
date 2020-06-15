package com.company;

import java.util.Scanner;
import com.company.Player;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        Scanner skaner = new Scanner(System.in);
        System.out.println("Jak się nazywasz?");
        player.name = skaner.nextLine();
        System.out.println("Cześć " + player.name + "!. Miło mi Cię powitać w Twoim nowym komisie samochodowym :-)");
        System.out.println("Na początek będziesz musiał kupić auto, żeby móc je potem sprzedać z zyskiem. Widzę, że masz $" + (player.getFunds()) + ". Wybierz auto które chciałbyś kupić:" );
    }
}
