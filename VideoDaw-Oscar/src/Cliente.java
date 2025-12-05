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
        this.Direccion = Direccion;
        this.FechaNacimiento = FechaNacimiento;
    }
    //Getters-Setters
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setNumeroSocio(int numeroSocio) {
        NumeroSocio = numeroSocio;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        FechaBaja = fechaBaja;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public void setPeliculasAlquiladas(int peliculasAlquiladas) {
        PeliculasAlquiladas = peliculasAlquiladas;
    }

    public void setDtf(DateTimeFormatter dtf) {
        this.dtf = dtf;
    }
    //Metodos

    public String InfoUsuario() {
        String info = "";
        info+="Dni :" + this.DNI + "\n";
        info+="Nombre :" + this.Nombre + "\n";
        info+="Numero Socio :" + this.NumeroSocio + "\n";
        info+="Direccion :" + this.Direccion + "\n";
        info+="Fecha Nacimiento:" + this.FechaNacimiento + "\n";
        info+="Fecha Baja:" + this.FechaBaja + "\n";
        info+="Tus peliculas alquiladas:" + this.PeliculasAlquiladas + "\n";
        return info;
    }
    
}
