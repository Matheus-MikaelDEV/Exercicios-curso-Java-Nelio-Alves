package entities;

public class funcionario {
    public String nome;
    public double salario;
    public double taxa;

    public double salarioLiquido() {
        return salario - taxa;
    }

    public void aumentarSalario(double porcentagem) {
        salario += salario * porcentagem / 100.0;
    }
}
