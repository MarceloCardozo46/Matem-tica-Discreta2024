package actividad.fibonacci.recurcion;

import java.util.Scanner;
/**
 *
 * @author USURIO
 */
public class ActividadFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor inicial a: ");
        int a = scanner.nextInt();
        
        System.out.print("Ingrese el valor final b: ");
        int b = scanner.nextInt();
        
        // Validación de los valores ingresados
        if (a > b) {
            System.out.println("El valor inicial (a) debe ser menor o igual al valor final (b).");
            return;
        }
        
        System.out.println("La sucesión de Fibonacci desde " + a + " hasta " + b + " es:");
        generarFibonacciRango(a, b);        
    }
    
    public static void generarFibonacciRango(int a, int b) {
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        
        // Encuentra el primer número de Fibonacci dentro del rango
        while (fibonacci1 < a) {
            int fibonacci3 = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci3;
        }
        
        // Imprime los números de Fibonacci dentro del rango
        while (fibonacci1 <= b) {
            if (fibonacci1 >= a) {
                System.out.print(fibonacci1 + " ");
            }
            int fibonnacci3 = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonnacci3;
        }
        System.out.println();
    }
}

