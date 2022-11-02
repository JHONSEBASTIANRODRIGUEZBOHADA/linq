package EJERCICIOS;
import java.util.*;

public class EJercicio1 {
    public static void main(String[] args) 
    {
        double ladoMenor,ladoMayor,perimetro;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("PERIMETRO DE UN RECTANGULO");
        System.out.println("Ingrese el lado menor del rectangulo");
        ladoMenor = scanner.nextDouble();
        
        ladoMayor = ladoMenor * 2;
        perimetro = 2*(ladoMayor + ladoMenor);
        
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        scanner.close();
    }
}
