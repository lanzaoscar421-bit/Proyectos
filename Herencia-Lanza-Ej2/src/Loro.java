import java.time.LocalDate;

public class Loro extends Aves {

    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    public String getOrigen() {
        return origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void info() {

        System.out.println("---- Perro ----");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Estado: " + getEstado());
        System.out.println("Fecha Nacimiento: " + getFechaNacimiento());
        System.out.println("Pico: " + isPico());
        System.out.println("Vuela: " + isVuela());
        System.out.println("Origen: " + origen);
        System.out.println("Habla: " + habla);

    }
    public void habla() {

    }

    public void saluda() {
    }
    public void volar (){
    }
}
