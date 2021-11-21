package practicajavasofka;

/*
 * @author Daniel Santamaría Tavera
 */
public class Television extends Electrodomestico {
    private final int resolucionDefecto = 20;
    private final boolean sintonizadorTDT_Defecto = false;
    private int resolucion;
    boolean sintonizadorTDT;

    public Television() {
        this.resolucion = this.resolucionDefecto;
        this.sintonizadorTDT = this.sintonizadorTDT_Defecto;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = this.resolucionDefecto;
        this.sintonizadorTDT = this.sintonizadorTDT_Defecto;
    }

    public Television(int resolucion, boolean sintonizadorTDT, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    protected void precioFinal() {
        super.precioFinal(); 
        if (this.resolucion > 40){
            this.precioFinal = this.precioFinal + (this.precioBase*0.30);
        }
        if(this.sintonizadorTDT == true){
            this.precioFinal = this.precioFinal + 50;
        }
    }
}
