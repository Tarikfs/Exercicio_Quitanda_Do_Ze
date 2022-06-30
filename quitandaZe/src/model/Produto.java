package model;

public class Produto {

    private int id;
    private String nomeProduto;
    private String tipo;
    private double preco;
    private boolean comissionavel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isComissionavel() {
        return comissionavel;
    }

    public void setComissionavel(boolean comissionavel) {
        this.comissionavel = comissionavel;
    }

    public Produto(int id, String nomeProduto, String tipo, double preco, boolean comissionavel) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.tipo = tipo;
        this.preco = preco;
        this.comissionavel = comissionavel;
    }

}
