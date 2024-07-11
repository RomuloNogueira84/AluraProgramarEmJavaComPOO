package ControlandoFluxoDeAplicacao;

import java.util.Scanner;

/*Desafio 1 - Crie um programa que solicite ao usuário digitar um número.
 Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
 */
public class Desafio1 {
    public static void main(String[] args) {
        Scanner positivoNegativo = new Scanner(System.in);
        int numero = positivoNegativo.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");

        }
        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

    }
}
