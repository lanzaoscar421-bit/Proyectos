import java.time.LocalDate;

public class Perro extends Mascotas {

    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, String estado, LocalDate fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    public String getRaza() {
        return raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }
    @Override
    public void info() {
        System.out.println("---- Perro ----");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Estado: " + getEstado());
        System.out.println("Fecha Nacimiento: " + getFechaNacimiento());
        System.out.println("Raza: " + raza);
        System.out.println("Tiene Pulgas " + pulgas);
    }

    public void habla() {
        System.out.println("guau guau");
    }

}
