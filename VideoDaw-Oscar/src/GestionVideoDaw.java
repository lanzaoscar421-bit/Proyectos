import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GestionVideoDaw {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String DNI;
    String Nombre;
    String Direccion;
    LocalDate FechaNacimiento;

    System.out.println("*************************");
    System.out.println("Bienvenido a Video Daw 🎮");
    System.out.println("*************************");

    do {
        System.out.println("Primero inserte su DNI:");
        System.out.println("Te recuerdo que el DNI consta de ocho números y una letra final en MAYUSCULA Porfavor \n");
        DNI = sc.nextLine();
    }while (!PatronDNI(DNI));

    System.out.println("Inserte su Nombre:");
    Nombre = sc.nextLine();

    System.out.println("Ahora insete su direccion:");
    Direccion = sc.nextLine();

    System.out.println("En la Fecha de nacimiento ponga este patron Ejemplo (Anio-Mes-Dia)");
    System.out.println("Ahora su Fecha nacimiento:");
    FechaNacimiento = LocalDate.parse(sc.nextLine());

    System.out.println("Bienvenido a Video Daw, " + Nombre);


    int opcion = 0;


    while(opcion!=8){

        System.out.println("*****************************************************");
        System.out.println("Pulse 1 crear y registrar VideoClub en la franquicia.");
        System.out.println("*****************************************************");
        System.out.println("Pulse 2 para registrar pelicula en VideoClub");
        System.out.println("****************************************************");
        System.out.println("Pulse 3 para crear y registrar cliente en video club");
        System.out.println("****************************************************");
        System.out.println("Pulsa 4 para alquilar Pelicula");
        System.out.println("******************************");
        System.out.println("Pulsa 5 para devolver pelicula");
        System.out.println("***********************************");
        System.out.println("Pulsa 6 para dar de baja al cliente");
        System.out.println("**************************************");
        System.out.println("Pulsa 7 para dar de baja a un pelicula");
        System.out.println("***************************************");
        System.out.println("Pulsa 8 si desea salir");
        System.out.println("***************************************");

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
                System.out.println("Introduce el nombre de la Franquicia:");


            break;
            case 2:
                System.out.println("Introduce el nombre de la Pelicula:");

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
    static boolean PatronDNI(String DNI) {
        String patron = "[0-9]{8}[A-Z]{1}";
        return Pattern.matches(patron,DNI);
    }


}