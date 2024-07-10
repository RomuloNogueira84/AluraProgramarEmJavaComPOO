import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gang: Ases Muito Loucos");
        int anoDeLancamento = 1991;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 +6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse = "Filme de comédia parodiando Top Gun Ases Indomaveis";
        System.out.println(sinopse);
        sinopse = """
                🧑🏻‍🎤🧑🏻‍🚀🧑🏻‍✈️🧑🏻‍💻🧑🏻‍🚒👰🏻🤵🏻🧑🏻‍🍼🫄🏻🦹🏻🦸🏻🧙🏻🧚🏻🧛🏻🧜🏻🏻‍🎤🧑🏻‍🚀🧑🏻‍✈️🧑🏻‍💻🧑🏻‍🚒👰🏻🤵🏻🧑🏻‍🍼🫄🏻🦹🏻🦸🏻🧙🏻🧚🏻🧛🏻🧜🏻
                
                Filme Top Gang: Ases Muito Loucos
                Filme de comédia parodiando Top Gun Ases Indomaveis
                Muito engraçado!
                Ano de Lançamento: 1991
                
                🏻‍🎤🧑🏻‍🚀🧑🏻‍✈️🧑🏻‍💻🧑🏻‍🚒👰🏻🤵🏻🧑🏻‍🍼🫄🏻🦹🏻🦸🏻🧙🏻🧚🏻🧛🏻🧜🏻🏻‍🎤🧑🏻‍🚀🧑🏻‍✈️🧑🏻‍💻🧑🏻‍🚒👰🏻🤵🏻🧑🏻‍🍼🫄🏻🦹🏻🦸🏻🧙🏻🧚🏻🧛🏻🧜🏻
                """;
        System.out.println(sinopse);

        double classificacao;
        classificacao = (media /2);
        System.out.println("Classificação: " + classificacao);







    }
}