package RETOS;
import java.util.*;

public class Reto6 {
    public static void main(String[] args) 
    {
        double cantDinero, total = 0;
        int monedaUsuario, monedaAleatoria, eleccion = 0, contador = 1, auxContador = 0;

        monedaAleatoria =  (int)(Math.random()*2+1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("CARICELLAZO CON APUESTAS");

        while(eleccion == 0)
        {
            System.out.println("\nLA MONEDA ESTA GIRANDO....");

            System.out.println("\nElija: (1.Cara) o (2.Sello)");
            monedaUsuario = scanner.nextInt();

            System.out.println("Ingrese el dinero a apostar");
            cantDinero = scanner.nextDouble();

            switch(monedaAleatoria)
            {
                case 1:
                    System.out.println("MONEDA = Cara");
                    switch(monedaUsuario)
                    {
                        case 1:
                            System.out.println("HAS GANADO");
                            total = total + cantDinero;
                            System.out.println("El acumulado que lleva es: " + total);
                        break;

                        case 2:
                            System.out.println("HAS PERDIDO");
                            total = total - cantDinero;
                            System.out.println("El acumulado que lleva es: " + total);
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
                            total = total - cantDinero;
                            System.out.println("El acumulado que lleva es: " + total);
                        break;

                        case 2:
                            System.out.println("HAS GANADO");
                            total = total + cantDinero;
                            System.out.println("El acumulado que lleva es: " + total);
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
            System.out.println("Ingrese (0) si quiere seguir jugando. Ingrese (otro numero) si quiere retirarse del juego");
            eleccion = scanner.nextInt();
            
            auxContador = auxContador + contador;
        }

        System.out.println("Jugo = " + auxContador + " veces");
        System.out.println("Dinero que acumulo = " + total);
        System.out.println("GRACIAS POR JUGAR");
        scanner.close();
    }
}