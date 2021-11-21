package practicajavasofka;

/*
 * @author Daniel Santamaría Tavera
 */
public class Persona {
    private final String nombreDefecto = "";
    private final int edadDefecto = 0;
    private final char sexoDefecto = 'H';
    private final double pesoDefecto = 0;
    private final double alturaDefecto = 0;
    private String DNI;
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.DNI = this.generarDNI();
        this.nombre = this.nombreDefecto;
        this.edad = this.edadDefecto;
        this.sexo = this.sexoDefecto;
        this.peso = this.pesoDefecto;
        this.altura = this.alturaDefecto;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.DNI = this.generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = this.comprobarSexo(sexo);
        this.peso = this.pesoDefecto;
        this.altura = this.alturaDefecto;
    }
    
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.DNI = this.generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = this.comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    
    private String generarDNI(){
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int aleatorioNum;
        String aleatorio = "";
        for (int i = 0; i < 8; i++) {
            int auxiliar = (int)(Math.random()*(9)+1); 
            aleatorio = aleatorio + auxiliar;
        }
        aleatorioNum = Integer.parseInt(aleatorio);
        aleatorioNum = aleatorioNum % 23;
        aleatorio = aleatorio + letras[aleatorioNum];
       return aleatorio;
    }
    
     private char comprobarSexo(char valorIngresado){
        char sex;
        if (valorIngresado=='m' || valorIngresado=='M'){sex = 'M';}
        else {sex = 'H';}
        return sex;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = this.comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
    
    public int calcularIMC(){
        double imc = this.peso / Math.pow(this.altura, 2);
        int respuesta = 0;
        if (imc < 20){respuesta = -1;}
        else if(imc >= 20 && imc <= 25 ) {respuesta = 0;}
        else if (imc > 25){respuesta = 1;}
        return respuesta;    
    }
    
    @Override
    public String toString(){
        String informacion = ("DNI: "+this.DNI+" , Nombre: "+this.nombre+" , Edad: "+this.edad+" años" +" , Sexo: "+this.sexo+" , Peso: "+this.peso+" kg"+" , Altura: "+this.altura+" m");
        return informacion;
    }
}
