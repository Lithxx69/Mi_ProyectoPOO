
package ejercicioss04;

import java.util.List;
import java.util.ArrayList;

public class Complejo {
    private int idComplejo;
    private String localizacion;
    private String jefeOrganizacion;
    private double areaTotalOcupada;
    private List<Area> areas;
    private List<Evento> eventos;

    public Complejo(int idComplejo, String localizacion, String jefeOrganizacion, double areaTotalOcupada) {
        this.idComplejo = idComplejo;
        this.localizacion = localizacion;
        this.jefeOrganizacion = jefeOrganizacion;
        this.areaTotalOcupada = areaTotalOcupada;
        this.areas = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public int getIdComplejo() {
        return idComplejo;
    }

    public void setIdComplejo(int idComplejo) {
        this.idComplejo = idComplejo;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getJefeOrganizacion() {
        return jefeOrganizacion;
    }

    public void setJefeOrganizacion(String jefeOrganizacion) {
        this.jefeOrganizacion = jefeOrganizacion;
    }

    public double getAreaTotalOcupada() {
        return areaTotalOcupada;
    }

    public void setAreaTotalOcupada(double areaTotalOcupada) {
        this.areaTotalOcupada = areaTotalOcupada;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public void agregarArea(Area area) {
        this.areas.add(area);
    }

    public void agregarEvento(Evento evento) {
        this.eventos.add(evento);
    }
}
