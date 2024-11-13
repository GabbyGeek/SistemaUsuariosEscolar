/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelariogrande;

public class Maestro extends EscuelaRioGrande {
    // Constructor
    public Maestro(int id, String nombre, String apellido, String correoElectronico) {
        super(id, nombre, apellido, correoElectronico);
    }
    
    @Override
    public void imprimirPerfil() {
        System.out.println("Perfil del Maestro:");
        System.out.println("ID: " + getId() + ", Nombre: " + getNombre() + " " + getApellido() + ", Correo: " + getCorreoElectronico());
    }
}

