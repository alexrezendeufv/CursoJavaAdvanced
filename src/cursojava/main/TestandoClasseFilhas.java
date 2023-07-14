package cursojava.main;

import cursojava.classes.AlunoClasseMara;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClasseFilhas {

    public static void main(String[] args) {

        AlunoClasseMara aluno = new AlunoClasseMara();
        aluno.setNome("Alex JDev - Treinamento");
        aluno.setNomeMae("Claudiane");
        aluno.setIdade(14);

        Diretor diretor = new Diretor();
        diretor.setNome("Raimundo");
        diretor.setRegistroGeral("udahsudhasud");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administracao");
        secretario.setNome("Julia");
        secretario.setRegistro("16546asdsa64561");
        secretario.setIdade(18);


        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade() + " -- " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());


    }
}
