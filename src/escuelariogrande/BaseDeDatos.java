/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelariogrande;

import java.util.ArrayList;

public class BaseDeDatos {
    private ArrayList<EscuelaRioGrande> usuarios = new ArrayList<>();

    // Método para agregar un usuario a la "base de datos"
    public void agregarUsuario(EscuelaRioGrande usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario agregado: " + usuario.getNombre() + " " + usuario.getApellido());
    }

    // Método para mostrar todos los usuarios en la "base de datos"
    public void mostrarUsuarios() {
        System.out.println("\nMostrando todos los usuarios en la base de datos:");
        for (EscuelaRioGrande usuario : usuarios) {
            usuario.imprimirPerfil();
            System.out.println();
        }
    }
}

