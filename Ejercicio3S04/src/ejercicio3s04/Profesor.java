
package ejercicio3s04;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String idProfesor;
    private String nombreProfesor;
    private String telefonoProfesor;
    private double sueldoProfesor;
    private List<Seccion> seccionesImpartidas;

    public Profesor(String idProfesor, String nombreProfesor, String telefonoProfesor, double sueldoProfesor) {
        this.idProfesor = idProfesor;
        this.nombreProfesor = nombreProfesor;
        this.telefonoProfesor = telefonoProfesor;
        this.sueldoProfesor = sueldoProfesor;
        this.seccionesImpartidas = new ArrayList<>(); // ¡Inicializado!
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getTelefonoProfesor() {
        return telefonoProfesor;
    }

    public void setTelefonoProfesor(String telefonoProfesor) {
        this.telefonoProfesor = telefonoProfesor;
    }

    public double getSueldoProfesor() {
        return sueldoProfesor;
    }

    public void setSueldoProfesor(double sueldoProfesor) {
        this.sueldoProfesor = sueldoProfesor;
    }

    public List<Seccion> getSeccionesImpartidas() {
        return seccionesImpartidas;
    }

    public void setSeccionesImpartidas(List<Seccion> seccionesImpartidas) {
        this.seccionesImpartidas = this.seccionesImpartidas = (seccionesImpartidas != null) ? seccionesImpartidas : new ArrayList<>();
    }

    public void agregarSeccionImpartida(Seccion seccion) {
        if (seccion != null) { // Evitamos NullPointerException
            this.seccionesImpartidas.add(seccion);
        }
    }

}
