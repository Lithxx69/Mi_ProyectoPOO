
package ejercicio2s04;

import java.time.LocalDate;

public class Atraco {
    private Sucursal sucursal;
    private Delincuente delincuente;
    private LocalDate fechaAtraco;

    public Atraco(Sucursal sucursal, Delincuente delincuente, LocalDate fechaAtraco) {
        this.sucursal = sucursal;
        this.delincuente = delincuente;
        this.fechaAtraco = fechaAtraco;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Delincuente getDelincuente() {
        return delincuente;
    }

    public void setDelincuente(Delincuente delincuente) {
        this.delincuente = delincuente;
    }

    public LocalDate getFechaAtraco() {
        return fechaAtraco;
    }

    public void setFechaAtraco(LocalDate fechaAtraco) {
        this.fechaAtraco = fechaAtraco;
    }
}
