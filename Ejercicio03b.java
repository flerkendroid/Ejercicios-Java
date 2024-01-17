
import java.util.Scanner;

public class Ejercicio03b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el apellido del padre: ");
        String apellido1 = scanner.nextLine();
        
        System.out.print("Ingresa el apellido de la madre: ");
        String apellido2 = scanner.nextLine();
        
        System.out.print("Ingresa el nombre del primer hijo: ");
        String hijo1 = scanner.nextLine();
        
        System.out.print("Ingresa el nombre del segundo hijo: ");
        String hijo2 = scanner.nextLine();
        
        System.out.print("Ingresa el nombre del tercer hijo: ");
        String hijo3 = scanner.nextLine();
        
        System.out.print("Ingresa el nombre del padre: ");
        String padre = scanner.nextLine();
        
        System.out.print("Ingresa el nombre de la madre: ");
        String madre = scanner.nextLine();

        pintaNombreCompleto(construyeNombreCompleto(padre, apellido1, ""));
        pintaNombreCompleto(construyeNombreCompleto(madre, apellido2, ""));
        pintaNombreCompleto(construyeNombreCompleto(hijo1, apellido1, apellido2));
        pintaNombreCompleto(construyeNombreCompleto(hijo2, apellido1, apellido2));
        pintaNombreCompleto(construyeNombreCompleto(hijo3, apellido1, apellido2));

        System.out.println("Padre: " + padre + " " + apellido1);
        System.out.println("Madre: " + madre + " " + apellido2);
        System.out.println("Hijos:");
        System.out.println(hijo1 + " " + apellido1 + " " + apellido2);
        System.out.println(hijo2 + " " + apellido1 + " " + apellido2);
        System.out.println(hijo3 + " " + apellido1 + " " + apellido2);

        scanner.close();
    }

    private static void pintaNombreCompleto(String nombreCompleto) {
        System.out.println(nombreCompleto);
    }

    private static String construyeNombreCompleto(String nombre, String apellido1, String apellido2) {
        return "Nombre: " + nombre + " Apellidos: " + apellido1 + " " + apellido2;
    }
}
