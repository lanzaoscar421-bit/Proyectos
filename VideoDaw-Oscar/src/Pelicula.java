import java.time.LocalDate;

public class Pelicula {
    //Atributos

    private int Cod;
    private String Titulo;
    private Enum Genero;
    private LocalDate Fecha;
    private LocalDate Fechabaja;
    private LocalDate FechaAlquiler;
    private boolean Isalquilada;


    //Constructores
    public  Pelicula(int cod, String Titulo, Enum Genero,LocalDate Fecha,LocalDate Fechabaja,LocalDate FechaAlquiler,boolean Isalquilada) {

    }

    //Getters-Setters

    public int getCod() {
        return Cod;
    }

    public String getTitulo() {
        return Titulo;
    }

    public Enum getGenero() {
        return Genero;
    }

    public LocalDate getFecha() {
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


    public static String InfoPelicula(int cod, String titulo, Enum Genero,LocalDate Fecha,LocalDate Fechabaja,LocalDate FechaAlquiler,boolean Isalquilada){
        String info = "";
        int codPelicula = cod;
        String tituloPelicula = titulo;
        Enum GeneroPelicula = Genero;
        LocalDate FechaPelicula = Fecha;
        LocalDate FechabajaPelicula = Fechabaja;


        return info;
    }

}
