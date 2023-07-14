package cursojava.main;

import cursojava.classes.AlunoClasseMara;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClasseFilhas {

    public static void main(String[] args) {

        AlunoClasseMara aluno = new AlunoClasseMara();
        aluno.setNome("Alex JDev - Treinamento");
        aluno.setNomeMae("Claudiane");

        Diretor diretor = new Diretor();
        diretor.setNome("Raimundo");
        diretor.setRegistroGeral("udahsudhasud");

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administracao");
        secretario.setNome("Julia");
        secretario.setRegistro("16546asdsa64561");

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);


    }
}
