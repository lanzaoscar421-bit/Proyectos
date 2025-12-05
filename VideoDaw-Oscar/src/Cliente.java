import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {
    //Atributos

    private String DNI;
    private String Nombre;
    private int NumeroSocio;
    private String Direccion;
    private LocalDate FechaNacimiento; //Debe de ser mayor de edad
    private LocalDate FechaBaja;
    private int PeliculasAlquiladas;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    //Constructores
    public Cliente(String DNI, String Nombre, LocalDate FechaNacimiento) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.NumeroSocio = NumeroSocio;
        this.Direccion = Direccion;
        this.FechaNacimiento = FechaNacimiento;
        this.FechaBaja = FechaBaja;
    }
    //Getters-Setters

    public String getDNI() {
        return DNI;
    }

    public int getNumeroSocio() {
        return NumeroSocio;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public LocalDate getFechaBaja() {
        return FechaBaja;
    }

    public int getPeliculasAlquiladas() {
        return PeliculasAlquiladas;
    }

    public DateTimeFormatter getDtf() {
        return dtf;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
    //Metodos

    public String InfoUsuario() {
        String info = "";
        info+="Dni :" + this.DNI + "\n";
        info+="Nombre :" + this.Nombre + "\n";
        info+="Numero Socio :" + this.NumeroSocio + "\n";
        info+="Fecha Nacimiento:" + this.FechaNacimiento + "\n";
        info+="Fecha Baja:" + this.FechaBaja + "\n";
        info+="Tus peliculas alquiladas:" + this.PeliculasAlquiladas + "\n";
        return info;
    }
    
}
