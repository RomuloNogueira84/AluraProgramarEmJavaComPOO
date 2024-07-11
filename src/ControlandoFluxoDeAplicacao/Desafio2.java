package ControlandoFluxoDeAplicacao;

import java.util.Scanner;

/*Desafio 2 - Peça ao usuário para inserir dois números inteiros.
 Compare os números e imprima uma mensagem indicando se são iguais,
  diferentes, o primeiro é maior ou o segundo é maior.
 */
public class Desafio2 {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        Scanner numero = new Scanner(System.in);
        numero1=numero.nextInt();
        numero2=numero.nextInt();
        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        }

    }
}
