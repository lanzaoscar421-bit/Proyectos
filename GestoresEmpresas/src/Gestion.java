import java.time.LocalDate;
import java.util.Date;
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
        String nombreTrabajador;
        String dni;
        LocalDate fechaNacimiento;
        String direccion;
        Trabajador nuevoTrabajador;
        String numeroSS;
        String dniBorar;


        nuevaEmpresa = empresa(sc);

        do{
            sc = new Scanner(System.in);

            imprimirMenuOpciones();

            opcion = sc.nextLine();


            switch (opcion){
                case "1":
                    break;

                case "2":
                    resgistrarTrabajador(nuevaEmpresa);


                    break;

                case "3":

                    System.out.println(nuevaEmpresa.infoEmpresa());

                    break;
                case "4":
                    System.out.println("En la empresa hay:");
                    nuevaEmpresa.numeroTrabajadores();
                    System.out.println("Trabajadores");
                    break;
                case "5":
                        System.out.println(nuevaEmpresa.informacionTrabajadores());

                    break;
                case "6":
                    System.out.println("Para borrar trabajador de la empresa inserte el dni del trabajador");
                    String dniBorrar = sc.nextLine();
                    boolean resultado = nuevaEmpresa.eliminarTrabajador(dniBorrar);
                    if (resultado){
                        System.out.println("Se borró de forma correcta");
                    } else {
                        System.out.println("Hubo un problema, no se borró correctamente");
                    }
                    break;
                case "7":


                    break;
                case "8":
                    System.out.println("Adios.");
                    break;
            }
        }while (!opcion.equals("8"));

    }

    private static Empresa empresa(Scanner sc) {
        Empresa nuevaEmpresa;
        String cif;
        String nombre;
        System.out.println("Primero inserte el nombre de la empresa");
        nombre = sc.nextLine();
        do {
            System.out.println("Despues inserte el CIF de la empresa:");
            System.out.println("Te recuerdo que el CIF valido para la empresa (Ejemplo: A12345678)\" \n");
            cif = sc.nextLine().toUpperCase();
        }while (!PatronCIF(cif));

        nuevaEmpresa = new Empresa(nombre,cif);
        return nuevaEmpresa;
    }
    //Metodos

    private static void resgistrarTrabajador(Empresa nuevaEmpresa) {
        String nombreTrabajador;
        String direccion;
        LocalDate fechaNacimiento;
        String dni;
        Trabajador nuevoTrabajador;
        Scanner sc;
        String numeroSS;
        sc = new Scanner(System.in);
        System.out.println("Inserte su nombre");
        nombreTrabajador = sc.nextLine();
        do {
            System.out.println("Inserte SU DNI");
            System.out.println("El DNI consta de 8 números + 1 letra ");
            System.out.println("Ejemplo: 12345678Z");
            dni = sc.nextLine().toUpperCase().toUpperCase();
        }while (!PatronDNI(dni));
        System.out.println("Inserte su fecha nacimiento");
        System.out.println("Ejemplo de formato: 2007-12-06");
        fechaNacimiento = LocalDate.parse(sc.nextLine());
        System.out.println("Inserte su direccion");
        direccion = sc.nextLine();

        do {
            System.out.println("Inserte su numero de la SS");
            System.out.println("Dicho numero consta de 12 digitos");
            System.out.println("Ejemplo: 281234567890\n");
            numeroSS = sc.nextLine().toUpperCase();
        }while (!PatronNumeroSS(numeroSS));
        nuevoTrabajador = new Trabajador(nombreTrabajador,dni,fechaNacimiento,direccion,numeroSS);
        System.out.println(nuevoTrabajador.toString());
        boolean resultado = nuevaEmpresa.registrarTrabajador(nuevoTrabajador);
        if (resultado){
            System.out.println("Trabajador añadido Exsitosamente");
        }else{
            System.out.println("No se pudo añadir al Trabajador, revisa que no coincidan los Dni's");
        }
    }

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
    static boolean PatronDNI(String DNI){
        String Patron = "[0-9]{8}[A-Z]";
        return Pattern.matches(Patron,DNI);
    }
    static boolean PatronNumeroSS(String numeroSS) {
        String patron = "[0-9]{12}";
        return Pattern.matches(patron, numeroSS);
    }



}