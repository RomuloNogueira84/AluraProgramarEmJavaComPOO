package br.com.alura.DefinicaoMetodos;

public class Produto {
    String nome;
    double preco;
    double descontoParaPix;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
            double descontoFinal = preco - descontoParaPix;
        } else {
            double precoFinal = preco;
            return precoFinal;
        }
        return 0;
    }
}
