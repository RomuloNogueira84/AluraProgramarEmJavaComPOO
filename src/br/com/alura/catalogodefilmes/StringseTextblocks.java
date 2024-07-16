package br.com.alura.catalogodefilmes;

public class StringseTextblocks {
    public static void main(String[] args) {
        /* Em java, a classe String é uma das mais importantes e utilizadas.
        Ela é responsável por representar uma sequência de caracteres,
        ou seja,um texto.
         */

        // Criação de Strings
        /* Para criar uma String em Java, basta utilizar aspas duplas
        para delimitar o texto.Por exemplo:
        String nome = "Romulo";

         */

        //Comparação de strings
        /*Em Java, é possivel comparar duas String
         utilizando o operador == . Porém,
        esse operador verifica apenas se as duas variaveis apontam
        para o mesmo objeto na memóriae não se o conteúdo das Strings
         é igual. Para comparar o  conteúdo de duas Strings,
         é necessario utilizar o operador equals().Por exemplo:*/

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        String nome = "Romulo";
        if(nome.equals("Romulo")){
            System.out.println("Nome é igual a Romulo");

        }else
            System.out.println("Pode ser qualquer um sem ser o Romulo");


        String barbaro = "Conan";
        String mago = "Merlin";
        if(barbaro.equals("Conan") && mago.equals("Merlin")){
            System.out.println("Tanto Conan quanto Merlin são humanos");
        }else{
            System.out.println("Um ou o dois não são humanos");
        }



        //Text Blocks
        /* Introduzido na versão 15 do Java, o texto em blocos
        é uma nova forma de representar Strings.
        que facilitam a escrita de textos com multiplas linhas.
        Em vez de utilizar aspas duplas para delimitar o texto e
         inserir quebras de linha manualmente, ou utilizar uma sintaxe
         mais simples que permite inserir texto exatamente como ele é.

         //Sintaxe do Text Block
         /* Para criar um text block em java ,basta utilizar  três aspas duplas
          para delimitar o texto,seguidas de uma quebra de linha por exemplo:
         */
        String mensagem = """
                Olá, mundo!
                Este é um text block
                Ele permite escrever multiplas linhas
                sem precisar usar caracteres de quebra de linha
                """;
        System.out.println(mensagem);

        String nome0 = "Romulo";
        int idade = 40;
        double valor = 8500.00;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais" ,nome0, idade, valor));

        String nome1 = "Romulo Nogueira";
        int aulas = 4;
        String mensagem1 = """
                Olá, %s!
                Bora codar e fazer o modulo Java!
                Teremos %d aulas para mostrar o poder da linguagem.
                """.formatted(nome1, aulas);
        System.out.println(mensagem1);
    }
}
