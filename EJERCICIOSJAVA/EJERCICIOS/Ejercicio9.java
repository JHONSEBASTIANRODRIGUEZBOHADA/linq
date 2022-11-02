package EJERCICIOS;
import java.util.*;;

public class Ejercicio9 {
    public static void main(String[] args) 
    {
        int edad,intentar = 0, contador = 1, auxContador = 0;

        Scanner scanner = new Scanner(System.in);
        
        while(intentar == 0)
        {
            System.out.println("Ingrese su edad");
            
            edad = scanner.nextInt();
        
            if (edad <= 0)
            {
                System.out.println("Valor invalido");
            }
            else if (edad < 18)
            {
                System.out.println("Váyase a dormir, usted es menor de edad");
            }
            else
            {
                System.out.println("Bienvenido a la discoteca SENA");
            }
            System.out.println("Ingrese (0) si quiere pedir edades. Ingrese (otro numero) si quiere finalizar");
            intentar = scanner.nextInt();
            auxContador = auxContador + contador;
        }
        System.out.println("Pedio: " + auxContador + " edades");
        scanner.close();    
    }
}