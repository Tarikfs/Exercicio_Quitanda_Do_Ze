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

    Produto produto1 = new Produto(1, "Castanha", "Granel", 87.00, true);
    Produto produto2 = new Produto(2, "Pão", "Unidade", 7.50, false);
    Produto produto3 = new Produto(3, "Queijo", "Unidade", 20.00, true);
    Produto produto4 = new Produto(4, "Damasco", "Granel", 70.00, true);
    Produto produto5 = new Produto(5, "Nozes", "Granel", 97.00, true);
    Produto produto6 = new Produto(6, "Aveia", "Granel", 36.70, false);
    Produto produto7 = new Produto(7, "Leite Vegetal", "Unidade", 12.00, true);
    Produto produto8 = new Produto(8, "Pacote de Biscoitos", "Unidade", 12.80, true);

}
