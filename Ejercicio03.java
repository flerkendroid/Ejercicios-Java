import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Usamos Scanner para recibir la entrada del usuario de manera más robusta
        Scanner scanner = new Scanner(System.in);

        // Solicitamos y validamos la entrada para el número de manzanas
        int numManzanas = solicitarNumero(scanner, "Ingrese el número de manzanas: ");

        // Solicitamos y validamos la entrada para el número de peras
        int numPeras = solicitarNumero(scanner, "Ingrese el número de peras: ");

        // Calculamos el total de frutas
        int numFrutas = numManzanas + numPeras;

        // Mostramos el resultado
        System.out.println("El frutero tiene " + numFrutas + " piezas de fruta.");

        // Cerramos el Scanner
        scanner.close();
    }

    // Método para solicitar y validar un número
    private static int solicitarNumero(Scanner scanner, String mensaje) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        return numero;
    }
}
