import java.time.LocalDate;

public class VideoDaw {

    private String Cif;
    private String Direccion;
    private LocalDate FechaAlta;



    //Contructor
    VideoDaw(String Cif, String Direccion, LocalDate FechaAlta){
        this.Cif = Cif;
        this.Direccion = Direccion;
    }

    //Getter Setter

    public String getCif() {
        return Cif;
    }

    public String getDireccion() {
        return Direccion;
    }

    public LocalDate getFechaAlta() {
        return FechaAlta;
    }


    //Metodos

    public String InfoVideoDAW(){
        String info = "";

        info+="Cif :" + this.Cif + "\n";
        info+="Direccion :" + this.Direccion + "\n";
        info+="Fecha alta : "+ this.FechaAlta + "\n";
        return info;
    }




}



