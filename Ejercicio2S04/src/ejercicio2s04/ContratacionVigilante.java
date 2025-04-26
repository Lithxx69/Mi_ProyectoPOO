
package ejercicio2s04;

import java.time.LocalDate;

public class ContratacionVigilante {
    private Sucursal sucursal;
    private Vigilante vigilante;
    private LocalDate fechaContratacion;
    private String condicionContrato;

    public ContratacionVigilante(Sucursal sucursal, Vigilante vigilante, LocalDate fechaContratacion, String condicionContrato) {
        this.sucursal = sucursal;
        this.vigilante = vigilante;
        this.fechaContratacion = fechaContratacion;
        this.condicionContrato = condicionContrato;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Vigilante getVigilante() {
        return vigilante;
    }

    public void setVigilante(Vigilante vigilante) {
        this.vigilante = vigilante;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getCondicionContrato() {
        return condicionContrato;
    }

    public void setCondicionContrato(String condicionContrato) {
        this.condicionContrato = condicionContrato;
    }
}
