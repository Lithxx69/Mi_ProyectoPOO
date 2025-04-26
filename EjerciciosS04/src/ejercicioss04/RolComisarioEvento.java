
package ejercicioss04;

public class RolComisarioEvento {
    private Evento evento;
    private Comisario comisario;
    private String rol;

    public RolComisarioEvento(Evento evento, Comisario comisario, String rol) {
        this.evento = evento;
        this.comisario = comisario;
        this.rol = rol;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Comisario getComisario() {
        return comisario;
    }

    public void setComisario(Comisario comisario) {
        this.comisario = comisario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
