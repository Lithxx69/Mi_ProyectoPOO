
public class ProductoCongelado {
    private String nombre;
    private String fechaCaducidad;
    private int numeroLote;
    private double temperatura;

    public ProductoCongelado(String nombre, String fechaCaducidad, int numeroLote, double temperatura) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.temperatura = temperatura;
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

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    
    public String mostrarDatosPC(){
        return "Nombre: " + nombre + "\n" +
               "Fecha de Caducidad: " + fechaCaducidad + "\n" +
               "Número de Lote: " + numeroLote + "\n" +
               "Temperatura de congelación: " + temperatura;
    }
}
