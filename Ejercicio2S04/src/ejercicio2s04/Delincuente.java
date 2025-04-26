
package ejercicio2s04;

import java.util.ArrayList;
import java.util.List;

public class Delincuente {
    private String codigoDelincuente;
    private String nombreDelincuente;
    private List<Atraco> atracosRealizados;
    private Banda banda;

    public Delincuente(String codigoDelincuente, String nombreDelincuente) {
        this.codigoDelincuente = codigoDelincuente;
        this.nombreDelincuente = nombreDelincuente;
        this.atracosRealizados = new ArrayList<>();
        this.banda = null;
    }

    public String getCodigoDelincuente() {
        return codigoDelincuente;
    }

    public void setCodigoDelincuente(String codigoDelincuente) {
        this.codigoDelincuente = codigoDelincuente;
    }

    public String getNombreDelincuente() {
        return nombreDelincuente;
    }

    public void setNombreDelincuente(String nombreDelincuente) {
        this.nombreDelincuente = nombreDelincuente;
    }

    public List<Atraco> getAtracosRealizados() {
        return atracosRealizados;
    }

    public void setAtracosRealizados(List<Atraco> atracosRealizados) {
        this.atracosRealizados = atracosRealizados;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public void realizarAtraco(Atraco atraco) {
        this.atracosRealizados.add(atraco);
    }
}
