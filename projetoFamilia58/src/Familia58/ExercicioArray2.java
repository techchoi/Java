package Familia58;

import java.util.Scanner;

/* Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados. ok
 */
public class ExercicioArray2 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int par,impar,somaPar=0,contImpar=0;
        int []vetor = new int[6];
        int x;

        for(x=0;x<6;x++){
            System.out.println("\nDigite um número: ");
            vetor[x] = ler.nextInt();
        }

        System.out.println("\nNúmero pares digitados: ");
        for(x=0;x<6;x++){
            if(vetor[x] % 2 == 0) {
                System.out.println(vetor[x]);
                somaPar += vetor[x];
            }
        }

        System.out.println("\nNúmeros ímpares digitados: ");
        for(x=0;x<6;x++){
            if(vetor[x] % 2 != 0){
                System.out.println(vetor[x]);
                contImpar ++;
            }
        }

        System.out.println("\nSoma dos números pares: "+somaPar);
        System.out.println("\nquantidade de números ímpares: "+contImpar);





    }
}
