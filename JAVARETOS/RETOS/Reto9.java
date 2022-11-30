package RETOS;
import java.util.*;

public class Reto9 {
    public static void main(String[] args) 
    {
        String[][] productos = new String[4][4];
        double[][] precio = new double[4][4];

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMAQUINA EXPENDEDORA DE DULCES");
        System.out.print("\n");

        for (int filas = 0; filas < 4; filas++) 
        {
            for (int columnas = 0; columnas < 4; columnas++) 
            {
                System.out.println("Ingrese el nombre del producto ");
                productos[filas][columnas] = scanner.next();
                System.out.println("Ingrese el precio");
                precio[filas][columnas] = scanner.nextDouble();
            }
        }

        System.out.println("\nCATALOGO DE PRODUCTOS");

        for (int filas = 0; filas < 4; filas++) 
        {
            for (int columnas = 0; columnas < 4; columnas++) 
            {
                System.out.println("///////////////////////////////////////");
                System.out.println(filas + "" + columnas);
                System.out.println(productos[filas][columnas]);
                System.out.println(precio[filas][columnas]);
            }    
        }
        scanner.close();
    }
}
