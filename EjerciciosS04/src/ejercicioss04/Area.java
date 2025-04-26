
package ejercicioss04;

public class Area {
    private int idArea;
    private String descripcion;
    private String localizacion;

    public Area(int idArea, String descripcion, String localizacion) {
        this.idArea = idArea;
        this.descripcion = descripcion;
        this.localizacion = localizacion;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
}
