/*
 UNIVERSIDAD VIRTUAL DEL ESTADO DE GUANAJUANTO
    RETO 5. Proyecto final del paradigma orientado a objetos
 * Alumno: Luz Gabriela Delgado Bonilla
 * Matrícula: 23016576
 * Módulo: Programación Orientada a Objetos
 * Asesora: Yadira Márquez Barrios
 * Fecha de elaboración: 12 de noviembre de 2024
 */

package escuelariogrande;

public abstract class EscuelaRioGrande {
    private int id;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    
    // Constructor
    public EscuelaRioGrande(int id, String nombre, String apellido, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico; 
    }
    
    // Métodos getters
    public int getId(){
        return this.id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getCorreoElectronico(){
        return this.correoElectronico;
    }
    
    // Método abstracto para imprimir el perfil
    public abstract void imprimirPerfil();
}

