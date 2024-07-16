package ControlandoFluxoDeAplicacao;
//Codigo criado em estudo de Romulo Nogueira de Souza na Alura
public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1991;
        double notaDoFilme = 8.1;
        boolean incluidNoPlano = true;
        String tipoPlano = "plus";

        if(anoDeLancamento > 2023) {
            System.out.println("Lançamento que os clintes estao curtindo!");
        }else{
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (incluidNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme Liberado com sucesso!");
        }else {
            System.out.println("Filme não liberado deve pagar a locação");
        }
    }
}
