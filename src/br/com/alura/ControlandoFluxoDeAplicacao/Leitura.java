package br.com.alura.ControlandoFluxoDeAplicacao;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);//Criação de um objeto Scanner

        System.out.println("Digite seu filme favorito: ");//Leitura de dados
        String filmeFavorito = leitura.nextLine();//Leitura de dados
        System.out.println("O filme favorito é " + filmeFavorito);//Impressão

        System.out.println("Digite o nome do lançamento do filme favorito: ");
        int anoDeLancamento = leitura.nextInt();//Leitura de dados


        System.out.println(" Diga sua nota para o filme favorito: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filmeFavorito);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
