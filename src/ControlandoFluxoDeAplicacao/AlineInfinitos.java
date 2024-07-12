package ControlandoFluxoDeAplicacao;
//Codigo criado em estudo de Romulo Nogueira de Souza na Alura
//Questão: Infinitos 1 - Alice estava praticando seus
// conhecimentos sobre a estrutura de repetição while e
// teve a ideia de fazer um programa que apresentasse os
// números de 1 a 10. Assim, ela escreveu o seguinte trecho
// de código:
public class AlineInfinitos {
    public static void main(String[] args) {
        int contador = 1;

        while(contador <= 10) {
            System.out.println(contador);
            contador++;//incrementa o contador que Alice esqueceu.
        }
    }
}
