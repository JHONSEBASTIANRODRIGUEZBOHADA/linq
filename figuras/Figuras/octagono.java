package Figuras;
import java.util.*;;

public class octagono extends figurasGeometricas 
{
    private double ladoL;
    Scanner scanner = new Scanner(System.in);

    public void octagono(double ladoA, double ladoB, double areaTotal, double perimetroTotal, double ladoL) 
    {
        // TO-DO hacer el super de este constructor
        //super(ladoA, ladoB, areaTotal, perimetroTotal);
        this.ladoL=ladoL;
    }




    public double getLadoL() {
        return ladoL;
    }

    public void setLadoL(double ladoL) {
        this.ladoL = ladoL;
    }




    public void calcularPerimetro(double ladoL, double perimetroTotal) 
    {
        perimetroTotal = 8 * ladoL;
        System.out.println("El perimetro del octagono es: " + perimetroTotal);
    }

    public void calcularArea(double areaTotal, double perimetroTotal, double apotema) 
    {
        System.out.print("Ingrese el apotema del octagono");
        apotema = scanner.nextDouble();

        areaTotal = perimetroTotal * apotema / 2;
        
        System.out.println("El area del trapecio es " + areaTotal);
    }
}