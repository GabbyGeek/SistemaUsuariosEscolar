/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelariogrande;

public class Alumno extends EscuelaRioGrande {
    private double calificacion;

    // Constructor
    public Alumno(int id, String nombre, String apellido, String correoElectronico, double calificacion) {
        super(id, nombre, apellido, correoElectronico); // Llama al constructor de la clase base
        this.calificacion = calificacion; // Asigna la calificación
    }

    // Implementación del método imprimirPerfil
    @Override
    public void imprimirPerfil() {
        System.out.println("Perfil del Alumno:");
        System.out.println("ID: " + getId() + ", Nombre: " + getNombre() + " " + getApellido() + ", Correo: " + getCorreoElectronico() + ", Calificación: " + calificacion);
    }

    // Mostrar la calificación
    public void mostrarCalificaciones() {
        System.out.println("Calificación: " + calificacion);
    }

    // Actualizar la calificación
    public void guardarCalificacion(double calificacion) {
        this.calificacion = calificacion;
        System.out.println("Nueva calificación guardada: " + calificacion);
    }

    // Getter para acceder a la calificación
    public double getCalificacion() {
        return this.calificacion;
    }
}
