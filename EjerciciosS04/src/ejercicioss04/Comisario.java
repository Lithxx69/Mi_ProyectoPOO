
package ejercicioss04;

import java.util.ArrayList;
import java.util.List;

public class Comisario {
    private int idComisario;
    private String nombre;
    private List<RolComisarioEvento> rolesEvento;

    public Comisario(int idComisario, String nombre) {
        this.idComisario = idComisario;
        this.nombre = nombre;
        this.rolesEvento = new ArrayList<>();
    }

    public int getIdComisario() {
        return idComisario;
    }

    public void setIdComisario(int idComisario) {
        this.idComisario = idComisario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<RolComisarioEvento> getRolesEvento() {
        return rolesEvento;
    }

    public void setRolesEvento(List<RolComisarioEvento> rolesEvento) {
        this.rolesEvento = rolesEvento;
    }

    public void agregarRolEvento(RolComisarioEvento rol) {
        this.rolesEvento.add(rol);
    }

    public List<Evento> getEventos() {
        List<Evento> eventos = new ArrayList<>();
        for (RolComisarioEvento rol : this.rolesEvento) {
            eventos.add(rol.getEvento());
        }
        return eventos;
    }
}
