
import java.util.Scanner;

public class Ejercicio05d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del mes: ");
        String nombreMes = scanner.nextLine();

        int dias = calculaDias(nombreMes);
        if (dias != -1) {
            System.out.println("El mes " + nombreMes + " tiene " + dias + " días.");
        } else {
            System.err.println("Mes no válido");
        }

        scanner.close();
    }

    private static int calculaDias(String nombreMes) {
        int dias = -1; // Valor predeterminado en caso de que el mes no sea válido

        switch (nombreMes.toLowerCase()) {
            case "febrero":
                System.out.println("Febrero");
                dias = 28;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println(nombreMes);
                dias = 30;
                break;
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println(nombreMes);
                dias = 31;
                break;
        }

        return dias;
    }
}
