/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelariogrande;

public class Tutor extends EscuelaRioGrande {
    private Alumno alumno; // Alumno asignado al tutor

    public Tutor(int id, String nombre, String apellido, String correoElectronico, Alumno alumno) {
        super(id, nombre, apellido, correoElectronico); // constructor de la clase base
        this.alumno = alumno; // Asigna el alumno
    }

    // Implementación del método imprimirPerfil
    @Override
    public void imprimirPerfil() {
        System.out.println("Perfil del Tutor:");
        System.out.println("ID: " + getId() + ", Nombre: " + getNombre() + " " + getApellido() + ", Correo: " + getCorreoElectronico());
        System.out.println("Calificación del alumno " + alumno.getNombre() + ": " + alumno.getCalificacion());
    }

    // Método para mostrar la calificación del alumno
    public void mostrarCalificaciones() {
        System.out.println("Calificación del alumno " + alumno.getNombre() + ": " + alumno.getCalificacion());
    }
}
