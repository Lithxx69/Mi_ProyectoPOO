
package ejercicio2s04;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String codigoBanco;
    private String domicilioCentral;
    private List<Sucursal> sucursales;

    public Banco(String codigoBanco, String domicilioCentral) {
        this.codigoBanco = codigoBanco;
        this.domicilioCentral = domicilioCentral;
        this.sucursales = new ArrayList<>();
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getDomicilioCentral() {
        return domicilioCentral;
    }

    public void setDomicilioCentral(String domicilioCentral) {
        this.domicilioCentral = domicilioCentral;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void agregarSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }
}
