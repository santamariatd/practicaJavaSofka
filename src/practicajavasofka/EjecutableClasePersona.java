package practicajavasofka;
import java.util.Scanner;

/*
 * @author Daniel Santamaría Tavera
 */

public class EjecutableClasePersona {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        String nombre = teclado.next();
        boolean edadIngresada = false;
        int edad = 0;
        while(edadIngresada==false){
            try{
                System.out.println("Digite su edad: ");
                edad = teclado.nextInt();
                edadIngresada = true;
            }catch(Exception e){
                System.out.println("Error al ingresar dato numérico");
                edadIngresada = false;
            }
        }
        System.out.println("Digite su sexo (H:hombre M:mujer)");
        char sexo = 'H';
        sexo = teclado.next().charAt(0);
        boolean pesoIngresado = false;
        double peso = 0.0;
        while(pesoIngresado==false){
            try{
                System.out.println("Digite su peso(en Kg).Utilice coma para indicar decimal: ");
                peso = teclado.nextDouble();
                pesoIngresado = true;
            }catch(Exception e){
                System.out.println("Error al ingresar dato numérico");
                pesoIngresado = false;
            }
        }
        boolean alturaIngresada = false;
        double altura = 0.0;
        while(alturaIngresada==false){
            try{
                System.out.println("Digite su altura(en m).Utilice coma para indicar decimal: ");
                altura = teclado.nextDouble();
                alturaIngresada = true;
            }catch(Exception e){
                System.out.println("Error al ingresar dato numérico");
                alturaIngresada = false;
            }
        }
        Persona digitador = new Persona(nombre, edad, sexo, peso, altura);
        Persona lector = new Persona("Juan",19,'h');
        Persona observador = new Persona();
        observador.setNombre("Elizabeth");
        observador.setEdad(23);
        observador.setSexo('M');
        observador.setPeso(48.2);
        observador.setAltura(1.50);
        System.out.println("*****************");
        System.out.println("IMC de " + nombre);
        System.out.println("*****************");
        comprobarPesoIdeal(digitador);
        System.out.println("*****************");
        System.out.println("IMC de Juan");
        System.out.println("*****************");
        comprobarPesoIdeal(lector);
        System.out.println("*****************");
        System.out.println("IMC de Elizabeth");
        System.out.println("*****************");
        comprobarPesoIdeal(observador);
        System.out.println("*****************");
        System.out.println("Comprobación de edad de " + nombre);
        System.out.println("*****************");
        esMayor(digitador);
        System.out.println("*****************");
        System.out.println("Comprobación de edad de Juan");
        System.out.println("*****************");
        esMayor(lector);
        System.out.println("*****************");
        System.out.println("Comprobación de edad de Elizabeth");
        System.out.println("*****************");
        esMayor(observador);
        String informacion;
        System.out.println("*****************");
        System.out.println("Información de " + nombre);
        System.out.println("*****************");
        informacion = digitador.toString();
        System.out.println(informacion);
        System.out.println("*****************");
        System.out.println("Información de Juan");
        System.out.println("*****************");
        informacion = lector.toString();
        System.out.println(informacion);
        System.out.println("*****************");
        System.out.println("Información de Elizabeth");
        System.out.println("*****************");
        informacion = observador.toString();
        System.out.println(informacion);
    }
    
    public static void comprobarPesoIdeal(Persona evaluando){
        int interpretadorIMC = evaluando.calcularIMC();
        switch(interpretadorIMC){
            case -1 -> System.out.println("Está en su peso ideal");
            case 0 -> System.out.println("Está por debajo de su peso ideal");
            case 1 -> System.out.println("Está con sobrepeso");
        }
    }
    
    public static void esMayor(Persona evaluando){
        if (evaluando.esMayorDeEdad()==true){System.out.println("Es mayor de edad");}
        else{System.out.println("Es menor de edad");}
    }
}
