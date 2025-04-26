
package ejercicioss04;

import java.time.LocalDate;
import java.time.Duration;
import java.util.List;

public class EjerciciosS04 {

    public static void main(String[] args) {
        // TODO code application logic here
        Sede sedePrincipal = new Sede(1, 3, 1000000.0);
        Complejo complejo1 = new Complejo(101, "Zona Norte", "Cleimer Armas", 5000.0);
        Area area1 = new Area(201, "Pista de Atletismo", "Complejo 1");
        Area area2 = new Area(202, "Piscina Olímpica", "Complejo 1");
        Evento evento1 = new Evento(301, LocalDate.of(2025, 7, 20), Duration.ofHours(3), 100, 5);
        Comisario comisario1 = new Comisario(401, "Cristina Lopez");
        Comisario comisario2 = new Comisario(402, "Marcos Cruz");
        RolComisarioEvento rol1 = new RolComisarioEvento(evento1, comisario1, "Juez Principal");
        RolComisarioEvento rol2 = new RolComisarioEvento(evento1, comisario2, "Cronometrador");

        sedePrincipal.agregarComplejo(complejo1);
        complejo1.agregarArea(area1);
        complejo1.agregarArea(area2);
        complejo1.agregarEvento(evento1);
        evento1.agregarRolComisario(rol1);
        evento1.agregarRolComisario(rol2);
        comisario1.agregarRolEvento(rol1);
        comisario2.agregarRolEvento(rol2);

        System.out.println("Sede: " + sedePrincipal.getIdSede() + ", Presupuesto: " + sedePrincipal.getPresupuesto());
        if (!sedePrincipal.getComplejos().isEmpty()) {
            Complejo primerComplejo = sedePrincipal.getComplejos().get(0);
            System.out.println("Complejo en Sede: " + primerComplejo.getLocalizacion());
            System.out.println("Jefe de Organización del Complejo: " + primerComplejo.getJefeOrganizacion());
            System.out.println("Área Total Ocupada del Complejo: " + primerComplejo.getAreaTotalOcupada());

            List<Area> areasDelComplejo = primerComplejo.getAreas();
            if (!areasDelComplejo.isEmpty()) {
                System.out.println("\nÁreas del Complejo:");
                for (Area area : areasDelComplejo) {
                    System.out.println("- ID: " + area.getIdArea() + ", Descripción: " + area.getDescripcion() + ", Localización: " + area.getLocalizacion());
                }
            }

            if (!primerComplejo.getEventos().isEmpty()) {
                Evento primerEvento = primerComplejo.getEventos().get(0);
                System.out.println("\nEvento en Complejo: " + primerEvento.getIdEvento() + " - " + primerEvento.getFecha());
                List<Comisario> comisariosDelEvento = primerEvento.getComisarios();
                if (!comisariosDelEvento.isEmpty()) {
                    System.out.println("\nComisarios en el Evento:");
                    for (int i = 0; i < comisariosDelEvento.size(); i++) {
                        System.out.println("- Nombre: " + comisariosDelEvento.get(i).getNombre() + " (Rol: " + primerEvento.getRolesComisario().get(i).getRol() + ")");
                    }
                }
            }
        }
    }
}
