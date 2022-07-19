package model;

public class Estagiario extends Usuario {

    private double comissaoEstagiario;

    public double getComissaoEstagiario() {
        return comissaoEstagiario;
    }

    public void setComissaoEstagiario(double comissaoEstagiario) {
        this.comissaoEstagiario = comissaoEstagiario;
    }

    public Estagiario(int id, String nome, double salario, double comissaoEstagiario) {
        super(id, nome, salario);
        this.comissaoEstagiario = comissaoEstagiario;
    }

}
