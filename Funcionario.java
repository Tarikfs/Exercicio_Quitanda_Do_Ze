package model;

public class Funcionario extends Usuario {

    public Funcionario(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    private double salarioFuncionario;
    private double comissaoFuncionario;

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public double getComissaoFuncionario() {
        return comissaoFuncionario;
    }

    public void setComissaoFuncionario(double comissaoFuncionario) {
        this.comissaoFuncionario = comissaoFuncionario;
    }

    public Funcionario(int id, String nome, double salario, double salarioFuncionario, double comissaoFuncionario) {
        super(id, nome, salario);
        this.salarioFuncionario = salarioFuncionario;
        this.comissaoFuncionario = comissaoFuncionario;
    }

}
