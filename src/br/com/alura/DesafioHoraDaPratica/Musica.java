package br.com.alura.DesafioHoraDaPratica;
//Crie uma classe Musica com atributos titulo, artista, anoLancamento,
// avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica,
// avaliar a música e calcular a média de avaliações.
    public class Musica {
        // Atributos
         String titulo;
         String artista;
         int anoLancamento;
         float avaliacao;
         int numAvaliacoes;

        // Construtor vazio que inicializa os atributo
        public Musica(String titulo, String artista, int anoLancamento) {
            this.titulo = titulo;
            this.artista = artista;
            this.anoLancamento = anoLancamento;
            this.avaliacao = 0.0f;
            this.numAvaliacoes = 0;
        }

        // Métodos para acessar os atributos
        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void exibirFichaTecnica() {
            System.out.println("Título: " + titulo);
            System.out.println("Artista: " + artista);
            System.out.println("Ano de lançamento: " + anoLancamento);
            System.out.println("Avaliação: " + avaliacao);
            System.out.println("Número de avaliações: " + numAvaliacoes);
        }

        public void avaliarMusica(float novaAvaliacao) {
            this.avaliacao = (this.avaliacao * this.numAvaliacoes + novaAvaliacao) / (this.numAvaliacoes + 1);
            this.numAvaliacoes++;
        }

        public float calcularMediaAvaliacoes() {
            if (this.numAvaliacoes == 0) {
                return 0.0f;
            } else {
                return this.avaliacao;
            }
        }
    }
