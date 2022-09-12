package Familia58;

import java.util.Scanner;

public class ArrayMatriz {
    public static void main(String[] args){

        int[][] numero = new int[2][3];
        //[] indica dimensões se tiver dois, significa linha e coluna
        int somaNumero=0,linha,coluna;

        Scanner ler = new Scanner(System.in);

        for(linha=0;linha<2;linha++){
            for(coluna=0;coluna<3;coluna++){

                System.out.println("\nEntre com um número: ");
                numero[linha][coluna] = ler.nextInt();

                if(numero[linha][coluna]>0){
                    somaNumero += numero[linha][coluna];

                    /* if(linha == coluna){
                     somaDiagonal += numero [linha][coluna];
                    }

                     */
                }
            }
        }

        System.out.println("\nSomatório dos números maiores que ZERO: "+somaNumero);


    }
}
