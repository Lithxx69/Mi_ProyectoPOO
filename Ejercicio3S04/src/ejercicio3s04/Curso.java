
package ejercicio3s04;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String idCurso;
    private String nombreCurso;
    private String descripcionCurso;
    private int horasPorSemana;
    private List<Seccion> secciones;

    public Curso(String idCurso, String nombreCurso, String descripcionCurso, int horasPorSemana) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.horasPorSemana = horasPorSemana;
        this.secciones = new ArrayList<>();
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDescripcionCurso() {
        return descripcionCurso;
    }

    public void setDescripcionCurso(String descripcionCurso) {
        this.descripcionCurso = descripcionCurso;
    }

    public int getHorasPorSemana() {
        return horasPorSemana;
    }

    public void setHorasPorSemana(int horasPorSemana) {
        this.horasPorSemana = horasPorSemana;
    }

    public List<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(List<Seccion> secciones) {
        this.secciones = secciones;
    }

    public void agregarSeccion(Seccion seccion) {
        this.secciones.add(seccion);
        seccion.setCurso(this); // Establecer la relación bidireccional
    }
}
