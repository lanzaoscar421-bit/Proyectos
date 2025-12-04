import java.time.LocalDate;

public class Pelicula {
    //Atributos

    private int Cod;
    private String Titulo;
    private Genero Genero;
    private LocalDate Fecha;
    private LocalDate Fechabaja;
    private LocalDate FechaAlquiler;
    private boolean Isalquilada;


    //Constructores
    public  Pelicula(int cod, String Titulo, Genero Genero,LocalDate Fecha,LocalDate Fechabaja,LocalDate FechaAlquiler,boolean Isalquilada) {

        this.Cod = cod;
        this.Titulo = Titulo;
        this.Genero = Genero;
        this.Fecha = Fecha;
        this.Fechabaja = Fechabaja;
        this.FechaAlquiler = FechaAlquiler;
        this.Isalquilada = isIsalquilada();
    }

    //Getters-Setters

    public int getCod() {
        return Cod;
    }

    public String getTitulo() {
        return Titulo;
    }

    public Genero getGenero() {
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


    public static String InfoPelicula(int cod, String titulo, Genero Genero,LocalDate Fecha,LocalDate Fechabaja,LocalDate FechaAlquiler,boolean Isalquilada){
        String info = "";
        int codPelicula = cod;
        String tituloPelicula = titulo;
        Genero GeneroPelicula = Genero;
        LocalDate FechaPelicula = Fecha;
        LocalDate FechabajaPelicula = Fechabaja;


        return info;
    }
    //
    private boolean isalquilada;
    public boolean estalquilada() {
        return isalquilada;
    }
//Metodo para alquilar y devolver pelicula
    public void alquilada() {
        if(!Isalquilada){
            isalquilada = true;
            FechaAlquiler = LocalDate.now();
        } else {
            System.out.println("Este pelicula esta alquilada");
        }
    }
    public void Devolver() {
        if(Isalquilada){
            isalquilada = false;
            FechaAlquiler = null;
        } else {
            System.out.println("Este pelicula no esta alquilada");
        }
    }







}
