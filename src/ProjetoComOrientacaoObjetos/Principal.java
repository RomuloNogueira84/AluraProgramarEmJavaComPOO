package ProjetoComOrientacaoObjetos;

public class Principal {
    public static void main(String[] args) {
        Programas programa = new Programas();
        programa.nome = "Java";
        programa.anoDeLancamento = 1995;
        programa.orientadoAoObjeto = true;
        programa.paradigmaPrincipal = "Orientado a objetos";
        programa.paradigmasSecundarios.add("Programação funcional");
        programa.tipificada = true;
        programa.sistemaDeTipos = "Tipos primitivos";
        programa.popularidade = "Alta";
        programa.facilidadeDeAprendizagem = "Facilidade de aprendizagem média";
        programa.compiladaOuInterpretada = true;
        programa.performance = "Alta";

        programa.exibePrograma();
        programa.avaliarDesempenho();
        programa.verificarCompilacao();
        programa.mostrarParadigmas();
    }
}
