//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cursojava.constantes;

public class StatusAluno {
    public static String APROVADO = "Aprovado";
    public static String RECUPERACAO = "Recuperacao";
    public static String REPROVADO = "Reprovado";

    public StatusAluno() {
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3.0;
        return media;
    }
}

