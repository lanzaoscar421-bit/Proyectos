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
    public  Pelicula(String Titulo, Genero Genero) {

        this.Cod = String.format("P-%03d", contadorPeliculas);
        contadorPeliculas++;//Formato para que cada pelicula que se cree se sume

        this.Titulo = Titulo;
        this.Genero = Genero;
        this.Fecha = Fecha;
        this.Fechabaja = Fechabaja;
        this.FechaAlquiler = FechaAlquiler;
        this.Isalquilada = isIsalquilada();
    }

    //Getters-Setters

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


    public static String InfoPelicula(String cod, String titulo, Genero Genero,String Fecha,LocalDate Fechabaja,LocalDate FechaAlquiler,boolean Isalquilada){
        String info = "";
        String codPelicula = cod;
        String tituloPelicula = titulo;
        Genero GeneroPelicula = Genero;
        String FechaPelicula = Fecha;
        LocalDate FechabajaPelicula = Fechabaja;


        return info;
    }







}
