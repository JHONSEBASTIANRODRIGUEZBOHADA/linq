package RETOS;
import java.util.*;

public class Reto7 {
    public static void main(String[] args) 
    {
        float promedio, total = 0;
        int cantNotas;
        float[] notas;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPROMEDIO DE NOTAS");

        System.out.println("\nIngrese el numero de notas a evaluar");
        cantNotas = scanner.nextInt();
        notas = new float[cantNotas];

        for (int i = 0; i < cantNotas; i++) 
        {
            System.out.println("Ingrese la nota");
            notas[i] = scanner.nextFloat();
            total = total + notas[i];
        }
        promedio = total / cantNotas;
        System.out.println("Su promedio es: " + promedio);

        if (promedio < 3.0) 
        {
            System.out.println("\nREPROBASTE");    
        }
        else if(promedio >= 3.0 && promedio < 4.0)
        {
            System.out.println("\nPASASTE RASPANDO");
        }
        else if(promedio >= 4.0)
        {
            System.out.println("\nAPROBASTE CON BUENOS RESULTADOS");
        }
        scanner.close();
    }
}
