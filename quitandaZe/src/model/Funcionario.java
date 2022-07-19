package model;

public class Funcionario extends Usuario {


    private double comissaoFuncionario;

    public double getComissaoFuncionario() {
        return comissaoFuncionario;
    }

    public void setComissaoFuncionario(double comissaoFuncionario) {
        this.comissaoFuncionario = comissaoFuncionario;
    }

    public Funcionario(int id, String nome, double salario, double comissaoFuncionario) {
        super(id, nome, salario);
        this.comissaoFuncionario = comissaoFuncionario;
    }

}
