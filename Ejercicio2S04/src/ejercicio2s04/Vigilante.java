
package ejercicio2s04;

import java.util.ArrayList;
import java.util.List;

public class Vigilante {
    private String codigoVigilante;
    private int edad;
    private List<ContratacionVigilante> contrataciones;

    public Vigilante(String codigoVigilante, int edad) {
        this.codigoVigilante = codigoVigilante;
        this.edad = edad;
        this.contrataciones = new ArrayList<>();
    }

    public String getCodigoVigilante() {
        return codigoVigilante;
    }

    public void setCodigoVigilante(String codigoVigilante) {
        this.codigoVigilante = codigoVigilante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<ContratacionVigilante> getContrataciones() {
        return contrataciones;
    }

    public void setContrataciones(List<ContratacionVigilante> contrataciones) {
        this.contrataciones = contrataciones;
    }

    public void agregarContratacion(ContratacionVigilante contratacion) {
        this.contrataciones.add(contratacion);
    }
}
