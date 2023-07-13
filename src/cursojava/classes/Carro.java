//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cursojava.classes;

import java.util.Objects;

public class Carro {
    private String modelo;
    private String ano;
    private String marca;
    private double preco;
    private String cor;

    public Carro() {
    }

    public void ligar() {
        System.out.println("Carro está ligando");
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Carro)) {
            return false;
        } else {
            Carro carro = (Carro)o;
            return Double.compare(carro.getPreco(), this.getPreco()) == 0 && Objects.equals(this.getModelo(), carro.getModelo()) && Objects.equals(this.getAno(), carro.getAno()) && Objects.equals(this.getMarca(), carro.getMarca()) && Objects.equals(this.getCor(), carro.getCor());
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getModelo(), this.getAno(), this.getMarca(), this.getPreco(), this.getCor()});
    }
}
