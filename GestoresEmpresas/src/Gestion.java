import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Gestion {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Empresa nuevaEmpresa;

        String opcion = "";
        String cif;
        String nombre;


        System.out.println("Primero inserte el nombre de la empresa");
        nombre = sc.nextLine();
        do {
            System.out.println("Despues inserte el CIF de la empresa:");
            System.out.println("Te recuerdo que el CIF valido para la empresa (Ejemplo: A12345678)\" \n");
            cif = sc.nextLine();
        }while (!PatronCIF(cif));

        nuevaEmpresa = new Empresa(nombre,cif);

        do{
            sc = new Scanner(System.in);

            imprimirMenuOpciones();

            opcion = sc.nextLine();


            switch (opcion){
                case "1":
                    break;

                case "2":
                    break;

                case "3":

                    System.out.println(nuevaEmpresa.infoEmpresa());

                    break;
            }
        }while (!opcion.equals("8"));

    }
    //Metodos
    private static void imprimirMenuOpciones() {
        System.out.println("Escoga la opcion que desee");
        System.out.println("1. Crear Persona");
        System.out.println("2. Registrar trabajador en la empresa");
        System.out.println("3. Mostrar información general de la empresa");
        System.out.println("4. Mostrar el número de trabajadores actuales");
        System.out.println("5. Mostrar información de todos los trabajadores");
        System.out.println("6. Eliminar trabajador de la empresa");
        System.out.println("7. Eliminar persona del programa.");
        System.out.println("8. Salir");
    }
    static boolean PatronCIF(String CIF) {
        String patron = "^[A-HJUV][0-9]{7}[A-Z0-9]$";
        return Pattern.matches(patron,CIF);
    }


}