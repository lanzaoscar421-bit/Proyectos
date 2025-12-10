import java.time.LocalDate;

public class Trabajador {
    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String numeroSS;

    Trabajador(String nombre, String dni, LocalDate fechaNacimiento,String direccion,String numeroSS){

        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.numeroSS = numeroSS;

    }

    public String getNombre() {
        return nombre;
    }

    public String getdni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNumeroSS() {
        return numeroSS;
    }

    //Metodos

    @Override
    public String toString() {
        return "=== TRABAJADOR ===\n" +
                "DNI: " + dni + "\n" +
                "Fecha de nacimiento: " + fechaNacimiento + "\n" +
                "Dirección: " + direccion + "\n" +
                "Número SS: " + numeroSS + "\n" +
                "Nombre: " + nombre + "\n";
    }


}
