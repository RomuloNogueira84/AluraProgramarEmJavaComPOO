package ProjetoComOrientacaoObjetos;

import java.util.ArrayList;
import java.util.List;

public class Programas {
    public String getPopularidade;
    String nome;
    int anoDeLancamento;
    boolean orientadoAoObjeto;
    String paradigmaPrincipal;
    List<String> paradigmasSecundarios = new ArrayList<>();
    boolean tipificada;
    String sistemaDeTipos;
   private String popularidade;
    String facilidadeDeAprendizagem;
    boolean compiladaOuInterpretada;
    String performance;

    String getPopularidade() {
        return popularidade;
    }

    void exibePrograma() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Orientado ao objeto: " + orientadoAoObjeto);
        System.out.println("Paradigma principal: " + paradigmaPrincipal);
        System.out.println("Paradigmas secundários: " + paradigmasSecundarios);
        System.out.println("Tipificada: " + tipificada);
        System.out.println("Sistema de tipos: " + sistemaDeTipos);
        System.out.println("Popularidade: " + popularidade);
        System.out.println("Facilidade de aprendizagem: " + facilidadeDeAprendizagem);
        System.out.println("Performance: " + performance);
    }

    void avaliarDesempenho() {
        if (performance.equals("Alta")) {
            System.out.println("A linguagem " + nome + " possui alto desempenho.");
        } else if (performance.equals("Média")) {
            System.out.println("A linguagem " + nome + " possui desempenho médio.");
        } else {
            System.out.println("A linguagem " + nome + " possui baixo desempenho.");
        }
    }

    void verificarCompilacao() {
        if (compiladaOuInterpretada) {
            System.out.println("A linguagem " + nome + " é compilada.");
        } else {
            System.out.println("A linguagem " + nome + " é interpretada.");
        }
    }

    void mostrarParadigmas() {
        System.out.println("Paradigma principal: " + paradigmaPrincipal);
        if (!paradigmasSecundarios.isEmpty()) {
            System.out.println("Paradigmas secundários:");
            for (String paradigma : paradigmasSecundarios) {
                System.out.println("- " + paradigma);
            }
        }
    }
    void mediaPopular(String popularidade){
        if(popularidade.equals("Alta")){
            System.out.println("A popularidade do programa é alta.");
        }else if(popularidade.equals("Média")){
            System.out.println("A popularidade do programa é média.");
        }else{
            System.out.println("A popularidade do programa é baixa.");
        }
        if(popularidade.equals("Alta")){
            System.out.println("A popularidade do programa é alta.");
        }else if(popularidade.equals("Média")){
            System.out.println("A popularidade do programa é média.");
        }else{
            System.out.println("A popularidade do programa é baixa.");
        }

    }
}



