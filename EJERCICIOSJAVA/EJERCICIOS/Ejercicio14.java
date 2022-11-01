package EJERCICIOS;
import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) 
    {
        String nombre;
        String [] r = new String[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 1; i++) 
        {
            System.out.println("Su nombre");
            nombre = scanner.next();
            System.out.println("¿?");
            r [0]= scanner.next();
            System.out.println("¿?");
            r [1]= scanner.next();
            System.out.println("¿?");
            r [2]= scanner.next();
            System.out.println("Nombre: " + nombre);
        }

        
        for (String as : r) 
        {
            System.out.println(as);
        }
    }
    
}
