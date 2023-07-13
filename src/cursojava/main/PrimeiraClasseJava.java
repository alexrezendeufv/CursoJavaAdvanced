//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cursojava.main;

import cursojava.classes.AlunoClasseMara;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;
import java.awt.Component;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
    public PrimeiraClasseJava() {
    }

    public static void main(String[] args) {
        String login = JOptionPane.showInputDialog("Informe a Login: ");
        String senha = JOptionPane.showInputDialog("Informe a Senha: ");
        if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
            List<AlunoClasseMara> alunos = new ArrayList();
            HashMap<String, List<AlunoClasseMara>> maps = new HashMap();

            for(int ii = 0; ii <= 4; ++ii) {
                String nome = JOptionPane.showInputDialog("Qual nome do Aluno?" + ii);
                AlunoClasseMara aluno1 = new AlunoClasseMara();
                aluno1.setNome(nome);
                aluno1.setRegistroGeral("218912919812");
                aluno1.setNumeroCpf("033557355-07");
                aluno1.setNomeMae("Shirley");
                aluno1.setNomePai("Antonio");
                aluno1.setDataMatricula("10/01/2019");
                aluno1.setSerieMatriculado("5");

                int remover;
                for(remover = 0; remover <= 1; ++remover) {
                    String disciplina = JOptionPane.showInputDialog("Nome da disciplina" + remover + "?");
                    String nota = JOptionPane.showInputDialog("Nota da disciplina" + remover + "?");
                    Disciplina disciplinaObj = new Disciplina();
                    disciplinaObj.setDisciplina1(disciplina);
                    disciplinaObj.setNota1(Double.parseDouble(nota));
                    aluno1.getDisciplinas().add(disciplinaObj);
                }

                remover = JOptionPane.showConfirmDialog((Component)null, "Deseja remover alguma disciplina?");
                if (remover == 0) {
                    int continuarRemover = 0;

                    for(int posicao = 1; continuarRemover == 0; continuarRemover = JOptionPane.showConfirmDialog((Component)null, "Continuar a remover")) {
                        String rem = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4");
                        aluno1.getDisciplinas().remove(Integer.valueOf(rem) - posicao);
                        ++posicao;
                    }
                }

                alunos.add(aluno1);
            }

            maps.put(StatusAluno.APROVADO, new ArrayList());
            maps.put(StatusAluno.REPROVADO, new ArrayList());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList());
            Iterator var12 = alunos.iterator();

            AlunoClasseMara aluno;
            while(var12.hasNext()) {
                aluno = (AlunoClasseMara)var12.next();
                if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    ((List)maps.get(StatusAluno.APROVADO)).add(aluno);
                } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    ((List)maps.get(StatusAluno.RECUPERACAO)).add(aluno);
                } else {
                    ((List)maps.get(StatusAluno.REPROVADO)).add(aluno);
                }
            }

            System.out.println("-------------listas dos aprovados----------------");
            var12 = ((List)maps.get(StatusAluno.APROVADO)).iterator();

            PrintStream var10000;
            String var10001;
            while(var12.hasNext()) {
                aluno = (AlunoClasseMara)var12.next();
                var10000 = System.out;
                var10001 = aluno.getAlunoAprovado2();
                var10000.println(var10001 + " com media de = " + aluno.getMedia());
            }

            System.out.println("-------------listas dos em recuperacao----------------");
            var12 = ((List)maps.get(StatusAluno.RECUPERACAO)).iterator();

            while(var12.hasNext()) {
                aluno = (AlunoClasseMara)var12.next();
                var10000 = System.out;
                var10001 = aluno.getAlunoAprovado2();
                var10000.println(var10001 + " com media de = " + aluno.getMedia());
            }

            System.out.println("-------------listas dos em reprovados----------------");
            var12 = ((List)maps.get(StatusAluno.REPROVADO)).iterator();

            while(var12.hasNext()) {
                aluno = (AlunoClasseMara)var12.next();
                var10000 = System.out;
                var10001 = aluno.getAlunoAprovado2();
                var10000.println(var10001 + " com media de = " + aluno.getMedia());
            }

            System.out.println("==============================");
            System.out.println(StatusAluno.calcularMedia(70.0, 23.0, 93.0));
        } else {
            System.out.println("Usuario ou Senha incorretos");
        }

    }
}
