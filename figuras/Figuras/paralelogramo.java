package Figuras;

public class paralelogramo extends figurasGeometricas
{
    private double ladoH;

    public paralelogramo(double ladoA, double ladoB, double areaTotal, double perimetroTotal, double ladoH) 
    {
        super(ladoA, ladoB, areaTotal, perimetroTotal);
        this.ladoH=ladoH;
    }




    public double getLadoH() 
    {
        return ladoH;
    }

    public void setLadoH(double ladoH) 
    {
        this.ladoH = ladoH;
    }




    public void calcularArea(double ladoB, double ladoH, double areaTotal) 
    {
        areaTotal = ladoB * ladoH;
        System.out.println("El area del paralelogramo es " + areaTotal);
    }

    public void calcularPerimetro(double ladoA, double ladoB, double perimetroTotal) 
    {
        perimetroTotal = 2*(ladoA + ladoB);
        System.out.println("El perimetro del trapecio es: " + perimetroTotal);
    }
}