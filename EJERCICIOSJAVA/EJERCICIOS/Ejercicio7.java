package EJERCICIOS;
import java.util.*;;

public class Ejercicio7 {
    public static void main(String[] args)
    {
        int numero1,numero2,eleccion,total;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nElija la opcion que desea");
        System.out.println("1.Suma \n2.Resta \n3.Multiplicacion \n4.Division");
        eleccion = scanner.nextInt();

        System.out.println("Ingrese dos numero:");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();

        switch(eleccion)
        {
            case 1:
            total = numero1 + numero2;
            System.out.println("El valor de la suma es: " + total);
            break;

            case 2:
            total = numero1 - numero2;
            System.out.println("El valor de la resta es: " + total);
            break;

            case 3:
            total = numero1 * numero2;
            System.out.println("El valor de la multiplicacion es: " + total);
            break;

            case 4:
            total = numero1 / numero2;
            System.out.println("El valor de la division es: " + total);
            break;

            default:
            System.out.println("No ingreso un valor valido");
            break;
        }
        scanner.close();
    }
}