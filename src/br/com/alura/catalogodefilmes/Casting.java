package br.com.alura.catalogodefilmes;

public class Casting {
    public static void main(String[] args) {
        //Casting
        /* Casting é um recurso utilizado para converter um tipo
         de dado em outro.Essa conversão pode ser feita de forma
         automatica pelo compilador (conversao implícita),quando
         o tipo de dado de origim,ou de forma manual(conversão
          explícita),utilizando o operador de casting.
          O casting é utilizado para permitir que tipos de dados
          incompatíveis sejam utilizados em operações ou expressões.
          Por exemplo:
          Se um método espera um parâmetro do tipo int, e o valor
          que se deseja passar é do tipo,double, é necessario fazer
          um casting para converter o valor em int.
         */

        //Casting implícito
        /*
        O casting implícito é realizado automaticamente pelo compilador
         quando o tipo de dado de origem é compatível com o tipo de
         dado de destino.
         Por exemplo:
         é possível atribuir um valor de tipo int a uma variável
         do tipo double, pois o tipo double é maior e suporta
         todos os valores que o tipo int pode armazenar:

         */
        int x = 10;//10
        double y = x;//Casting implícito
        System.out.println(y);//10.0

        //Casting explícito
        /*
        O casting explícito é realizado quando o tipo de dado
         de origem é incompatível com o tipo de dado de destino.
         Nesse caso, devemos utilizar o operador de casting para
         realizar a conversão:
         */
        double g = 10.5;//10.5
        int h = (int) g;//Casting explícito
        System.out.println(h);//10
        /*
        No exemplo anterior, o valor da variável x é convertido
        em um valor inteiro utilizando o casting explícito.
        É importante notar que, neste caso, a parte decimal
        será descartada e o valor atribuído à variável y será 10.

        Abaixo tem uma tabela, onde você pode visualizar mais facilmente
         as conversões que são implícitas e as que necessitam ser feitas
         de forma explícita.
         */


    }
}

