//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cursojava.classes;

import java.util.Objects;

public class Disciplina {
    private double nota1;
    private String disciplina1;

    public Disciplina() {
    }

    public String getDisciplina1() {
        return this.disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public double getNota1() {
        return this.nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Disciplina)) {
            return false;
        } else {
            Disciplina that = (Disciplina)o;
            return Double.compare(that.getNota1(), this.getNota1()) == 0 && Objects.equals(this.disciplina1, that.disciplina1);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getNota1(), this.disciplina1});
    }

    public String toString() {
        return "Disciplina{nota1=" + this.nota1 + ", disciplina1='" + this.disciplina1 + "'}";
    }
}
