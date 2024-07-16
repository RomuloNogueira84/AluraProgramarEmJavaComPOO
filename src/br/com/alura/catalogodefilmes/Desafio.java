package br.com.alura.catalogodefilmes;

public class Desafio {
    public static void main(String[] args) {
        /* Desafio 1 - Crie um programa que realize a média de duas
         notas decimais e exiba o resultado.
         */
        double mediaNota1 = 9.5;
        double mediaNota2 = 8.5;
        double media = (mediaNota1 + mediaNota2)/2;
        System.out.println("A média das notas é: " + media);

        /* Desafio 2 - Declare uma variável do tipo double e uma
        variável do tipo int. Faça o casting da variável double
         para int e imprima o resultado.
         */
        double meridianoDeArapiraca = 12.0;
        int graus = (int) meridianoDeArapiraca;
        System.out.println("O grau de Arapiraca é: " + graus);

        /* Desafio 3 - Declare uma variável do tipo char (letra)
         e uma variável do tipo String (palavra). Atribua valores
         a essas variáveis e concatene-as em uma mensagem.
         */
        char sexo = 'M';//Sexo masculino
        String nome = "Romulo Nogueira";//Meu nome
        String mensagem = " Meu nome é " + nome + " e meu sexo é: " + sexo;//Concatenação
        System.out.println(mensagem);

        /* Desafio 4 - Declare uma variável do tipo double
         precoProduto e uma variável do tipo int (quantidade).
          Calcule o valor total multiplicando o preço do produto
           pela quantidade e apresente o resultado em uma mensagem.
         */
        double precoProdutoBanana = 10.0;
        int quantidade = 5;
        double total = precoProdutoBanana * quantidade;
        System.out.println("O total a pagar pelas bananas é de : R$" + total + "💰");

        /* Desafio 5 - Declare uma variável do tipo double valorEmDolares.
         Atribua um valor em dólares a essa variável. Considere que o valor
          de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor
           em dólares para reais e imprima o resultado formatado.
         */
        double valorEmDolares = 10.0;
        double valorEmReais = valorEmDolares * 4.94;
        System.out.println("O valor em reais é de: R$" + valorEmReais + "💰");

        /* Desafio 6 - Declare uma variável do tipo double precoOriginal. Atribua um valor em reais
        a essa variável, representando o preço original de um produto. Em seguida, declare uma variável
        do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo,
        10 para 10%). Calcule o valor do desconto em reais, aplique-o ao
        preço original e imprima o novo preço com desconto.

         */
        double precoOriginal = 100.0;
        double percentualDesconto = 10.0;
        double precoDescontado = precoOriginal - (precoOriginal * percentualDesconto / 100);
        System.out.println("O novo preço com desconto é de: R$" + precoDescontado + "💰");





    }
}
