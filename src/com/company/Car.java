package com.company;

import java.util.Random;

public class Car {
    public String toString(){
        String info = getMarka() + " " + getColor() + " " + getSegment() + " " + getValue();
        return info;
    }
    private int przebieg;
    private double value;
    private String marka;
    private String segment;
    private String color;
    public String lista_marka[] = {"Fiat" , "Ford" , "BMW", "Audi", "Mercedes", "Tesla"   };
    public String lista_color[] = {"Czarny", "Biały", "Szary", "Czerwony", "Niebieski"};
    public String lista_segment[] = {"Budget", "Standard", "Premium"};

        public Car(){
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

            if(getMarka() == lista_marka[0] || getMarka() == lista_marka[1]){
                if (getSegment() == lista_segment[0]){
                    value = cheap;
                }else if (getSegment() == lista_segment[1]){
                    value = medium;
                }else {
                    value = expensive;
                }
            } else if(getMarka() == lista_marka[2] || getMarka() == lista_marka[3]){
                if (getSegment() == lista_segment[0]){
                    value = cheap;
                }else if (getSegment() == lista_segment[1]){
                    value = medium;
                }else {
                    value = expensive;
                }
            }else {
                if (getSegment() == lista_segment[0]){
                    value = cheap;
                }else if (getSegment() == lista_segment[1]){
                    value = medium;
                }else {
                    value = expensive;
                }

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
}
