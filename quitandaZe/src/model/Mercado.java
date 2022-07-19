package model;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

    List<Produto> produtos = new ArrayList<>();
    List<Usuario> usuarios = new ArrayList<Usuario>();

    public void listaProdutos() {
        Produto produtos1 = new Produto(1, "Castanhas", "Granel", 87.00, true);
        Produto produtos2 = new Produto(2, "Pão", "Unidade", 7.50, false);
        Produto produtos3 = new Produto(3, "Queijo", "Unidade", 20.00, true);
        Produto produtos4 = new Produto(4, "Damasco", "Granel", 70.00, true);
        Produto produtos5 = new Produto(5, "Nozes", "Granel", 97.00, true);
        Produto produtos6 = new Produto(6, "Aveia", "Granel", 36.70, false);
        Produto produtos7 = new Produto(7, "Leite Vegetal", "Unidade", 12.00, true);
        Produto produtos8 = new Produto(8, "Pacote de Biscoitos", "Unidade", 12.80, true);

        produtos.add(produtos1);
        produtos.add(produtos2);
        produtos.add(produtos3);
        produtos.add(produtos4);
        produtos.add(produtos5);
        produtos.add(produtos6);
        produtos.add(produtos7);
        produtos.add(produtos8);
    }

    public void listaUsuario() {
        Usuario usuario1 = new Funcionario(1, "João", 2000.00, 0.07);
        Usuario usuario2 = new Estagiario(2, "André", 1000.00, 0.03);
        Usuario usuario3 = new Estagiario(3, "Ana", 1000.00, 0.03);
        Usuario usuario4 = new Funcionario(4, "Lucia", 2000.00, 0.07);

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setFuncionarioEscolhido(Usuario usuario) {
    }

    public String getFuncionarioEscolhido() {
        return null;
    }

}
