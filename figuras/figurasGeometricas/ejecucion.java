package figurasGeometricas;
import java.util.*;

public class ejecucion {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        trapecio trapecio = new trapecio();

        System.out.println("\nTRAPECIO");
        System.out.print("ladoA: ");
        trapecio.setLadoA(scanner.nextDouble());
        System.out.print("ladoB: ");
        trapecio.setLadoB(scanner.nextDouble());
        System.out.print("ladoH: ");
        trapecio.setLadoH(scanner.nextDouble());

        trapecio.calcularArea();




        paralelogramo paralelogramo = new paralelogramo();

        System.out.println("\nPARALELOGRAMO");
        System.out.print("ladoB: ");
        paralelogramo.setLadoB(scanner.nextDouble());
        System.out.print("ladoH: ");
        paralelogramo.setLadoH(scanner.nextDouble());

        paralelogramo.calcularArea();




        octagono octagono = new octagono();

        System.out.println("\nOCTAGONO");
        System.out.print("ladoL: ");
        octagono.setLadoL(scanner.nextDouble());

        octagono.calcularPerimetro();

        System.out.print("apotema: ");
        octagono.setApotema(scanner.nextDouble());

        octagono.calcularArea(); //no funciona calcular area por el perimetrototal

        scanner.close();
    }
}