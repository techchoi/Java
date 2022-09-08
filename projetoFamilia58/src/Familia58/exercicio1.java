package Familia58;

import java.util.Scanner;
//Faça um programa que receba três inteiros e diga qual deles é o maior.
public class exercicio1 {
    public static void main(String[] args){

        int n1,n2,n3,valorinicial;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite um número: ");
        n1 = leia.nextInt();
        System.out.println("\nDigite o segundo número: ");
        n2 = leia.nextInt();
        System.out.println("\nDigite o terceiro número: ");
        n3 = leia.nextInt();

        valorinicial=0;


        if (n1>valorinicial){valorinicial = n1;}
        if (n2>valorinicial){valorinicial = n2;}
        if (n3>valorinicial){valorinicial = n3;}
        System.out.println("\nMaior número: "+valorinicial);
    }
}
