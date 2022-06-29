import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Produto;

public class MenuQuitandaZe {
    public void iniciaPrograma() throws Exception {
        System.out.println("Iniciando programa...");
        System.out.println("Programa iniciado!");
    }

    Scanner sc = new Scanner(System.in);
    int valor = 1;

    Produto produto1 = new Produto(1, "Castanha", "Granel", 87.00, true);
    Produto produto2 = new Produto(2, "Pão", "Unidade", 7.50, false);
    Produto produto3 = new Produto(3, "Queijo", "Unidade", 20.00, true);
    Produto produto4 = new Produto(4, "Damasco", "Granel", 70.00, true);
    Produto produto5 = new Produto(5, "Nozes", "Granel", 97.00, true);
    Produto produto6 = new Produto(6, "Aveia", "Granel", 36.70, false);
    Produto produto7 = new Produto(7, "Leite Vegetal", "Unidade", 12.00, true);
    Produto produto8 = new Produto(8, "Pacote de Biscoitos", "Unidade", 12.80, true);
    
    List<Produto> produtos = new ArrayList<>();
    produtos.add(produto1);
    produtos.add(produto2);
    produtos.add(produto3);
    produtos.add(produto4);
    produtos.add(produto5);
    produtos.add(produto6);
    produtos.add(produto7);
    produtos.add(produto8);
}
