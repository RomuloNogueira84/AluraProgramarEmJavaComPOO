package br.com.alura.DesafioEncapsulamento.ContaBancaria;

public class Principal {
  public static void main(String[] args) {
      ContaBancaria conta = new ContaBancaria(1234, 1000000.00, "Romulo Nogueira de Souza");

      System.out.println("************************************************************************");
      System.out.println("O número da conta é: " + conta.getNumeroDoConta() +"💵");
      System.out.println("O saldo da conta é R$ : " + conta.getSaldo() + "💰");
      System.out.println("O titular da conta é: " + conta.getTitular() + "🧑🏻‍💼");
      System.out.println("************************************************************************");

  }
}
