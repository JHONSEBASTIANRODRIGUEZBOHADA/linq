package RETOS;
import java.util.*;

public class Reto5 {
    public static void main(String[] args) 
    {
        double precio,total = 0;
        int eleccion, i = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTIENDA");

        do
        {
            System.out.println("Ingrese el precio del producto");

            i++;
            System.out.print(i + ". ");
            precio = scanner.nextDouble();
            total = total + precio;

            System.out.println("El total de la compra es: " + total);

            System.out.println("Ingrese (0) si quiere agregar otro producto. Ingrese (otro numero) si quiere finalizar la compra");
            eleccion = scanner.nextInt();

        }while(eleccion == 0);
        System.out.println("Gracias por su compra");
        scanner.close();
    }
}