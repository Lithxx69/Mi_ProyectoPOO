
package ejercicio3s04;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3S04 {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // Crear carreras
            Carrera ingenieriaSistemas = new Carrera("IS01", "Ingeniería de Sistemas");
            Carrera administracion = new Carrera("AD01", "Administración de Empresas");

            // Crear profesores
            Profesor perez = new Profesor("PF001", "Juan Pérez", "987654321", 3500.0);
            Profesor gonzalez = new Profesor("PF002", "María González", "999888777", 4000.0);


            // Crear cursos
            Curso programacion1 = new Curso("CP01", "Programación I", "Introducción a la programación", 4);
            Curso calculo1 = new Curso("MA01", "Cálculo I", "Fundamentos del cálculo", 5);
            Curso administracionGeneral = new Curso("AG01", "Administración General", "Principios de la administración", 3);

            // Asignar cursos a carreras
            ingenieriaSistemas.agregarCurso(programacion1);
            ingenieriaSistemas.agregarCurso(calculo1);
            administracion.agregarCurso(administracionGeneral);

            // Crear secciones y asignar profesor y curso
            Seccion prog1A = new Seccion("S001", "A-101", perez);
            programacion1.agregarSeccion(prog1A);

            Seccion calc1B = new Seccion("S002", "B-205", gonzalez);
            calculo1.agregarSeccion(calc1B);

            Seccion admG1C = new Seccion("S003", "C-302", gonzalez);
            administracionGeneral.agregarSeccion(admG1C);

            Seccion prog1B = new Seccion("S004", "A-102", gonzalez);
            programacion1.agregarSeccion(prog1B);

            // Crear alumnos
            Alumno alumno1 = new Alumno("AL001", "Carlos López", "Av. Siempre Viva 123", "976543210", "carlos.lopez@email.com");
            Alumno alumno2 = new Alumno("AL002", "María Torres", "Calle Flores 456", "988776655", "maria.torres@email.com");
            Alumno alumno3 = new Alumno("AL003", "Pedro Gómez", "Jr. Los Pinos 789", "965432109", "pedro.gomez@email.com");

            // Matricular alumnos en secciones y asignar notas
            Matricula matricula1 = new Matricula(alumno1, prog1A, 15.5);
            Matricula matricula2 = new Matricula(alumno2, prog1A, 18.0);
            Matricula matricula3 = new Matricula(alumno1, calc1B, 12.3);
            Matricula matricula4 = new Matricula(alumno3, calc1B, 16.7);
            Matricula matricula5 = new Matricula(alumno2, admG1C, 19.5);
            Matricula matricula6 = new Matricula(alumno3, prog1B, 14.0);

            // Mostrar información
            imprimirInformacion(ingenieriaSistemas, administracion, perez, gonzalez, alumno1, alumno2, alumno3);

        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void imprimirInformacion(Carrera ingSis, Carrera admin, Profesor perez, Profesor gonzalez, Alumno... alumnos) {
        System.out.println("\n=== Información de Carreras ===");
        imprimirCarrera(ingSis);
        imprimirCarrera(admin);

        System.out.println("\n=== Información de Profesores ===");
        System.out.println("Profesor: " + perez.getNombreProfesor() + " (ID: " + perez.getIdProfesor() + ")");
        System.out.println("Profesor: " + gonzalez.getNombreProfesor() + " (ID: " + gonzalez.getIdProfesor() + ")");

        System.out.println("\n=== Información de Alumnos ===");
        for (Alumno alumno : alumnos) {
            imprimirAlumno(alumno);
        }
    }

    private static void imprimirCarrera(Carrera carrera) {
        System.out.println("Carrera: " + carrera.getNombreCarrera() + " (ID: " + carrera.getIdCarrera() + ")");
        System.out.println("  Cursos:");
        for (Curso curso : carrera.getCursos()) {
            System.out.println("    - " + curso.getNombreCurso() + " (ID: " + curso.getIdCurso() + ")");
        }
    }

    private static void imprimirAlumno(Alumno alumno) {
        System.out.println("Alumno: " + alumno.getNombreAlumno() + " (ID: " + alumno.getIdAlumno() + ")");
        System.out.println("  Matrículas:");
        for (Matricula matricula : alumno.getMatriculas()) {
            System.out.println("    - Sección: " + matricula.getSeccion().getIdSeccion() + ", Nota: " + matricula.getNota());
        }
    }
}
