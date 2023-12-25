package co.com.mmg;


import java.io.PrintStream;

// Definición de la interfaz funcional con la anotación @FunctionalInterface
@FunctionalInterface
interface OperacionMatematica {
    int operar(int a, int b);
}

public class Main {
    public static void main(String[] args) {


            // Ejemplo 1: Expresión Lambda para sumar dos números
            OperacionMatematica suma = (a, b) -> a + b;
            System.out.println("Suma: " + operar(10, 5, suma));

            // Ejemplo 2: Expresión Lambda para restar dos números
            OperacionMatematica resta = (a, b) -> a - b;
            System.out.println("Resta: " + operar(10, 5, resta));

            // Ejemplo 3: Expresión Lambda para multiplicar dos números
            OperacionMatematica multiplicacion = (a, b) -> a * b;
            System.out.println("Multiplicación: " + operar(10, 5, (a, b) -> a * b));

            // Ejemplo 4: Expresión Lambda para dividir dos números
            OperacionMatematica division = (a, b) -> {
                if (b != 0) {
                    return a / b;
                } else {
                    return 0; // Manejo de la división por cero
                }
            };
            System.out.println("División: " + operar(10, 5, division));
        }

        // Método que utiliza la interfaz funcional para realizar operaciones matemáticas
        private static int operar(int a, int b, OperacionMatematica operacion) {
            return operacion.operar(a, b);
        }
    }