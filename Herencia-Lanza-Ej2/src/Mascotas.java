import java.time.LocalDate;

public abstract class Mascotas {
    private String nombre;
    private int edad;
    private String estado;
    private LocalDate fechaNacimiento;

    public Mascotas(String nombre, int edad, String estado, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public abstract void info();

    public abstract void habla();

    public void cumplirAnios() {
        edad++;
    }

    public void morir() {
        estado = "Fallecido";
    }
}

