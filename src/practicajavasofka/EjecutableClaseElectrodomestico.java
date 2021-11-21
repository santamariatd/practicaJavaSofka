package practicajavasofka;

/*
 * @author Daniel Santamaría Tavera
 */
public class EjecutableClaseElectrodomestico {
     public static void main(String[] args) {
       Electrodomestico lista [] = new Electrodomestico [10];
        double precioTotalLavadoras = 0;
        double precioTotalTV = 0;
        double precioTotalElectrodomesticos;
         for (int i = 0; i < 10; i++) {
            double precio = (double)(Math.random()*(500-100+1)+100);
            double peso = (double)(Math.random()*(100)+19);
            if (i % 2 == 0){
                Lavadora lavadora = new Lavadora (precio,peso);
                lista[i] = lavadora;
                lista[i].precioFinal();
                precioTotalLavadoras = precioTotalLavadoras + lista[i].precioFinal;
            }else {
                Television tv = new Television (precio,peso);
                lista[i] = tv;
                lista[i].precioFinal();
                precioTotalTV = precioTotalTV + lista[i].precioFinal;
            }
         }
         precioTotalElectrodomesticos = precioTotalLavadoras + precioTotalTV;
         System.out.println("El precio total de todas las lavadoras es: "+precioTotalLavadoras);
         System.out.println("El precio total de todos los televisores es: "+precioTotalTV);
         System.out.println("El precio total de todos los electrodomesticos es: "+precioTotalElectrodomesticos);
    }
}
