import java.time.LocalDate;

public class Gato extends Mascotas {

    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado, LocalDate fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    public String getColor() {
        return color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    @Override

    public void info(){
        System.out.println("---- Gato ----");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Estado: " + getEstado());
        System.out.println("Fecha Nacimiento: " + getFechaNacimiento());
        System.out.println("Color: " + color);
        System.out.println("Perlo laro " + peloLargo);
    }

    public void habla (){
        System.out.println("Miau Miau");
    }
}

