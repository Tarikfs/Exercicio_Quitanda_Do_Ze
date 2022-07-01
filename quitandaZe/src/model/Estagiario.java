package model;

public class Estagiario extends Usuario {

    private double commissaoEsatagiario;

    public double getCommissaoEsatagiario() {
        return commissaoEsatagiario;
    }

    public void setCommissaoEsatagiario(double commissaoEsatagiario) {
        this.commissaoEsatagiario = commissaoEsatagiario;
    }

    public Estagiario(int id, String nome, double salario, double commissaoEsatagiario) {
        super(id, nome, salario);
        this.commissaoEsatagiario = commissaoEsatagiario;
    }

}
