package catalogodefilmes;

public class Operadores {
    public static void main(String[] args) {
        //Operadores de atribuição
        int valor = 5;//Atribuição de valor
        valor += 15;//Adição
        System.out.println(valor);
        int b = 10 - 5;//Subtração
        System.out.println(b);
        int c = 10 * 5;//Multiplicação
        System.out.println(c);
        int d = 10 / 5;//Divisão
        System.out.println(d);
        int e = 10 % 5;//Módulo
        System.out.println(e);

        //Operadores relacionais
        double a = 10.0;
        double E = 5.0;
        double f = 30.0;

        boolean igual = (e ==  a);//Igualdade
        System.out.println(igual);
        boolean diferente = (b != a);//Diferente
        System.out.println(diferente);
        boolean maior = (b > a);//Maior
        System.out.println(maior);
        boolean menor = (b < E);//Menor
        System.out.println(menor);
        boolean maiorIgual = (b >= f);//Maior ou igual
        System.out.println(maiorIgual);
        boolean menorIgual = (b <= a);//Menor ou igual
        System.out.println(menorIgual);

        //Operadores lógicos
        /*
        * Esses operadores são usados quando queremos verificar duas ou
        *  mais condições e/ou expressões na aplicação. Eles fazem a
        *  comparação de valores booleanos e retornam também um
        * resultado booleano.
        * São três operadores: AND (&&), OR (||) e NOT (!).
        * O operador AND (&&), que traduzindo para o português seria o E,
        *  é usado para verificar se duas condições são verdadeiras.
        * Se ambas as condições forem verdadeiras, o resultado será verdadeiro.
        * Caso contrário, o resultado será falso.
        * */

        boolean eLogico = false;//(b == a && c > a);//E lógico
        System.out.println(eLogico);
        boolean ouLogico = (b == a || c > a);//OU lógico
        System.out.println(ouLogico);
        boolean negacao = (!igual);//Negação
        System.out.println(negacao);
        
    }
}
