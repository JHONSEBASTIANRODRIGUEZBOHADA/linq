package RETOS;
import java.util.*;

public class Reto5 {
    public static void main(String[] args) 
    {
        double precio,total = 0;
        int productos,i = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTIENDA");

        System.out.println("Ingrese la cantidad de productos a comprar");
        productos = scanner.nextInt();

        for (int j = 0; j < productos; j++) 
        {
            System.out.println("Ingrese el precio del producto");
            i++;
            System.out.print(i + ". ");
            precio = scanner.nextDouble();
            total = total + precio;
        }
        System.out.println("El total de la compra es: " + total);
        System.out.println("Gracias por su compra");
        scanner.close();
    }
}
