
package ejerc1s04;

import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private List<Tarea> tareas;

    // Constructor
    public ListaTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String descripcion) {
        Tarea nuevaTarea = new Tarea(descripcion);
        tareas.add(nuevaTarea);
        System.out.println("Tarea \"" + descripcion + "\" agregada.");
    }

    public void marcarTareaCompletada(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            Tarea tarea = tareas.get(indice);
            tarea.setCompletada(true);
            System.out.println("Tarea \"" + tarea.getDescripcion() + "\" marcada como completada.");
        } else {
            System.out.println("Índice de tarea inválido.");
        }
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            Tarea tareaEliminada = tareas.remove(indice);
            System.out.println("Tarea \"" + tareaEliminada.getDescripcion() + "\" eliminada.");
        } else {
            System.out.println("Índice de tarea inválido.");
        }
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("La lista de tareas está vacía.");
        } else {
            System.out.println("--- Lista de Tareas ---");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
            System.out.println("-----------------------");
        }
    }
}
