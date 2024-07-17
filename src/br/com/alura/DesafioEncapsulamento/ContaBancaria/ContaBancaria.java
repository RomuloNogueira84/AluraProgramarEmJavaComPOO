package br.com.alura.DesafioEncapsulamento.ContaBancaria;

public class ContaBancaria {
      private int numeroDoConta;
      private double saldo;
      private String titular;

      public ContaBancaria(int numeroDoConta, double saldo, String titular) {
            this.numeroDoConta = numeroDoConta;
            this.saldo = saldo;
            this.titular = titular;
      }

      public double getSaldo() {
            return saldo;
      }

      public void setSaldo(double saldo) {
            this.saldo = saldo;
      }

      public String getTitular() {
            return titular;
      }

      public void setTitular(String titular) {
            this.titular = titular;
      }

      public int getNumeroDoConta() {
            return numeroDoConta;
      }

      public void setNumeroDoConta(int numeroDoConta) {
            this.numeroDoConta = numeroDoConta;
      }
}
