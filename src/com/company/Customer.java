package com.company;

import java.util.Random;


public class Customer {

    public String toString(){
        String imie  = "Klient: " + getCustomerName();
        String marka = "Ulubione marki: " + getCustomerFavoruite1() + " " + "i" + " " + getCustomerFavoruite2();
        String kasa = "Fundusze: " + " " + "$" + getCustomerMoney();
        String rhyme = imie + "\r\n" + marka + "\r\n" + kasa + "\r\n";
        return rhyme;

    }

    private String customerName;
    private int customerMoney;
    private String customerFavoruite1;
    private String customerFavoruite2;


    public String lista_marka[] = {"Fiat" , "Ford" , "BMW", "Audi", "Mercedes", "Tesla"   };
    String listaCustomer[] = {"Kasper", "Nela", "Patryk", "Rafał", "Karol", "Paula", "Krystian", "Grzegorz", "Sebastian", "Wojtek"};

    public Customer(){
        Random random = new Random();
        int customer$ = random.nextInt(38500) + 7500;
        int nr_marka = random.nextInt(6);
        int nr_klient = random.nextInt(10);
        setCustomerName(listaCustomer[nr_klient]);
        setCustomerMoney(customer$);
        setCustomerFavoruite1(lista_marka[nr_marka]);
        setCustomerFavoruite2(lista_marka[nr_marka]);
        if(customerFavoruite1 == customerFavoruite2){
            while(customerFavoruite1 == customerFavoruite2){
                nr_marka = random.nextInt(6);
                customerFavoruite2 = lista_marka[nr_marka];
            }
        }

    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(int customerMoney) {
        this.customerMoney = customerMoney;
    }

    public String getCustomerFavoruite1() {
        return customerFavoruite1;
    }

    public void setCustomerFavoruite1(String customerFavoruite1) {
        this.customerFavoruite1 = customerFavoruite1;
    }

    public String getCustomerFavoruite2() {
        return customerFavoruite2;
    }

    public void setCustomerFavoruite2(String customerFavoruite2) {
        this.customerFavoruite2 = customerFavoruite2;
    }
}
