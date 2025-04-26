
package ejerc1s04;

public class Ejerc1S04 {

    public static void main(String[] args) {
        // TODO code application logic here
        ListaTareas miLista = new ListaTareas();

        miLista.agregarTarea("Comprar leche");
        miLista.agregarTarea("Leer un capítulo del libro");
        miLista.agregarTarea("Hacer ejercicio");

        miLista.mostrarTareas();

        miLista.marcarTareaCompletada(0);
        miLista.mostrarTareas();

        miLista.eliminarTarea(1);
        miLista.mostrarTareas();
    }
}
