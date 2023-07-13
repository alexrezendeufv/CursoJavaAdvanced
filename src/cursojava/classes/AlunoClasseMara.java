package cursojava.classes;

import cursojava.constantes.StatusAluno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class AlunoClasseMara {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    public List<Disciplina> disciplinas = new ArrayList();

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public AlunoClasseMara() {
    }

    public AlunoClasseMara(String nomeInicial) {
        this.nome = nomeInicial;
    }

    public AlunoClasseMara(String nomePadrao, int idadePadrao) {
        this.nome = nomePadrao;
        this.idade = idadePadrao;
    }

    public double getMedia() {
        double media = 0.0;

        Disciplina dis;
        for(Iterator var3 = this.disciplinas.iterator(); var3.hasNext(); media += dis.getNota1()) {
            dis = (Disciplina)var3.next();
        }

        return media / (double)this.disciplinas.size();
    }

    public boolean getAlunoAprovado() {
        double media = this.getMedia();
        return media >= 90.0;
    }

    public String getAlunoAprovado2() {
        double media = this.getMedia();
        if (media >= 50.0) {
            return media > 70.0 ? StatusAluno.APROVADO : StatusAluno.RECUPERACAO;
        } else {
            return StatusAluno.REPROVADO;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return this.registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return this.numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return this.nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return this.nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return this.dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return this.nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return this.serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof AlunoClasseMara)) {
            return false;
        } else {
            AlunoClasseMara that = (AlunoClasseMara)o;
            return Objects.equals(this.getNome(), that.getNome()) && Objects.equals(this.getNomeMae(), that.getNomeMae());
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getNome(), this.getNomeMae()});
    }
}