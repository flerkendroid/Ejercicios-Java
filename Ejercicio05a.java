
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05a {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa la temperatura en grados Celsius: ");

            int temp = scanner.nextInt();
            System.out.print("La temperatura es de ");
            
            if (temp > 0) {
                System.out.println(temp + "°C positivos.");
            } else {
                System.out.println(temp + "°C bajo cero.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un número entero válido.");
        }
    }
}
