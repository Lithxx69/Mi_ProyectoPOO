
package ejercicio3s04;

public class Matricula {
    private Alumno alumno;
    private Seccion seccion;
    private double nota;

    public Matricula(Alumno alumno, Seccion seccion, double nota) {
        this.alumno = alumno;
        this.seccion = seccion;
        this.nota = nota;
        alumno.matricularEnSeccion(this); // Establecer la relación bidireccional
        seccion.matricularAlumno(this);   // Establecer la relación bidireccional
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
