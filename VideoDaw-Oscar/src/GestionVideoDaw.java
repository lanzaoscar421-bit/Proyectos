import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GestionVideoDaw {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


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

            break;
            case 2:

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

    }
}