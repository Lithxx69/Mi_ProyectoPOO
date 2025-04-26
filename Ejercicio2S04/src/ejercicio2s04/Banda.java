
package ejercicio2s04;

import java.util.ArrayList;
import java.util.List;

public class Banda {
    private int numeroBanda;
    private int totalMiembros;
    private List<Delincuente> miembros;

    public Banda(int numeroBanda, int totalMiembros) {
        this.numeroBanda = numeroBanda;
        this.totalMiembros = totalMiembros;
        this.miembros = new ArrayList<>();
    }

    public int getNumeroBanda() {
        return numeroBanda;
    }

    public void setNumeroBanda(int numeroBanda) {
        this.numeroBanda = numeroBanda;
    }

    public int getTotalMiembros() {
        return totalMiembros;
    }

    public void setTotalMiembros(int totalMiembros) {
        this.totalMiembros = totalMiembros;
    }

    public List<Delincuente> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<Delincuente> miembros) {
        this.miembros = miembros;
    }

    public void agregarMiembro(Delincuente delincuente) {
        this.miembros.add(delincuente);
        this.totalMiembros = this.miembros.size();
    }
}
