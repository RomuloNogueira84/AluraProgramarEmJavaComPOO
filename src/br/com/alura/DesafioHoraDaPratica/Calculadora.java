package br.com.alura.DesafioHoraDaPratica;

public class Calculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int numero = 10;
        System.out.println(calculadora.dobro(numero));

        int numero1 = 20;
        int calculadora1 = 10;
        int resultadoSoma = calculadora1;
        resultadoSoma = calculadora.soma(numero1);
        System.out.println("🔢🔢🔢🔢🔢🔢🔢🔢🔢🔢🔢");
        System.out.println(resultadoSoma);
        System.out.println("🔢🔢🔢🔢🔢🔢🔢🔢🔢🔢🔢");
    }

    public int dobro(int numero) {
        return numero * 2;
    }

    public int soma(int numero1) {
        int numero2= 10;
        return numero1 + numero2;
    }
}








