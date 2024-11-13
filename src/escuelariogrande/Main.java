/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelariogrande;

public class Main {
    public static void main(String[] args) {
        // Código principal de la aplicación
        Maestro maestro = new Maestro(1, "Fernanda", "Ramirez", "fernanda.ramirez@riogrande.com.mx");
        Alumno alumno = new Alumno(2, "Gabriela", "Delgado", "gabriela.delgado@riogrande.com.mx", 90.5);
        Tutor tutor = new Tutor(3, "Miguel", "Correa", "miguel.correa@riogrande.com.mx", alumno);

        BaseDeDatos baseDeDatos = new BaseDeDatos();

        baseDeDatos.agregarUsuario(maestro);
        baseDeDatos.agregarUsuario(alumno);
        baseDeDatos.agregarUsuario(tutor);

        baseDeDatos.mostrarUsuarios();
    }
}

