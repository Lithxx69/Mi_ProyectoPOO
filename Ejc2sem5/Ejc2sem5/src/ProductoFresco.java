
public class ProductoFresco {
    private String nombre;
    private String fechaCaducidad;
    private int numeroLote;
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String nombre, String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
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

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    
    
    public String mostrarDatosPF(){
        return "Nombre: " + nombre + "\n" +
               "Fecha de Caducidad: " + fechaCaducidad + "\n" +
               "Número de Lote: " + numeroLote + "\n" +
               "Fecha de Envasado: " + fechaEnvasado + "\n" +
               "País de Origen: " + paisOrigen;
    }
}
