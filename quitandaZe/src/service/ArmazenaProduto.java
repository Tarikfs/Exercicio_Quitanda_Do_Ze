package service;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ArmazenaProduto {

    public void armazenaProduto(Produto produto) throws Exception {

        List<Produto> produtos = new ArrayList<>();
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

}
