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
    Pelicula nuevapelicula;


    System.out.println("Bienvenido a Video Daw 🎮");


        nuevoUsuario = VideoClub(sc);

        int opcion = 0;


    while(opcion!=8){

        Bonito();
        System.out.println("Pulse 1 crear y registrar VideoClub en la franquicia.");
        Bonito();
        System.out.println("Pulse 2 para registrar pelicula en VideoClub");
        Bonito();;
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
        switch(opcion){

            case 1:
                System.out.println(nuevoUsuario.InfoVideoDAW());//Pongo la información de VideoDAW


            break;
            case 2:
                if (nuevaPelicula(sc)) return;






                break;
            case 3:

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
    //Metodos
    }

    private static boolean nuevaPelicula(Scanner sc) {
        System.out.println("Introduce el Titulo de la Pelicula:");
        String Titulo = sc.nextLine();
        System.out.println("Introduce el genero de la Pelicula, Estos son los disponibles");
        System.out.println("SHONEN, SHEINEN, ISEKAI, SHOJO, HORRO");
        String generoInput = sc.nextLine().toUpperCase(); // Para evitar errores por mayúsculas
        Genero genero = null;

        try {
            genero = Genero.valueOf(generoInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Género no válido. Debes elegir uno de los disponibles.");
            return true;
        }

        System.out.println("Has introducido el género: " + genero);
        return false;
    }

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

    static boolean PatronCIF(String DNI) {
        String patron = "^[A-HJUV][0-9]{7}[A-Z0-9]$";
        return Pattern.matches(patron,DNI);
    }


}