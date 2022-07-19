package model;

public class Estagiario extends Usuario {

    public Estagiario(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    private double commissaoEsatagiario;
    private double salarioEstagiario;

    public double getCommissaoEsatagiario() {
        return commissaoEsatagiario;
    }

    public void setCommissaoEsatagiario(double commissaoEsatagiario) {
        this.commissaoEsatagiario = commissaoEsatagiario;
    }

    public double getSalarioEstagiario() {
        return salarioEstagiario;
    }

    public void setSalarioEstagiario(double salarioEstagiario) {
        this.salarioEstagiario = salarioEstagiario;
    }

    public Estagiario(int id, String nome, double salario, double commissaoEsatagiario, double salarioEstagiario) {
        super(id, nome, salario);
        this.commissaoEsatagiario = commissaoEsatagiario;
        this.salarioEstagiario = salarioEstagiario;
    }

}
