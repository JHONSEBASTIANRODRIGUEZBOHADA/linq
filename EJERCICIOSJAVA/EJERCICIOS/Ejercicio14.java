package EJERCICIOS;
import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) 
    {
        int opciones = 0;
        String []nombre = new String[1];
        String [] contesta = new String[4];

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nENTREVISTA");
        do
        {
            System.out.println("\n¿Como se llama?");
            nombre[0] = scanner.next();
            System.out.println("¿Cual es su ficha de formacion?");
            contesta[0] = scanner.next();
            System.out.println("¿Que hace en su tiempo libre?");
            contesta [1]= scanner.next();
            System.out.println("¿Que nivel de ingles tiene?");
            contesta [2]= scanner.next();
            System.out.println("¿Que es lo que mas le gusta del programa?");
            contesta [3]= scanner.next();
            System.out.println("\nSu nombre: " + nombre[0]);
            
            for (String rsp : contesta) 
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
