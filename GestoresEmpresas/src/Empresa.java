import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empresa {

    private String nombre;
    private String cif;
    private LocalDate fundacion;
    private int maximoTrabajadores;
    private int coleccionTrabajadores;
    //Constructor

    Empresa(String nombre,String cif){
        this.nombre = nombre;
        this.cif = cif;
        this.fundacion = fundacion;
        this.maximoTrabajadores = 0;
        this.coleccionTrabajadores = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }

    public LocalDate getFundacion() {
        return fundacion;
    }

    public int getMaximoTrabajadores() {
        return maximoTrabajadores;
    }

    public int getColeccionTrabajadores() {
        return coleccionTrabajadores;
    }
    // Metodos
    public String infoEmpresa() {
        return  "===== INFORMACIÓN DE LA EMPRESA =====\n" +
                "CIF:                 " + this.cif + "\n" +
                "Nombre:              " + this.nombre + "\n" +
                "Fundacion:     " + this.fundacion + "\n" +
                "Trabajadores:" + this.coleccionTrabajadores + "\n" +
                "==================================";
    }


}
