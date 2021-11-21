package practicajavasofka;

/*
 * @author Daniel Santamaría Tavera
 */
public class Videojuego implements Entregable {
    private final String tituloDefecto = "Videojuego [Nuevo]";
    private final int horasEstimadasDefecto = 10;
    private final boolean entregadoDefecto = false;
    private final String generoDefecto = "Controlado";
    private final String companiaDefecto = "Desconocida [pendiente]";
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public Videojuego() {
        this.titulo = this.tituloDefecto;
        this.entregado = this.entregadoDefecto;
        this.horasEstimadas = this.horasEstimadasDefecto;
        this.genero = this.generoDefecto;
        this.compania = this.companiaDefecto;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.entregado = this.entregadoDefecto;
        this.horasEstimadas = horasEstimadas;
        this.genero = this.generoDefecto;
        this.compania = this.companiaDefecto;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.entregado = this.entregadoDefecto;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    
    @Override
    public String toString(){
        String respuesta = "Titulo: "+this.titulo+ " , Entregado: "+this.entregado+" , Horas estimadas: "+this.horasEstimadas
                +" , Genero: "+this.genero+" ,Compañía: "+this.compania;
        return respuesta;
    }
}
