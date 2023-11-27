import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite el dia de la semana");

            String diaDeLaSemana = scanner.nextLine();
            if (String.valueOf(DiasDeLaSemana.LUNES).equalsIgnoreCase(diaDeLaSemana)) {
                System.out.println("El dia de hoy es "+DiasDeLaSemana.LUNES);
            }



        } catch (InputMismatchException e) {
            // Manejar excepción relacionada con entrada incorrecta de tipo
            System.out.println("Error: Ingresa un Dato en formato texto.");
        } catch (NoSuchElementException e) {
            // Manejar excepción relacionada con falta de elementos
            System.out.println("Error: No se encontró un elemento esperado.");
        } catch (IllegalStateException e) {
            // Manejar excepción relacionada con un estado incorrecto del Scanner
            System.out.println("Error: Estado incorrecto del Scanner.");
        } finally {
            // Cerrar el Scanner en el bloque finally para asegurarse de que siempre se cierre
            scanner.close();
        }


    }
}
