package com.company;

import java.util.Random;

public class Car {
    public String toString() {
        String marka = "MARKA: " + getMarka();
        String kolor = "KOLOR: " + getColor();
        String segment = "SEGMENT: " + getSegment();
        String value = "CENA: " + "$" + getValue();
        String km = "PRZEBIEG: " + przebieg + "KM";
        String rhyme = "\r\n" + marka + "\r\n" + kolor + "\r\n" + segment + "\r\n" + value + "\r\n" + km;
        String rhyme2 = "\r\n" + shamulce + "\r\n" + szawieszenie + "\r\n" + ssilnik + "\r\n" + skaroseria + "\r\n" + getSskrzynia() + "\r\n";
        return rhyme + "\r\n" + rhyme2;
    }

    public String toString2() {
        String naprawione = naprawa;
        String marka = "MARKA: " + getMarka();
        String kolor = "KOLOR: " + getColor();
        return marka + "\r\n" + kolor + "\r\n" + "NAPRAWIONY ELEMENT: " + naprawione + "\r\n";
    }

    private int przebieg;
    private double value;
    private String naprawa;
    private String marka;
    private String segment;
    private String color;
    private String shamulce;
    private String szawieszenie;
    private String ssilnik;
    private String skaroseria;
    private String sskrzynia;
    private boolean hamulce;
    private boolean zawieszenie;
    private boolean silnik;
    private boolean karoseria;
    private boolean skrzynia;
    private boolean sprawny;
    public String lista_marka[] = {"Fiat", "Ford", "BMW", "Audi", "Mercedes", "Tesla"};
    public String lista_color[] = {"Czarny", "Biały", "Szary", "Czerwony", "Niebieski"};
    public String lista_segment[] = {"Budget", "Standard", "Premium"};

    public Car() {
        Random random = new Random();
        int nr_segment = random.nextInt(3);
        int nr_marka = random.nextInt(6);
        int nr_color = random.nextInt(5);
        int nr_przebieg = random.nextInt(80000) + 10000;
        int cheap, medium, expensive;
        cheap = random.nextInt(5000) + 2500;
        medium = random.nextInt(10000) + 8000;
        expensive = random.nextInt(20000) + 18500;
        marka = lista_marka[nr_marka];
        color = lista_color[nr_color];
        segment = lista_segment[nr_segment];
        przebieg = nr_przebieg;

            if (getMarka() == lista_marka[0] || getMarka() == lista_marka[1]) {
                if (getSegment() == lista_segment[0]) {
                    value = cheap;
                } else if (getSegment() == lista_segment[1]) {
                    value = medium;
                } else {
                    value = expensive;
                }
            } else if (getMarka() == lista_marka[2] || getMarka() == lista_marka[3]) {
                if (getSegment() == lista_segment[0]) {
                    value = cheap;
                } else if (getSegment() == lista_segment[1]) {
                    value = medium;
                } else {
                    value = expensive;
                }
            } else {
                if (getSegment() == lista_segment[0]) {
                    value = cheap;
                } else if (getSegment() == lista_segment[1]) {
                    value = medium;
                } else {
                    value = expensive;
                }
            }

        int sprawnosclosowanie = random.nextInt(5);
        if (sprawnosclosowanie == 0) {
            setHamulce(false);
            shamulce = "HAMULCE: Zepsute";
        } else {
            setHamulce(true);
            shamulce = "HAMULCE: Sprawne";
        }
        if (sprawnosclosowanie == 1) {
            setZawieszenie(false);
            szawieszenie = "ZAWIESZENIE: W złym stanie";
        } else {
            setZawieszenie(true);
            szawieszenie = "ZAWIESZENIE: W dobrym stanie";
        }
        if (sprawnosclosowanie == 2) {
            setSilnik(false);
            ssilnik = "SILNIK: Zepsuty";
        } else {
            setSilnik(true);
            ssilnik = "SILNIK: Sprawny";
        }
        if (sprawnosclosowanie == 3) {
            setKaroseria(false);
            skaroseria = "KAROSERIA: W złym stanie";
        } else {
            setKaroseria(true);
            skaroseria = "KAROSERIA: W dobrym stanie";
        }
        if (sprawnosclosowanie == 4) {
            setSkrzynia(false);
            setSskrzynia("SKRZYNIE BIEGÓW: Zepsuta");
        } else {
            setSkrzynia(true);
            setSskrzynia("SKRZYNIA BIEGÓW: Sprawna");
        }
        if (hamulce == true && zawieszenie == true && silnik == true && karoseria == true && skrzynia == true) {
            setSprawny(true);
        }
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {

        this.marka = marka;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHamulce() {
        return hamulce;
    }

    public void setHamulce(boolean hamulce) {
        this.hamulce = hamulce;
    }

    public boolean isZawieszenie() {
        return zawieszenie;
    }

    public void setZawieszenie(boolean zawieszenie) {
        this.zawieszenie = zawieszenie;
    }

    public boolean isSilnik() {
        return silnik;
    }

    public void setSilnik(boolean silnik) {
        this.silnik = silnik;
    }

    public boolean isKaroseria() {
        return karoseria;
    }

    public void setKaroseria(boolean karoseria) {
        this.karoseria = karoseria;
    }

    public boolean isSkrzynia() {
        return skrzynia;
    }

    public void setSkrzynia(boolean skrzynia) {
        this.skrzynia = skrzynia;
    }

    public boolean isSprawny() {
        return sprawny;
    }

    public void setSprawny(boolean sprawny) {
        this.sprawny = sprawny;
    }

    public String getShamulce() {
        return shamulce;
    }

    public void setShamulce(String shamulce) {
        this.shamulce = shamulce;
    }

    public String getSzawieszenie() {
        return szawieszenie;
    }

    public void setSzawieszenie(String szawieszenie) {
        this.szawieszenie = szawieszenie;
    }

    public String getSsilnik() {
        return ssilnik;
    }

    public void setSsilnik(String ssilnik) {
        this.ssilnik = ssilnik;
    }

    public String getSkaroseria() {
        return skaroseria;
    }

    public void setSkaroseria(String skaroseria) {
        this.skaroseria = skaroseria;
    }

    public String getSskrzynia() {
        return sskrzynia;
    }

    public void setSskrzynia(String sskrzynia) {
        this.sskrzynia = sskrzynia;
    }

    public String getNaprawa() {
        return naprawa;
    }

    public void setNaprawa(String naprawa) {
        this.naprawa = naprawa;
    }

}
