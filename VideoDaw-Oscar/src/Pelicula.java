import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pelicula {
    //Atributos

    private static int contadorPeliculas = 1;
    private String Cod;
    private String Titulo;
    private Genero Genero;
    private String Fecha;
    private LocalDate Fechabaja;
    private LocalDate FechaAlquiler;
    private boolean Isalquilada;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


    //Constructores
    public Pelicula(String titulo, Genero genero) {
        this.Cod = String.format("P-%03d", contadorPeliculas);
        contadorPeliculas++;

        this.Titulo = titulo;
        this.Genero = genero;
        this.Fecha = LocalDate.now().toString();
        this.Fechabaja = null;
        this.FechaAlquiler = null;
        this.Isalquilada = false;
    }


    //Getters-Setters


    public static int getContadorPeliculas() {
        return contadorPeliculas;
    }

    public String getCod() {
        return Cod;
    }

    public String getTitulo() {
        return Titulo;
    }

    public Genero getGenero() {
        return Genero;
    }

    public String getFecha() {
        return Fecha;
    }

    public LocalDate getFechabaja() {
        return Fechabaja;
    }

    public LocalDate getFechaAlquiler() {
        return FechaAlquiler;
    }

    public boolean isIsalquilada() {
        return Isalquilada;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setGenero(Genero genero) {
        Genero = genero;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public void setIsalquilada(boolean isalquilada) {
        Isalquilada = isalquilada;
    }

    public String infopeli() {
        return  "--------- Información de la Película ---------\n" +
                "Código:          " + this.Cod + "\n" +
                "Título:          " + this.Titulo + "\n" +
                "Género:          " + this.Genero + "\n" +
                "Fecha alta:      " + this.Fecha + "\n" +
                "Fecha baja:      " + this.Fechabaja + "\n" +
                "Fecha alquiler:  " + this.FechaAlquiler + "\n" +
                "Alquilada?:     " + this.Isalquilada + "\n" +
                "------------------------------------------------";
    }









}
