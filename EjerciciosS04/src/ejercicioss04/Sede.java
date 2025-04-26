
package ejercicioss04;

import java.util.List;
import java.util.ArrayList;

public class Sede {
    private int idSede;
    private int numeroComplejos;
    private double presupuesto;
    private List<Complejo> complejos;

    public Sede(int idSede, int numeroComplejos, double presupuesto) {
        this.idSede = idSede;
        this.numeroComplejos = numeroComplejos;
        this.presupuesto = presupuesto;
        this.complejos = new ArrayList<>();
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public int getNumeroComplejos() {
        return numeroComplejos;
    }

    public void setNumeroComplejos(int numeroComplejos) {
        this.numeroComplejos = numeroComplejos;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<Complejo> getComplejos() {
        return complejos;
    }

    public void setComplejos(List<Complejo> complejos) {
        this.complejos = complejos;
    }

    public void agregarComplejo(Complejo complejo) {
        this.complejos.add(complejo);
    }
}
