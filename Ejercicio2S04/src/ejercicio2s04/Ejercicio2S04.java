
package ejercicio2s04;

import java.time.LocalDate;

public class Ejercicio2S04 {

    public static void main(String[] args) {
        // TODO code application logic here
        Banco bancoCentral = new Banco("BC001", " Av. Principal 123");
        Banco bancoNacional = new Banco("BN002", " Calle Secundaria 456");

        // Crear sucursales
        Sucursal sucursalA = new Sucursal("SA001", "Jr. Libertad 789", 15);
        Sucursal sucursalB = new Sucursal("SB002", "Av. Progreso 321", 10);
        Sucursal sucursalC = new Sucursal("SC003", "Calle Lima 555", 20);

        // Agregar sucursales a los bancos
        bancoCentral.agregarSucursal(sucursalA);
        bancoCentral.agregarSucursal(sucursalB);
        bancoNacional.agregarSucursal(sucursalC);

        // Crear vigilantes
        Vigilante vigilante1 = new Vigilante("VG001", 35);
        Vigilante vigilante2 = new Vigilante("VG002", 28);
        Vigilante vigilante3 = new Vigilante("VG003", 40);

        // Contratar vigilantes en sucursales
        ContratacionVigilante contrato1 = new ContratacionVigilante(sucursalA, vigilante1, LocalDate.of(2024, 1, 15), "con arma");
        ContratacionVigilante contrato2 = new ContratacionVigilante(sucursalA, vigilante2, LocalDate.of(2024, 3, 20), "sin arma");
        ContratacionVigilante contrato3 = new ContratacionVigilante(sucursalB, vigilante1, LocalDate.of(2024, 5, 10), "con arma");
        ContratacionVigilante contrato4 = new ContratacionVigilante(sucursalC, vigilante3, LocalDate.of(2024, 7, 1), "con arma");

        // Registrar contrataciones en las sucursales y vigilantes
        sucursalA.contratarVigilante(contrato1);
        sucursalA.contratarVigilante(contrato2);
        sucursalB.contratarVigilante(contrato3);
        sucursalC.contratarVigilante(contrato4);
        vigilante1.agregarContratacion(contrato1);
        vigilante1.agregarContratacion(contrato3);
        vigilante2.agregarContratacion(contrato2);
        vigilante3.agregarContratacion(contrato4);

        // Crear delincuentes
        Delincuente delincuente1 = new Delincuente("DL001", "Ricardo Tapia");
        Delincuente delincuente2 = new Delincuente("DL002", "Elena Flores");

        // Crear banda
        Banda bandaLosReyes = new Banda(1, 2);
        bandaLosReyes.agregarMiembro(delincuente1);
        bandaLosReyes.agregarMiembro(delincuente2);
        delincuente1.setBanda(bandaLosReyes);
        delincuente2.setBanda(bandaLosReyes);

        // Registrar atracos
        Atraco atraco1 = new Atraco(sucursalA, delincuente1, LocalDate.of(2025, 3, 1));
        Atraco atraco2 = new Atraco(sucursalB, delincuente2, LocalDate.of(2025, 3, 15));
        Atraco atraco3 = new Atraco(sucursalA, delincuente2, LocalDate.of(2025, 4, 10));

        sucursalA.registrarAtraco(atraco1);
        sucursalA.registrarAtraco(atraco3);
        sucursalB.registrarAtraco(atraco2);
        delincuente1.realizarAtraco(atraco1);
        delincuente2.realizarAtraco(atraco2);
        delincuente2.realizarAtraco(atraco3);

        // --- Imprimir información para verificar ---
        System.out.println("Información de los Bancos:");
        System.out.println("Banco Central: Código=" + bancoCentral.getCodigoBanco() + ", Domicilio=" + bancoCentral.getDomicilioCentral() + ", Sucursales=" + bancoCentral.getSucursales().size());
        System.out.println("Banco Nacional: Código=" + bancoNacional.getCodigoBanco() + ", Domicilio=" + bancoNacional.getDomicilioCentral() + ", Sucursales=" + bancoNacional.getSucursales().size());

        System.out.println("\nInformación de las Sucursales:");
        System.out.println("Sucursal A: Código=" + sucursalA.getCodigoSucursal() + ", Domicilio=" + sucursalA.getDomicilioSucursal() + ", Empleados=" + sucursalA.getNumeroEmpleados() + ", Vigilantes=" + sucursalA.getContratacionesVigilantes().size() + ", Atracos=" + sucursalA.getAtracos().size());
        System.out.println("Sucursal B: Código=" + sucursalB.getCodigoSucursal() + ", Domicilio=" + sucursalB.getDomicilioSucursal() + ", Empleados=" + sucursalB.getNumeroEmpleados() + ", Vigilantes=" + sucursalB.getContratacionesVigilantes().size() + ", Atracos=" + sucursalB.getAtracos().size());
        System.out.println("Sucursal C: Código=" + sucursalC.getCodigoSucursal() + ", Domicilio=" + sucursalC.getDomicilioSucursal() + ", Empleados=" + sucursalC.getNumeroEmpleados() + ", Vigilantes=" + sucursalC.getContratacionesVigilantes().size() + ", Atracos=" + sucursalC.getAtracos().size());

        System.out.println("\nInformación de los Vigilantes:");
        System.out.println("Vigilante 1: Código=" + vigilante1.getCodigoVigilante() + ", Edad=" + vigilante1.getEdad() + ", Contrataciones=" + vigilante1.getContrataciones().size());
        System.out.println("Vigilante 2: Código=" + vigilante2.getCodigoVigilante() + ", Edad=" + vigilante2.getEdad() + ", Contrataciones=" + vigilante2.getContrataciones().size());
        System.out.println("Vigilante 3: Código=" + vigilante3.getCodigoVigilante() + ", Edad=" + vigilante3.getEdad() + ", Contrataciones=" + vigilante3.getContrataciones().size());

        System.out.println("\nInformación de los Delincuentes:");
        System.out.println("Delincuente 1: Código=" + delincuente1.getCodigoDelincuente() + ", Nombre=" + delincuente1.getNombreDelincuente() + ", Atracos=" + delincuente1.getAtracosRealizados().size() + ", Banda=" + (delincuente1.getBanda() != null ? delincuente1.getBanda().getNumeroBanda() : "Ninguna"));
        System.out.println("Delincuente 2: Código=" + delincuente2.getCodigoDelincuente() + ", Nombre=" + delincuente2.getNombreDelincuente() + ", Atracos=" + delincuente2.getAtracosRealizados().size() + ", Banda=" + (delincuente2.getBanda() != null ? delincuente2.getBanda().getNumeroBanda() : "Ninguna"));

        System.out.println("\nInformación de la Banda:");
        System.out.println("Banda Los Reyes: Número=" + bandaLosReyes.getNumeroBanda() + ", Miembros=" + bandaLosReyes.getMiembros().size() + ", Total Miembros=" + bandaLosReyes.getTotalMiembros());

        System.out.println("\nInformación de los Atracos:");
        System.out.println("Atraco 1: Sucursal=" + atraco1.getSucursal().getCodigoSucursal() + ", Delincuente=" + atraco1.getDelincuente().getCodigoDelincuente() + ", Fecha=" + atraco1.getFechaAtraco());
        System.out.println("Atraco 2: Sucursal=" + atraco2.getSucursal().getCodigoSucursal() + ", Delincuente=" + atraco2.getDelincuente().getCodigoDelincuente() + ", Fecha=" + atraco2.getFechaAtraco());
        System.out.println("Atraco 3: Sucursal=" + atraco3.getSucursal().getCodigoSucursal() + ", Delincuente=" + atraco3.getDelincuente().getCodigoDelincuente() + ", Fecha=" + atraco3.getFechaAtraco());

        System.out.println("\nInformación de las Contrataciones:");
        System.out.println("Contratación 1: Sucursal=" + contrato1.getSucursal().getCodigoSucursal() + ", Vigilante=" + contrato1.getVigilante().getCodigoVigilante() + ", Fecha=" + contrato1.getFechaContratacion() + ", Condición=" + contrato1.getCondicionContrato());
        System.out.println("Contratación 2: Sucursal=" + contrato2.getSucursal().getCodigoSucursal() + ", Vigilante=" + contrato2.getVigilante().getCodigoVigilante() + ", Fecha=" + contrato2.getFechaContratacion() + ", Condición=" + contrato2.getCondicionContrato());
        System.out.println("Contratación 3: Sucursal=" + contrato3.getSucursal().getCodigoSucursal() + ", Vigilante=" + contrato3.getVigilante().getCodigoVigilante() + ", Fecha=" + contrato3.getFechaContratacion() + ", Condición=" + contrato3.getCondicionContrato());
        System.out.println("Contratación 4: Sucursal=" + contrato4.getSucursal().getCodigoSucursal() + ", Vigilante=" + contrato4.getVigilante().getCodigoVigilante() + ", Fecha=" + contrato4.getFechaContratacion() + ", Condición=" + contrato4.getCondicionContrato());
    }
}
