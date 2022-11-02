package EJERCICIOS;
import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) 
    {
        int opciones = 0;
        String []nombre = new String[1];
        String [] hobby = new String[4];

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHOBBY");

        do
        {
            System.out.println("\n¿Como se llama?");
            nombre[0] = scanner.next();
            System.out.println("Ingrese 4 hobbys");
            System.out.println("hobby 1");
            hobby[0] = scanner.next();
            System.out.println("hobby 2");
            hobby [1]= scanner.next();
            System.out.println("hobby 3");
            hobby [2]= scanner.next();
            System.out.println("hobby 4");
            hobby [3]= scanner.next();
            System.out.println("\nSu nombre: " + nombre[0]);
            
            for (String rsp : hobby)
            {
                System.out.println("Respuesta");
                System.out.println(rsp);
            }
            System.out.println("\nIngrese (0) si quiere hacer otra entrevista. Ingrese (otro numero) si quiere finalizar");
            opciones = scanner.nextInt();
        }while(opciones == 0);
        scanner.close();
    }
}