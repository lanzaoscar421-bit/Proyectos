import java.time.LocalDate;

public class Canario extends Aves {

    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }


    public String getColor() {
        return color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void info() {

        System.out.println("---- Perro ----");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Estado: " + getEstado());
        System.out.println("Fecha Nacimiento: " + getFechaNacimiento());
        System.out.println("Pico: " + isPico());
        System.out.println("Vuela: " + isVuela());
        System.out.println("Color: " + color);
        System.out.println("Canta: " + canta);

    }

    public void habla(){

    }

    public void volar(){

    }


}
