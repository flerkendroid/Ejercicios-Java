public class Ejercicio04a {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Debe proporcionar dos argumentos enteros (ladoX y ladoY).");
            return;
        }

        try {
            int ladoX = Integer.parseInt(args[0]);
            int ladoY = Integer.parseInt(args[1]);

            int area = areaRectangulo(ladoX, ladoY);

            System.out.println("El rectángulo de " + ladoX + " por " +
                    ladoY + " tiene un área de " + area);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese números enteros válidos para ladoX y ladoY.");
        }
    }

    private static int areaRectangulo(int base, int altura) {
        return base * altura;
    }
}

