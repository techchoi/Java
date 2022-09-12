package Familia58;

import java.util.Scanner;

/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
public class ExercicioArrary3 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int [][] numeros = new int[3][3];
        int maiorDez=0,linha,coluna,contMaior=0;

        for(linha=0;linha<3;linha++){
            for(coluna=0;coluna<3;coluna++){
                System.out.println("\nEntre com um número: ");
                numeros[linha][coluna]=ler.nextInt();

                if (numeros[linha][coluna] > 10){
                     contMaior++;
                }
            }
        }
        System.out.println("\nQuantidade de números maiores que dez: "+contMaior);

    }
}
