import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GestionVideoDaw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String Cif;
        String Nombre;
        String Direccion;
        LocalDate FechaNacimiento;

        VideoDaw nuevoUsuario;
        Pelicula nuevaPelicula;
        Cliente nuevoCliente;


        System.out.println("Bienvenido a Video Daw 🎮");


        nuevoUsuario = VideoClub(sc);

        int opcion = 0;


        while (opcion != 8) {

            Bonito();
            System.out.println("Pulse 1 crear y registrar VideoClub en la franquicia.");
            Bonito();
            System.out.println("Pulse 2 para registrar pelicula en VideoClub");
            Bonito();
            System.out.println("Pulse 3 para crear y registrar cliente en video club");
            Bonito();
            System.out.println("Pulsa 4 para alquilar Pelicula");
            Bonito();
            System.out.println("Pulsa 5 para devolver pelicula");
            Bonito();
            System.out.println("Pulsa 6 para dar de baja al cliente");
            Bonito();
            System.out.println("Pulsa 7 para dar de baja a un pelicula");
            Bonito();
            System.out.println("Pulsa 8 si desea salir");
            Bonito();

            if (!sc.hasNextInt()) {
                System.out.println("Introduce un número (no letras).");
                sc.nextLine(); // Medida para usuarios
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {

                case 1:
                    System.out.println(nuevoUsuario.InfoVideoDAW());//Pongo la información de VideoDAW

                    break;
                case 2:
                    sc = Pelicula();

                    break;
                case 3:
                    Cliente(sc);

                    break;
                case 4:
                    System.out.println("Peliculas disponibles: ");





                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;

            }


        }
    }

    private static Scanner Pelicula() {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Inserte el Titulo de la pelicula");
        String titulo = sc.nextLine();


        System.out.println("Ahora inserte el Genero acontinuacion te pondre los disponibles");
        for (Genero g : Genero.values()) {
            System.out.println("- " + g);
        }

        Genero genero = null;

        while (genero == null){
            System.out.println("Escribe bien el nombre del genero");
            String entrada = sc.nextLine().toUpperCase();
            //Comprobacion para Si el genero que puso el usuario Exsiste

            for (Genero g : Genero.values()){
                if (g.name().equals(entrada)){
                    genero = g;//Romper ciclo whilw
                    break;
                }
            }
            if (genero == null){
                System.out.println("El genero que pusiste es invalido");
            }
        }
        Pelicula nuevaPeli = new Pelicula(titulo,genero);
        System.out.println("Registraste Bien la peli");
        System.out.println(nuevaPeli.infopeli());
        return sc;
    }
    //Metodos

    private static void Cliente(Scanner sc) {
        Cliente nuevoCliente;
        LocalDate FechaNacimiento;
        String DNI;
        do {
            System.out.println("Inserte SU DNI");
            System.out.println("El DNI consta de 8 números + 1 letra ");
            System.out.println("Ejemplo: 12345678Z");
            DNI = sc.nextLine();
        } while (!PatronDNI(DNI));
        System.out.println("Inserte su nombre");
        String NombreUsuario = sc.nextLine();
        System.out.println("Inserte su fecha nacimiento");
        LocalDate FehcaNacimiento;
        FechaNacimiento = LocalDate.parse(sc.nextLine());
        nuevoCliente = new  Cliente(DNI,NombreUsuario,FechaNacimiento);
        System.out.println(nuevoCliente.InfoUsuario());
    }


    //Metodos


    private static void Bonito() {
        System.out.println("*****************************************************");
    }

    private static VideoDaw VideoClub(Scanner sc) {
        String Cif;
        String Direccion;
        VideoDaw nuevoUsuario;
        String Nombre;
        do {
            System.out.println("Primero inserte el CIF del VideoClub:");
            System.out.println("Te recuerdo que el CIF valido para la empresa (Ejemplo: A12345678)\" \n");
            Cif = sc.nextLine();
        }while (!PatronCIF(Cif));

        System.out.println("Inserte el nombre del VideoClub:");
        Nombre = sc.nextLine();

        System.out.println("Ahora insete la direccion direccion:");
        Direccion = sc.nextLine();

        nuevoUsuario=new VideoDaw(Cif,Direccion,Nombre);//Inserta el dato del VideoDaw
        return nuevoUsuario;
    }

    static boolean PatronCIF(String CIF) {
        String patron = "^[A-HJUV][0-9]{7}[A-Z0-9]$";
        return Pattern.matches(patron,CIF);
    }
    static boolean PatronDNI(String DNI){
        String Patron = "[0-9]{8}[A-Z]";
        return Pattern.matches(Patron,DNI);
    }


}