//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cursojava.main;

import cursojava.classes.Carro;
import cursojava.classes.Funcionario;
import cursojava.classes.Loja;

public class LojaMain {
    public LojaMain() {
    }

    public static void main(String[] args) {
        Loja loja = new Loja("car garagem", "filipe", "Rua comodoro");
        Carro car = new Carro();
        car.setMarca("Volkswagem");
        car.setModelo("gol");
        car.setAno("2020");
        car.setPreco(30000.0);
        Carro car1 = new Carro();
        car1.setMarca("Volkswagem");
        car1.setModelo("Jetta");
        car1.setAno("2019");
        car1.setPreco(32000.0);
        Carro car2 = new Carro();
        car2.setMarca("Fiat");
        car2.setModelo("Punto");
        car2.setAno("2019");
        car2.setPreco(22000.0);
        Carro car3 = new Carro();
        car3.setMarca("Huadya");
        car3.setModelo("Hb20");
        car3.setAno("2019");
        car3.setPreco(35000.0);
        loja.getCarros().add(car1);
        loja.getCarros().add(car2);
        loja.getCarros().add(car3);
        loja.getCarros().add(car);
        System.out.println(loja.valorTotalCarro());
        System.out.println(loja.getDonoLoja());
        System.out.println(loja.getNomeLoja());
        Funcionario fun1 = new Funcionario("Paula", "Gestão", "Analista");
        Funcionario fun2 = new Funcionario("Ricardo", "Rh", "Gestor de pessoas");
        loja.getFuncionarios().add(fun1);
        loja.getFuncionarios().add(fun2);
        System.out.println("====Lista de funcionarios=====");
        loja.listaFuncionarios();
    }
}
