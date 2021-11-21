package practicajavasofka;

/*
 * @author Daniel Santamaría Tavera
 */

public class Serie {
    private final int numeroTemporadasDefecto = 3;
    private final boolean entregadoDefecto = false;
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.titulo = "";
        this.numeroTemporadas = this.numeroTemporadasDefecto;
        this.entregado = this.entregadoDefecto;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = this.numeroTemporadasDefecto;
        this.entregado = this.entregadoDefecto;
        this.genero = "";
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = this.entregadoDefecto;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    
    @Override
    public String toString(){
        String respuesta = "Título: "+this.titulo+" , Número de temporadas: " +this.numeroTemporadas+" , Entregado: " 
                +this.entregado+" , Genero: " +this.genero+" , Creador: " +this.creador;
        return respuesta;
    }
}
