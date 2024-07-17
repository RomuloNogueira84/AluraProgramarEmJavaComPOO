package br.com.alura.DesafioEncapsulamento.IdadePessoa;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean verificaIdade() {
        if (idade >= 18) {
            System.out.println("Você é maior que 18.");
        } else {
            System.out.println("Você é menor que 18.");
        }

        return true;
    }
}

