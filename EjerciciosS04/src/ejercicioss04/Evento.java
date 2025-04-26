
package ejercicioss04;

import java.time.LocalDate;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private int idEvento;
    private LocalDate fecha;
    private Duration duracion;
    private int numeroParticipantes;
    private int numeroComisarios;
    private List<RolComisarioEvento> rolesComisario;

    public Evento(int idEvento, LocalDate fecha, Duration duracion, int numeroParticipantes, int numeroComisarios) {
        this.idEvento = idEvento;
        this.fecha = fecha;
        this.duracion = duracion;
        this.numeroParticipantes = numeroParticipantes;
        this.numeroComisarios = numeroComisarios;
        this.rolesComisario = new ArrayList<>();
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public int getNumeroComisarios() {
        return numeroComisarios;
    }

    public void setNumeroComisarios(int numeroComisarios) {
        this.numeroComisarios = numeroComisarios;
    }

    public List<RolComisarioEvento> getRolesComisario() {
        return rolesComisario;
    }

    public void setRolesComisario(List<RolComisarioEvento> rolesComisario) {
        this.rolesComisario = rolesComisario;
    }

    public void agregarRolComisario(RolComisarioEvento rol) {
        this.rolesComisario.add(rol);
    }

    public List<Comisario> getComisarios() {
        List<Comisario> comisarios = new ArrayList<>();
        for (RolComisarioEvento rol : this.rolesComisario) {
            comisarios.add(rol.getComisario());
        }
        return comisarios;
    }
}
