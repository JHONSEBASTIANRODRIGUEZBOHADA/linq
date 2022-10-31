package RETOS;
import java.util.*;

public class Reto3 {
    public static void main(String[] args)
    {
        int monedaUsuario, monedaAleatoria;

        monedaAleatoria =  (int)(Math.random()*2+1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCARISELLAZO");

        System.out.println("\nLA MONEDA ESTA GIRANDO....");

        System.out.println("\nElija: (1.Cara) o (2.Sello)");
        monedaUsuario = scanner.nextInt();

        switch(monedaAleatoria)
        {
            case 1:
                System.out.println("MONEDA = Cara");
                switch(monedaUsuario)
                {
                    case 1:
                        System.out.println("HAS GANADO");
                    break;

                    case 2:
                        System.out.println("HAS PERDIDO");
                    break;

                    default:
                        System.out.println("No ingreso un valor correcto");
                    break;
                }
            break;

            case 2:
                System.out.println("MONEDA = Sello");
                switch(monedaUsuario)
                {
                    case 1:
                        System.out.println("HAS PERDIDO");
                    break;

                    case 2:
                        System.out.println("HAS GANADO");
                    break;

                    default:
                        System.out.println("No ingreso un valor correcto");
                    break;
                }
            break;

            default:
                System.out.println("No ingreso un valor correcto");
            break;
        }
        scanner.close();
    }
}
