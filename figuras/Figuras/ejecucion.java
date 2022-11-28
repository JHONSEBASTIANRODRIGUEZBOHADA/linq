package Figuras;
import java.util.*;

public class ejecucion {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 

        trapecio trapecio = new trapecio();

        System.out.print("\nLadoA: ");
        trapecio.setLadoA(scanner.nextDouble());

        System.out.print("ladoB: ");
        trapecio.setLadoB(scanner.nextDouble());

        System.out.print("ladoH: ");
        trapecio.setLadoH(scanner.nextDouble());

        trapecio.calcularArea(trapecio.getLadoA(),trapecio.getLadoB(), trapecio.getLadoH(), trapecio.getAreaTotal());
        trapecio.calcularPerimetro(trapecio.getLadoA(),trapecio.getLadoB(), trapecio.getLadoC(),trapecio.getLadoD(), trapecio.getPerimetroTotal());
        scanner.close();
    }
}