import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.Estagiario;
import model.Funcionario;
import model.Mercado;
import model.Produto;
import model.Usuario;
import service.ImprimeMenu;
import service.VoltarAoMenu;

public class MenuQuitandaZe {

    public void iniciaPrograma() throws Exception {
        System.out.println("Iniciando programa...");
        System.out.println("Programa iniciado!");

        int valor = 10;
        Scanner sc = new Scanner(System.in);
        int funcionarioEscolhido = 0;
        ArrayList<Produto> produtosSelecionados = new ArrayList<Produto>();
        List<Double> subtotalDeCompras = new ArrayList<>();
        double quantidadeDesejada = 0;
        Mercado m = new Mercado();
        m.listaProdutos();
        m.listaUsuario();

        do {
            ImprimeMenu.imprimeMenu();
            try {
                valor = sc.nextInt();
            } catch (InputMismatchException e) {
            }
            VoltarAoMenu.VoltarAoMenu(sc);

            if (valor < 0 || valor > 7) {
                System.out.println("Digite uma opção válida!");
            }

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
                try {
                    funcionarioEscolhido = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("digite um numero valido");
                }
                for (Usuario usuario : m.getUsuarios()) {
                    if (usuario.getId() != funcionarioEscolhido && funcionarioEscolhido >= m.getUsuarios().size() + 1
                            || funcionarioEscolhido < 0) {
                        System.out.println("ID invalido");
                        funcionarioEscolhido = 0;
                    }
                    if (usuario.getId() == funcionarioEscolhido) {
                        System.out.println("funcionario selecionado: " + usuario);
                    }
                }
            }
            if (valor == 4) {
                if (funcionarioEscolhido == 0) {
                    System.out.println("selecione o funcionario que realizou o atendimento");
                } else {
                    for (Produto produto : m.getProdutos()) {
                        System.out.println(produto);
                    }
                    System.out.println(("selecione o ID do produto que deseja comprar"));
                    try {
                        int produtoEscolhido = sc.nextInt();
                        if (produtoEscolhido < 0) {
                            System.out.println("selecione o produto novamente e digite um numero valido");
                        }
                        for (Produto produto : m.getProdutos()) {
                            if (produto.getId() == produtoEscolhido) {
                                if (produto.getTipo().equals("Granel")) {
                                    System.out.println("Quantidade de Kg Granel desejadas: ");
                                    quantidadeDesejada = sc.nextDouble();
                                    if (quantidadeDesejada < 0) {
                                        System.out
                                                .println("Selecione novamente o item e digite uma quantidade valida");
                                    } else {
                                        Double quantidadeCalculada = quantidadeDesejada * produto.getPreco();
                                        System.out.printf("Subtotal do item: %.2f\n", quantidadeCalculada);
                                        subtotalDeCompras.add(quantidadeCalculada);
                                        produtosSelecionados.add(produto);
                                        System.out.println("Lista de produtos selecionados: " + produtosSelecionados);
                                        System.out.println("produto selecionado: " + produto);
                                    }
                                } else {
                                    System.out.println("Quantidade de unidades desejadas: ");
                                    quantidadeDesejada = sc.nextInt();
                                    if (quantidadeDesejada < 0) {
                                        System.out
                                                .println("Seleecione novamente o item e digite uma quantidade valida");
                                    } else {
                                        Double quantidadeCalculada = quantidadeDesejada * produto.getPreco();
                                        System.out.printf("Subtotal do item: %.2f\n", quantidadeCalculada);
                                        subtotalDeCompras.add(quantidadeCalculada);
                                        produtosSelecionados.add(produto);
                                        System.out.println("Lista de produtos selecionados: " + produtosSelecionados);
                                        System.out.println("produto selecionado: " + produto);
                                    }
                                }
                            }
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("digite um numero valido");
                    }
                }
            }
            if (valor == 5) {
                for (int i = 0; i < produtosSelecionados.size(); i++) {
                    System.out.println(i + 1 + produtosSelecionados.get(i).formatoString() + "\nQuantidade= "
                            + quantidadeDesejada + " \nSubtotal do item= R$" + subtotalDeCompras.get(i) + "\n");
                }
            }
            if (valor == 6) {
                System.out.println("Limpando lista");
                subtotalDeCompras.clear();
                produtosSelecionados.clear();

            }
            if (valor == 7) {
                System.out.println("Finalizando compra");
                if (produtosSelecionados.size() == 0) {
                    System.out.println("Não há produtos selecionados");
                    break;
                }
                double valorFinal = 0;
                double comissao = 0;
                for (int i = 0; i < subtotalDeCompras.size(); i++) {
                    valorFinal += subtotalDeCompras.get(i);
                }
                Usuario usuarioSelecionado = null;
                for (Usuario usuario : m.getUsuarios()) {
                    if (usuario.getId() == funcionarioEscolhido) {
                        System.out.println("Funcionário: " + usuario.getNome());
                        usuarioSelecionado = usuario;
                    }
                }
                if (usuarioSelecionado instanceof Funcionario) {
                    double comissaoFuncionario = ((Funcionario) usuarioSelecionado).getComissaoFuncionario();
                    comissao = comissaoFuncionario * valorFinal;
                    System.out.printf("Valor final: R$ %.2f\nComissão do funcionário: R$ %.2f\n", valorFinal, comissao);
                    System.out.println("Lista de compras: ");
                    for (int i = 0; i < produtosSelecionados.size(); i++) {
                        System.out.println(i + 1 + produtosSelecionados.get(i).formatoString() + "\nQuantidade= "
                                + quantidadeDesejada + " \nSubtotal do item= R$" + subtotalDeCompras.get(i) + "\n");
                    }
                }
                if (usuarioSelecionado instanceof Estagiario) {
                    double comissaoEstagiario = ((Estagiario) usuarioSelecionado).getComissaoEstagiario();
                    comissao = comissaoEstagiario * valorFinal;
                    System.out.printf("Valor final: R$ %.2f\nComissão do estagiário: R$ %.2f\n", valorFinal, comissao);
                    System.out.println("Lista de compras: ");
                    for (int i = 0; i < produtosSelecionados.size(); i++) {
                        System.out.println(i + 1 + produtosSelecionados.get(i).formatoString() + "\nQuantidade= "
                                + quantidadeDesejada + " \nSubtotal do item= R$" + subtotalDeCompras.get(i) + "\n");
                    }

                }
            }
        } while (valor != 0);
    }
}