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
                sc.nextLine();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {

                case 1:
                    System.out.println(nuevoUsuario.InfoVideoDAW());//Pongo la información de VideoDAW


                    break;
                case 2:
                    int opcion2 = 0;
                    System.out.println("Introduce el Titulo de la Pelicula:");
                    String Titulo = sc.nextLine();
                    System.out.println("Tipos de Pelicula:");
                    System.out.println("Pulsa 1 si la pelicula es  SHONEN");
                    System.out.println("Pulsa 2 si la pelicula es  SHEINEN");
                    System.out.println("Pulsa 3 si la pelicula es  ISEKAI");
                    System.out.println("Pulsa 4 si la pelicula es  HORROR");
                    System.out.println("Pulsa 5 si la pelicula es  SHOJO");
                    switch (opcion2) {
                        case 1:
                            Genero SHONEN = Genero.valueOf(sc.nextLine());
                            System.out.println("Insertaste un Shonen");
                            break;
                        case 2:
                            Genero SHEINEN = Genero.valueOf(sc.nextLine());
                            System.out.println("Insertaste un Sheinen");
                            break;
                        case 3:
                            Genero ISEKAI = Genero.valueOf(sc.nextLine());
                            System.out.println("Insertaste un ISEKAI");
                            break;
                        case 4:
                            Genero HORROR = Genero.valueOf(sc.nextLine());
                            System.out.println("Insertaste un Horror");
                            break;
                        case 5:
                            Genero SHOJO = Genero.valueOf(sc.nextLine());
                            System.out.println("Insertaste un Shojo");
                        default:
                            System.out.println("La opcion que escogiste no esta entre las opciones.");
                    }



                    break;
                case 3:
                    String DNI;
                    do {
                        System.out.println("Inserte SU DNI");
                        System.out.println("El DNI consta de 8 números + 1 letra ");
                        System.out.println("Ejemplo: 12345678Z");
                        DNI = sc.nextLine();
                    } while (!PatronDNI(DNI));
                    System.out.println("Inserte su nombre");
                    String NombreUsuario = sc.nextLine();
                    System.out.println("Inserte su direccion");
                    String DireccionUsuario = sc.nextLine();
                    System.out.println("Inserte su fecha nacimiento");
                    LocalDate FehcaNacimiento;
                    FechaNacimiento = LocalDate.parse(sc.nextLine());
                    nuevoCliente = new  Cliente(DNI,DireccionUsuario,FechaNacimiento);
                    System.out.println(nuevoCliente);

                    break;
                case 4:

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