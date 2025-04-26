
package ejercicio2s04;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String codigoSucursal;
    private String domicilioSucursal;
    private int numeroEmpleados;
    private List<ContratacionVigilante> contratacionesVigilantes;
    private List<Atraco> atracos;

    public Sucursal(String codigoSucursal, String domicilioSucursal, int numeroEmpleados) {
        this.codigoSucursal = codigoSucursal;
        this.domicilioSucursal = domicilioSucursal;
        this.numeroEmpleados = numeroEmpleados;
        this.contratacionesVigilantes = new ArrayList<>();
        this.atracos = new ArrayList<>();
    }

    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getDomicilioSucursal() {
        return domicilioSucursal;
    }

    public void setDomicilioSucursal(String domicilioSucursal) {
        this.domicilioSucursal = domicilioSucursal;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public List<ContratacionVigilante> getContratacionesVigilantes() {
        return contratacionesVigilantes;
    }

    public void setContratacionesVigilantes(List<ContratacionVigilante> contratacionesVigilantes) {
        this.contratacionesVigilantes = contratacionesVigilantes;
    }

    public List<Atraco> getAtracos() {
        return atracos;
    }

    public void setAtracos(List<Atraco> atracos) {
        this.atracos = atracos;
    }

    public void contratarVigilante(ContratacionVigilante contratacion) {
        this.contratacionesVigilantes.add(contratacion);
    }

    public void registrarAtraco(Atraco atraco) {
        this.atracos.add(atraco);
    }
}
