import java.util.Scanner;

import service.ImprimeMenu;
import service.VoltarAoMenu;

public class MenuQuitandaZe {

    public void iniciaPrograma() throws Exception {
        System.out.println("Iniciando programa...");
        System.out.println("Programa iniciado!");

        int valor = 1;
        Scanner sc = new Scanner(System.in);

        do {
            ImprimeMenu.imprimeMenu();
            valor = sc.nextInt();
            VoltarAoMenu.VoltarAoMenu(sc);

            if (valor == 1) {
            }

        } while (valor != 0);
    }
}