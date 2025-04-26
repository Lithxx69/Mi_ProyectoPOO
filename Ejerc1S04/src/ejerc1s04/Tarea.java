
package ejerc1s04;

public class Tarea {
    private String descripcion;
    private boolean completada;

    // Constructor
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false; // Por defecto, una tarea no está completada
    }

    // Getter para descripcion
    public String getDescripcion() {
        return descripcion;
    }

    // Setter para descripcion (opcional)
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter para completada
    public boolean isCompletada() {
        return completada;
    }

    // Setter para completada
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return descripcion + (completada ? " (Completada)" : " (Pendiente)");
    }
}
