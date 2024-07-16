package br.com.alura.ControlandoFluxoDeAplicacao;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
            int numero = new Random().nextInt(100);//gera um número qualquer
            int tentativas = 0;//Este conta as tentativas
            Scanner imprima = new Scanner(System.in);//cria um objeto do tipo Scanner

            while(tentativas < 5){
                System.out.println("Digitando um valor entre 0 e 100 : ");
                int numeroDoUsuario = imprima.nextInt();
                if(numeroDoUsuario > numero){
                    System.out.println("O usuário optou por  um número maior.");
                    tentativas++;
                }else if(numeroDoUsuario < numero){
                    System.out.println("O usuário optou por  um número menor.");
                    tentativas++;
                }else{
                    System.out.println("O usuário acertou o numero escolhido.Você é o vencedor do jogo da adivinhação.");
                    break;
                }

                if (tentativas == 5 && numero!=numeroDoUsuario){
                    System.out.println("Você não conseguiu acertar o valor em 05 tentativas. O valor era :  " + numeroDoUsuario);
                }

            }
    }
}
