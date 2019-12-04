package com.company;

public class Main {

    public static void main(String[] args) {

        String[] nems = new String[3];
        System.out.println(nems [0] );
        nems[0]="Adi";
        nems[1]="Aidai";
        nems[2]= "Aidar";
        System.out.println( nems[0]+ " " + nems[1] + " " +nems[2]);


        for ( int i = 0; i<= nems.length ; i++  ) {
            switch (i){
                case 0:
                    System.out.println("Доброе утра " + nems[0]);
                    break;
                case 1:
                    System.out.println("Дорый день "  + nems[1]);
                    break;
                case 2:
                    System.out.println("Добрый вечер "  + nems[2]);
                    break;

        }

        }

    }
}
