import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VideoDaw {

    private String Cif;
    private String Direccion;
    private String fechaAlta;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private String NombreVideo;

    //Enlace para las otras clases
    Pelicula peliculasRegistradas;
    Cliente clientesRegistrados;

    //Contructor
    VideoDaw(String Cif, String Direccion, String NombreVideo){//Etre parentesis lo que quieres que el usuario ponga obligatoriamente
        this.Cif = Cif;
        this.Direccion = Direccion; //Inicializa es decir que direccion inicia con la direccion de arriba
        this.fechaAlta = LocalDateTime.now().format(dtf);
    }

    //Getter Setter

    public String getCif() {
        return Cif;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setCif(String cif) {
        Cif = cif;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

//Metodos

    public void mostrarPeliculas(){

    }


    public String InfoVideoDAW(){
        String info = "";

        info+="Cif:" + this.Cif + "\n";
        info+="Direccion:" + this.Direccion + "\n";
        info+="Fecha alta: "+ this.fechaAlta + "\n";
        return info;
    }




}



