package com.company;

import java.util.Scanner;

public class P_2_vectorInversor {
    String[] original;
    String[] fake;
    Scanner scanner;

    public P_2_vectorInversor(){
        original=new String[5];
        fake=new String[5];

        scanner = new Scanner(System.in);

    }
    public void ejecutive(){
        for (int i = 0; i< original.length; i++){
            System.out.println("original [" + i +"]: ");
            String cadena = scanner.nextLine();
            original [i] = cadena;
        }
        int indiceOriginal=0;
        int indiceFake = 4;
        while (indiceOriginal< original.length){
            fake[indiceFake] = original[indiceOriginal];

            indiceOriginal++;
            indiceFake--;
        }
        for (int i = 0 ; i< fake.length; i++){
            System.out.println("inversor[" + i +"]: " + fake[i] );
        }
    }
}
