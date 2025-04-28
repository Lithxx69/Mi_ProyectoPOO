
public class ProductoRefrigerado {
    private String nombre;
    private String fechaCaducidad;
    private int numeroLote;
    private int codigoDIGESA;

    public ProductoRefrigerado(String nombre, String fechaCaducidad, int numeroLote, int codigoDIGESA) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.codigoDIGESA = codigoDIGESA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public int getCodigoDIGESA() {
        return codigoDIGESA;
    }

    public void setCodigoDIGESA(int codigoDIGESA) {
        this.codigoDIGESA = codigoDIGESA;
    }
    
    public String mostrarDatosPR(){
        return "Nombre: " + nombre + "\n" +
               "Fecha de Caducidad: " + fechaCaducidad + "\n" +
               "Número de Lote: " + numeroLote + "\n" +
               "Código DIGESA: " + codigoDIGESA;
    }
}
