
public class Circulo {
    double radio;
    
    public Circulo(){        
    }
    
    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    public double calculaArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double calculaLongitud(){
        return 2 * Math.PI  * radio;
    }
}
