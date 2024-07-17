package br.com.alura.DesafioEncapsulamento.IdadePessoa;

public class Principal {

    public static void main(String[] args) {
        IdadePessoa idade = new IdadePessoa();
        idade.setNome("Romulo Nogueira de Souza");
        idade.setIdade(40);
        idade.verificaIdade();

        System.out.println( " O nome da pessoa é:  " + idade.getNome() + "🧑🏻‍💼");
        System.out.println(" A idade da pessoa é : " + idade.getIdade() + " anos 🔢");

        System.out.println(idade.verificaIdade());

    }
}
