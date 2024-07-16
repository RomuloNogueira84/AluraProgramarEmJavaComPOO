package br.com.alura.ControlandoFluxoDeAplicacao;

import java.util.Scanner;

public class ExemploScanner2 {
    public static void main(String[] args) {
        Scanner aniversarioRomulo = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = aniversarioRomulo.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = aniversarioRomulo.nextInt();
        System.out.println("Digite o valor que pretende investir em seu aniversário: ");
        double valor = aniversarioRomulo.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

        aniversarioRomulo.close();

    }
    }
