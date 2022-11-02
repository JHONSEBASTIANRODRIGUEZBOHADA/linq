package EJERCICIOS;
import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args)
    {
        int edad;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();

        if (edad >= 18)
        {
            System.out.println("Bienvenido a la discoteca SENA");
        }
        else
        {
            System.out.println("Váyase a dormir, usted es menor de edad");
        }
        scanner.close();
    }
}