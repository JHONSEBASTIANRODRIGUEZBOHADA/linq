package EJERCICIOS;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args){
        
        double estatura1, estatura2, estatura3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ESTATURA");
        System.out.println("persona 1, Ingrese la estatura en cm");
        estatura1 = scanner.nextDouble();
        System.out.println("persona 2, Ingrese la estatura en cm");
        estatura2 = scanner.nextDouble();
        System.out.println("persona 3, Ingrese la estatura en cm");
        estatura3 = scanner.nextDouble();

        if (estatura1 > estatura2 && estatura1 > estatura3)
        {
            System.out.println("La persona 1 es mas alto");
        }
        else if(estatura2 > estatura1 && estatura2 > estatura3)
        {
            System.out.println("La persona 2 es mas alto");
        }
        else
        {
            System.out.println("La persona 3 es mas alto");
        }
        scanner.close();
    }
}
