import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VideoDaw {

    private String Cif;
    private String Direccion;
    private String fechaAlta;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private String NombreVideo;

    private int contadorPeliculas;
    private int contadorClientes;

    //Enlace para las otras clases//ARRAY
    private Pelicula[] peliculasRegistradas;
    private Cliente[] clientesRegistrados;

    //Contructor
    VideoDaw(String Cif, String Direccion, String NombreVideo){//Entre parentesis lo que quieres que el usuario ponga obligatoriamente
        this.Cif = Cif;
        this.Direccion = Direccion; //Inicializa es decir que direccion inicia con la direccion de arriba
        this.fechaAlta = LocalDateTime.now().format(dtf);
        this.clientesRegistrados = new Cliente[10];//  Array de 10
        this.peliculasRegistradas = new  Pelicula[10];
        this.contadorPeliculas = 0;
        this.contadorClientes = 0;
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


    public boolean sumarCliente(Cliente c){
        boolean resultado = false; //Si todo va mal no funciona

        if (c!=null){//Comprobamos que C exsiste
            if (this.contadorClientes==this.clientesRegistrados.length){// Comporbamos si esta todo lleno
                Cliente nuevalista [] = new Cliente[this.clientesRegistrados.length + 10];//Si todo lleno creamos un nuevo array que sume 10 lugares y este nuevo array estara VACIO
                for (int i=0; i<this.clientesRegistrados.length; i++){//Recorremos el array para todos los contenidos anteriores moverlos al nuevo array
                    nuevalista[i] = this.clientesRegistrados[i];//Estamos poniendo las posiciones de los clientes en el nuevo array, en la misma posicion que en el viejo array
                }
                this.clientesRegistrados = nuevalista;//Borramos viejo array para dejar solo el nuevo
            }
            clientesRegistrados[contadorClientes] = c;//Metiendo el cliente en la pocicion correcta de alrray que va a estar Vacia
            contadorClientes++;
            resultado=true;

        }
        return resultado;
    }
    public boolean sumarPelicula(Pelicula p){
        boolean resultado = false; //Si todo va mal no funciona

        if (p!=null){//Comprobamos que P exsiste
            if (this.contadorPeliculas==this.peliculasRegistradas.length){// Comporbamos si esta todo lleno
                Pelicula nuevalista [] = new Pelicula[this.peliculasRegistradas.length + 10];//Si todo lleno creamos un nuevo array que sume 10 lugares y este nuevo array estara VACIO
                for (int i=0; i<this.peliculasRegistradas.length; i++){//Recorremos el array para todos los contenidos anteriores moverlos al nuevo array
                    nuevalista[i] = this.peliculasRegistradas[i];//Estamos poniendo las posiciones de la pelicula en el nuevo array, en la misma posicion que en el viejo array
                }
                this.peliculasRegistradas = nuevalista;//Borramos viejo array para dejar solo el nuevo
            }
            peliculasRegistradas[contadorPeliculas] = p;//Metiendo la pelicula en la pocicion correcta de array que va a estar Vacia
            contadorPeliculas++;
            resultado=true;

        }
        return resultado;
    }

    public boolean alquilar(Cliente c, Pelicula p){//Pasamos informacion del cliente y la pelicula para alquilar
        boolean resultado = false; //Si todo va mal te dice que a fallado
        if(p!=null && c!=null && p.isIsalquilada() == false && p.getFechabaja() == null && c.getFechaBaja() == null){//Aseguracion de que todo este bien


        }

        return resultado;
    }


    public String InfoVideoDAW(){
        String info = "";

        info+="Cif:" + this.Cif + "\n";
        info+="Direccion:" + this.Direccion + "\n";
        info+="Fecha alta: "+ this.fechaAlta + "\n";
        return info;
    }


    public Cliente busquedaCliente (String NumeroSocio){
        //Array para recorrer usando el contador de clientes
        for (int i = 0; i < contadorClientes; i++){
            if (clientesRegistrados[i].getNumeroSocio().equalsIgnoreCase(NumeroSocio)) {
                return clientesRegistrados[i];
            }
        }
        return null;
    }

    public Pelicula buscarPelicula (String Cod){
        for (int i = 0; i < contadorPeliculas; i++){
            if (peliculasRegistradas[i].getCod().equalsIgnoreCase(Cod)) {
                return peliculasRegistradas[i];
            }
        }
        return null;
    }




}



