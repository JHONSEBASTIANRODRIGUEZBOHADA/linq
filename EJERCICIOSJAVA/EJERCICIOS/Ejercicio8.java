package EJERCICIOS;
import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args)
    {
        int edad;

        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 25; i++)
        {
            System.out.println("Ingrese su edad");
        
            edad = scanner.nextInt();
        
            if (edad <= 0)
            {
                System.out.println("Valor invalido");
            }
            else if (edad < 18)
            {
                System.out.println("Váyase a dormir, usted es menor de edad");
            }
            else
            {
                System.out.println("Bienvenido a la discoteca SENA");
            }
        }
        scanner.close();
    }
}
