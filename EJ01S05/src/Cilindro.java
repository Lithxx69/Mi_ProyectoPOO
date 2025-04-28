
public class Cilindro extends Circulo {
    double altura;

    public Cilindro() {
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" + "altura=" + altura + '}';
    }
    
    @Override
    public double calculaArea(){
        return 2 * Math.PI * Math.pow(radio, 2) + 2 * Math.PI * radio * altura;
    }
    
    public double calculaVolumen(){
        return Math.PI * Math.pow(radio, 2)  * altura;
    }
    
}
