//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cursojava.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Loja {
    private String nomeLoja;
    private String donoLoja;
    private String endereço;
    private List<Carro> carros = new ArrayList();
    private List<Funcionario> funcionarios = new ArrayList();

    public List<Carro> getCarros() {
        return this.carros;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public Loja(String nomeLoja, String donoLoja, String endereço) {
        this.nomeLoja = nomeLoja;
        this.donoLoja = donoLoja;
        this.endereço = endereço;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public String getDonoLoja() {
        return this.donoLoja;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public double valorTotalCarro() {
        double valorT = 0.0;

        Carro carro;
        for(Iterator var3 = this.carros.iterator(); var3.hasNext(); valorT += carro.getPreco()) {
            carro = (Carro)var3.next();
        }

        return valorT;
    }

    public void listaFuncionarios() {
        Iterator var1 = this.getFuncionarios().iterator();

        while(var1.hasNext()) {
            Funcionario fun = (Funcionario)var1.next();
            System.out.println(fun.getNome());
        }

    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Loja)) {
            return false;
        } else {
            Loja loja = (Loja)o;
            return Objects.equals(this.getNomeLoja(), loja.getNomeLoja()) && Objects.equals(this.getDonoLoja(), loja.getDonoLoja()) && Objects.equals(this.getEndereço(), loja.getEndereço()) && Objects.equals(this.getCarros(), loja.getCarros());
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getNomeLoja(), this.getDonoLoja(), this.getEndereço(), this.getCarros()});
    }
}
