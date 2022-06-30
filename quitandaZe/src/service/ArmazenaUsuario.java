package service;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class ArmazenaUsuario {

    public static void armazenaUsuario(Usuario usuario) throws Exception {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Usuario usuario1 = new Usuario(1, "João", 2000.00);
        Usuario usuario2 = new Usuario(2, "André", 1000.00);
        Usuario usuario3 = new Usuario(3, "Ana", 1000.00);
        Usuario usuario4 = new Usuario(4, "Lucia", 2000.00);
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
    }
}
