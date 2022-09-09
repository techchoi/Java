package Familia58;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)

input
numero int = 0
somaNum int = 0

processo
faca
digite numero // 2 // 1 // 0

enquanto (numero = 0) (
imprima ( " alguma mensagem ai")

)
somaNum = numero + somaNum  // 2 = 2 //somaNum = 1 + 2

output
imprima somaNum
 */
public class ExercicioDeRepeticao5 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

         int numero,somaNum=0;

         do{
             System.out.println("\nDigite um número: ");
             numero = leia.nextInt(); // 2 // 0
             somaNum = numero + somaNum;
         }
         while(numero != 0);
        {
            System.out.println("\nA soma total dos números é: "+somaNum);
        }




    }
}
