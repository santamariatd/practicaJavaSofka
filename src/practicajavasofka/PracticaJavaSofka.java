package practicajavasofka;
import java.util.Scanner;
import java.util.LinkedList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @author Daniel Santamaría Tavera
 */
public class PracticaJavaSofka {
   
    public static void main(String[] args) {
        System.out.println("*****************************************************");
        System.out.println("PRÁCTICA DE JAVA - DANIEL SANTAMARÍA TAVERA - SOFKA U");
        System.out.println("*****************************************************");
        System.out.println("");
        System.out.println("EJERCICIO 1");
        int aleatorio1 = (int)(Math.random()*(100)+1);
        int aleatorio2 = (int)(Math.random()*(100)+1);
        System.out.println("El primer número aleatorio es: "+aleatorio1);
        System.out.println("El segundo número aleatorio es: "+aleatorio2);
        valorMayor(aleatorio1, aleatorio2);
        System.out.println("");
        System.out.println("EJERCICIO 2");
        double numero1 = ingresarNumero("Un número a su gusto");
        double numero2 = ingresarNumero("Otro número a su gusto");
        valorMayor(numero1, numero2);
        System.out.println("");
        System.out.println("EJERCICIO 3");
        double radio = ingresarNumero("Radio del circulo");
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del circulo es: "+ areaCirculo);
        System.out.println("");
        System.out.println("EJERCICIO 4");
        double precioProducto = ingresarNumero("Precio del producto sin IVA");
        final double IVA = 0.21;
        double precioFinal = precioProducto + precioProducto * IVA;
        System.out.println("El precio del producto con IVA es: "+precioFinal);
        System.out.println("");
        System.out.println("EJERCICIO 5");
        LinkedList pares = new LinkedList();
        LinkedList impares = new LinkedList();
        int i = 1;
        while (i<=100){
            if (i%2==0){pares.add(i);}
            else {impares.add(i);}
            i++;
        }
        System.out.println("Pares del 1 al 100 usando While:");
        i = 0;
        while(i < pares.size()){
            System.out.print(pares.get(i)+" ");
            i++;
        }
        System.out.println("");
        System.out.println("Impares del 1 al 100 usando While:");
        i = 0;
        while(i < impares.size()){
            System.out.print(impares.get(i)+" ");
            i++;
            if (i==impares.size()){
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("EJERCICIO 6");
        System.out.println("Pares del 1 al 100 usando For:");
        for (int j = 0; j <pares.size(); j++) {
            System.out.print(pares.get(j)+" ");
        }
         System.out.println("");
         System.out.println("Impares del 1 al 100 usando For:");
         for (int j = 0; j <impares.size(); j++) {
            System.out.print(impares.get(j)+" ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("EJERCICIO 7");
        boolean esMayorACero;
        int numero = 0;
        do{
            numero = (int) Math.round(ingresarNumero("Un número a su gusto mayor a cero"));
            esMayorACero = numero>0;
        } while (esMayorACero==false); 
        System.out.println("El número es: " + numero);
        System.out.println("");
        System.out.println("EJERCICIO 8");
        String dia = digitarCadena("Un día de la semana para verificar si es día laboral");
        boolean esLaboral = esDiaLaboral(dia.toUpperCase());
        if(esLaboral==true){System.out.println(dia + " es un día laboral");}
        else{System.out.println(dia + " no es un día laboral");}
        System.out.println("");
        System.out.println("EJERCICIO 9");
        String fraseOriginal = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println(fraseOriginal);
        String cadenaAConcatenar = digitarCadena("Cualquier frase o palabra para concatenarle a la frase anterior");
        System.out.println("La frase original es: "+fraseOriginal);
        System.out.println("La frase con las *a* modificadas por las *e* es: "+fraseOriginal.replace('a', 'e'));
        System.out.println("La frase original concatenada con la original es: "+fraseOriginal.concat(" " + cadenaAConcatenar));
        System.out.println("");
        System.out.println("EJERCICIO 10");
        String cadenaCualquiera = digitarCadena("Cualquier frase");
        System.out.println("La frase sin espacios es: " + cadenaCualquiera.replace(" ",""));
        System.out.println("");
        System.out.println("EJERCICIO 11");
        cadenaCualquiera = digitarCadena("Cualquier frase");
        int longitudCadena = cadenaCualquiera.length();
        System.out.println("La longitud de la frase es: " + longitudCadena);
        char temp;
        int cantidadA, cantidadE, cantidadI, cantidadO, cantidadU;
        cantidadA = cantidadE = cantidadI = cantidadO = cantidadU = 0;
        for (int j = 0; j < longitudCadena; j++) {
            temp = cadenaCualquiera.charAt(j);
            switch(temp){
            case 'a','A' -> cantidadA++;
            case 'e','E' -> cantidadE++;
            case 'i','I' -> cantidadI++;
            case 'o','O' -> cantidadO++;
            case 'u','U' -> cantidadU++;
            }
        }
        System.out.println("La cantidad de vocales a en la frase es: "+cantidadA);
        System.out.println("La cantidad de vocales e en la frase es: "+cantidadE);
        System.out.println("La cantidad de vocales i en la frase es: "+cantidadI);
        System.out.println("La cantidad de vocales o en la frase es: "+cantidadO);
        System.out.println("La cantidad de vocales u en la frase es: "+cantidadU);
        System.out.println("");
        System.out.println("EJERCICIO 12");
        String frase1 = digitarCadena("Cualquier frase");
        String frase2 = digitarCadena("Otra frase cualquiera");
        if (frase1.equals(frase2)){
            System.out.println("Ambas frases son iguales");
        }else {
            List<String> diferencias = encontrarDiferencias(frase1, frase2);
            System.out.println(diferencias);
        }
        System.out.println("");
        System.out.println("EJERCICIO 13");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha y hora actual en formato yyyy/MM/dd HH:mm:ss es "+dtf.format(LocalDateTime.now()));
        System.out.println("");
        System.out.println("EJERCICIO 14");
        numero = (int) Math.round(ingresarNumero("Un número a su gusto para llevarlo hasta 1000 con saltos de 2"));
        for (int j = numero; j <=1000; j+=2) {
            System.out.print((j) + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("EJERCICIO 15");
        int opcion = 0;
        while(opcion!=8){
            System.out.println("****** GESTION CINEMATOGRÁFICA ********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");
            opcion = (int) Math.round(ingresarNumero("Seleccione una opción del menú"));
            switch(opcion){
                case 1,2,3,4,5,6,7 -> System.out.println(":D");
                case 8 -> System.out.println("Gracias por su visita. Vuelva pronto");
                default -> System.out.println("Opción no válida");
            }
        }
        System.out.println("");
        System.out.println("EJERCICIO 16");
        System.out.println("Ejecutar la clase EjecutableClasePersona para ver su funcionamiento");
        System.out.println("");
        System.out.println("EJERCICIO 17");
        System.out.println("Ejecutar la clase EjecutableClaseElectrodomestico para ver su funcionamiento");
    }
    
    public static String digitarCadena(String texto){
        Scanner teclado = new Scanner(System.in);
        String textoCapturado;
        try{
            System.out.println("Digite el siguiente parámetro: "+texto);
            textoCapturado = teclado.nextLine();
        }catch(Exception e){
            textoCapturado = "";
        } 
        return textoCapturado;
    }
    
    public static double ingresarNumero(String texto){
        Scanner teclado = new Scanner(System.in);
        boolean numeroIngresado = false;
        double numero = 0;
        while(numeroIngresado==false){
            try{
                System.out.println("Digite el siguiente parámetro: "+texto);
                String valor = teclado.next();
                numero = Double.parseDouble(valor);
                numeroIngresado = true;
            }catch(NumberFormatException E){
                System.out.println("El valor ingresado no es válido");
            }
        }
        return numero;
    }
    
    public static void valorMayor(double a, double b){
        if(a > b){System.out.println("El primer valor es mayor al segundo");}
        else if (b> a){System.out.println("El segundo valor es mayor al primero");}
        else {System.out.println("Ambos valores son iguales");}
    }
    
    public static boolean esDiaLaboral(String dia){
        boolean respuesta = false;
        switch(dia){
            case "LUNES" -> respuesta = true;
            case "MARTES" -> respuesta = true;
            case "MIERCOLES" -> respuesta = true;
            case "JUEVES" -> respuesta = true;
            case "VIERNES" -> respuesta = true;
            case "SABADO" -> respuesta = false;
            case "DOMINGO" -> respuesta = false;
            default -> System.out.println("El valor ingresado no es válido");  
        }
        return respuesta;
    }
    
    public static List<String> encontrarDiferencias (String cadena1, String cadena2){
        List<String> lista1 = Arrays.asList(cadena1.split(""));
        List<String> lista2 = Arrays.asList(cadena2.split(""));
        
        List<String> union = new ArrayList<>(lista1);
        union.addAll(lista2);
        System.out.println(union);
        
        List<String> intercepto = new ArrayList<>(lista1);
        intercepto.retainAll(lista2);
        System.out.println(intercepto);
        
        union.removeAll(intercepto);
        
        return union;
    }
}
