package br.com.alura.Encapsulamento;



    public class Principal {

        public static void main(String[] args) {
            Filme favorito = new Filme();

            favorito.setNome("The Gladiator");
            favorito.setAnoDeLancamento(2000);
            favorito.setDuracaoEmMinutos(155);
            favorito.setIncluidoNoPlano(true);

            favorito.exibeFichaTecnica();
            favorito.avalia(9);
            favorito.avalia(10);
            favorito.avalia(9);

            System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());
        }

    }
