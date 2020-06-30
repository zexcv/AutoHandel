package com.company;

public class Mechanic {

    String mechanikimie;
    int mechanikcenahamulce;
    int mechanikcenazawieszenie;
    int mechanikcenasilnik;
    int mechanikcenakaroseria;
    int mechanikcenaskrzynia;
    int mechanikszansa;
    int mechanikbreak;

        public String toString(){
            String rhyme = mechanikimie + "\r\n"
                    + "NAPRAWA HAMULCÓW: $" + mechanikcenahamulce + "\r\n"
                    + "NARPAWA ZAWIESZENIA: $" + mechanikcenazawieszenie + "\r\n"
                    + "NAPRAWA SILNIKA: $" + mechanikcenasilnik + "\r\n"
                    + "NAPRAWA KAROSERII: $" + mechanikcenakaroseria + "\r\n"
                    + "NAPRAWA SKRZYNI BIEGÓW: $" + mechanikcenaskrzynia + "\r\n"
                    + "SKUTECZNOŚĆ: " + mechanikszansa + "%" + "\r\n"
                    + "SZANSA ZNISZCZENIA INNEJ CZĘŚCI:" + mechanikbreak + "%" + "\r\n";
            return rhyme;
        }



}
