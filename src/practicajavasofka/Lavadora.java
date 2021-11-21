package practicajavasofka;

/*
 * @author Daniel Santamaría Tavera
 */
public class Lavadora extends Electrodomestico {
    private final double cargaDefecto = 5;
    private double carga;

    public Lavadora() {
        this.carga = this.cargaDefecto;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = this.cargaDefecto;
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    protected void precioFinal() {
        super.precioFinal(); 
        if (this.carga > 30){
            this.precioFinal = this.precioFinal + 50;
        }
    }
}
