package RETOS;
import java.util.*;

public class Reto1 {
    public static void main(String[] args)
    {
        double fahrenheit,centigrados;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados fahrenheit(°F)");
        fahrenheit = scanner.nextDouble();
        
        centigrados = (fahrenheit - 32)/1.8;
        
        System.out.println("La temperatura en grados centigrados es de: " + centigrados);
        scanner.close();
    }
}
