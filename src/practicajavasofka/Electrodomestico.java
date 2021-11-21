package practicajavasofka;

/*
 * @author Daniel Santamaría Tavera
 */
public class Electrodomestico {
    protected final double precioBaseDefecto = 100;
    protected final char consumoEnergeticoDefecto = 'F';
    protected final String colorDefecto = "BLANCO";
    protected final double pesoDefecto = 5;
    protected double precioBase;
    protected double precioFinal;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this.precioBase = this.precioBaseDefecto;
        this.color = this.colorDefecto;
        this.consumoEnergetico = this.consumoEnergeticoDefecto;
        this.peso = this.pesoDefecto;
        this.precioFinal();
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = this.colorDefecto;
        this.consumoEnergetico = this.consumoEnergeticoDefecto;
        this.peso = peso;
        this.precioFinal();
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = this.comprobarColor(color);
        this.consumoEnergetico = this.comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
        this.precioFinal();
    }
    
    private char comprobarConsumoEnergetico(char letra){
        if (letra=='A' || letra=='B' || letra=='C' || letra=='D' || letra=='E' || letra=='F'){
            this.consumoEnergetico = letra;
        }else{
            letra = this.consumoEnergeticoDefecto;
        }
        return letra;
    }
    
    private String comprobarColor(String color){
       if (color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS")){
            this.color = color;
        }else{
            color = this.colorDefecto;
        }
        return color;
    }
    
    protected void precioFinal(){
        char consumoEnerg = this.consumoEnergetico;
        switch(consumoEnerg){
            case 'A' -> this.precioFinal = this.precioBase + 100;
            case 'B' -> this.precioFinal = this.precioBase + 80;
            case 'C' -> this.precioFinal = this.precioBase + 60;
            case 'D' -> this.precioFinal = this.precioBase + 50;
            case 'E' -> this.precioFinal = this.precioBase + 30;
            case 'F' -> this.precioFinal = this.precioBase + 10;
        }
        if (this.peso>=0 && this.peso<=19){
            this.precioFinal = this.precioFinal + 10;
        } else if (this.peso>=20 && this.peso<=49) {
            this.precioFinal = this.precioFinal + 50;
        } else if (this.peso>=50 && this.peso<=79) {
            this.precioFinal = this.precioFinal + 80;
        } else {
            this.precioFinal = this.precioFinal + 100;
        }
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
    
    public double getPrecioBaseDefecto() {
        return precioBaseDefecto;
    }

    public char getConsumoEnergeticoDefecto() {
        return consumoEnergeticoDefecto;
    }

    public String getColorDefecto() {
        return colorDefecto;
    }

    public double getPesoDefecto() {
        return pesoDefecto;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
}
