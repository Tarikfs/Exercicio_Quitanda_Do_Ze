import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Mercado;
import model.Produto;
import model.Usuario;
import service.ImprimeMenu;
import service.VoltarAoMenu;

public class MenuQuitandaZe {

    public void iniciaPrograma() throws Exception {
        System.out.println("Iniciando programa...");
        System.out.println("Programa iniciado!");

        int valor = 1;
        Scanner sc = new Scanner(System.in);
        int funcionarioEscolhido = 0;
        List<Produto> produtosSelecionados = new ArrayList<Produto>();
        Mercado m = new Mercado();
        m.listaProdutos();
        m.listaUsuario();

        do {
            ImprimeMenu.imprimeMenu();
            valor = sc.nextInt();
            VoltarAoMenu.VoltarAoMenu(sc);

            if (valor == 1) {
                System.out.println(("Lista de Funcionários"));
                for (Usuario usuario : m.getUsuarios()) {
                    System.out.println(usuario);

                }
            }
            if (valor == 2) {
                System.out.println(("Cadastro de produtos"));
                for (Produto produto : m.getProdutos()) {
                    System.out.println(produto);

                }

            }

            if (valor == 3) {
                for (Usuario usuario : m.getUsuarios()) {
                    System.out.println(usuario);
                }
                System.out.println(("selecione o ID do funcionario que realizou o atendimento"));
                funcionarioEscolhido = sc.nextInt();
                for (Usuario usuario : m.getUsuarios()) {
                    if (usuario.getId() == funcionarioEscolhido) {
                        System.out.println("funcionario selecionado: " + usuario);
                    }
                }

            }
            if (valor == 4) {
                if (funcionarioEscolhido == 0) {
                    System.out.println("selecione o ID do funcionario que realizou o atendimento");

                } else {
                    for (Produto produto : m.getProdutos()) {
                        System.out.println(produto);
                    }
                    System.out.println(("selecione o ID do produto que deseja comprar"));
                    int produtoEscolhido = sc.nextInt();
                    for (Produto produto : m.getProdutos()) {
                        if (produto.getId() == produtoEscolhido) {
                            produtosSelecionados.add(produto);
                            System.out.println("Lista de produtos selecionados: " + produtosSelecionados);
                            System.out.println("produto selecionado: " + produto);
                        }
                    }
                }

            }
            if (valor == 5) {
                System.out.println("Lista de produtos selecionados: " + produtosSelecionados);
            }

            if (valor == 6) {
                System.out.println("Lista de produtos selecionados: " + produtosSelecionados);
                System.out.println("digite o ID do produto que deseja remover");
                int produtoRemovido = sc.nextInt();
                for (Produto produto : produtosSelecionados) {
                    if (produto.getId() == produtoRemovido) {
                        System.out.println("removendo produto: " + produto);
                        produtosSelecionados.remove(produto);
                        System.out.println("\n Lista atualizada de produtos selecionados: " + produtosSelecionados);
                        break;
                    }
                }
            }
            // falta finalizar compra

        } while (valor != 0);
    }
}