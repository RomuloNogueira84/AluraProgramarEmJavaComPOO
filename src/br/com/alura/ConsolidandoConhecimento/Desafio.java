package br.com.alura.ConsolidandoConhecimento;
//Codigo criado em estudo de Romulo Nogueira de Souza na Alura
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Lex Luthor";
        String tipoConta = "Corrente";
        double saldo = 1000000.00;
        int opcao = 0;

        System.out.println("💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰");
        System.out.println("\n Nome do cliente: " + nome);
        System.out.println(" Tipo de conta: " + tipoConta);
        System.out.println(" Saldo da conta: " + saldo);
        System.out.println("💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰");

        String menu = """
                💵💵 Digite a sua escolha: 💵💵
                1- Consulta saldo
                2- Transferir saldo
                3- Sacar saldo
                4- Sair
                💵💵💵💵💵💵💵💵💵💵💵💵💵💵
                """;

        Scanner leitura = new Scanner (System.in);
        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            }else if(opcao == 2 ){
                System.out.println("Digite o valor a ser transferido: R$ ");
                double valor = leitura.nextDouble();
                if(valor> saldo){
                    System.out.println(" Não há saldo para transferir.");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado é  R$ " + saldo);
                }
            } else if(opcao == 3){
                System.out.println("Valor recebido: R$ ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado é R$ " + saldo);
            }else if(opcao == 4){
                System.out.println("Opção invalida.");
            }

        }
    }
}
