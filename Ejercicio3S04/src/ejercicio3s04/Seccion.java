
package ejercicio3s04;

import java.util.ArrayList;
import java.util.List;

public class Seccion {
    private String idSeccion;
    private String aula;
    private Profesor profesor;
    private Curso curso;  // Referencia al curso al que pertenece esta sección
    private List<Matricula> matriculas;

    public Seccion(String idSeccion, String aula, Profesor profesor) {
        this.idSeccion = idSeccion;
        this.aula = aula;
        this.profesor = profesor;
        this.matriculas = new ArrayList<>();
        this.curso = null; // Se establece cuando se asocia con un curso
    }

    public String getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(String idSeccion) {
        this.idSeccion = idSeccion;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
    
    public void matricularAlumno(Matricula matricula) {
        if (matricula != null) {
            this.matriculas.add(matricula);
        }
    }

}
