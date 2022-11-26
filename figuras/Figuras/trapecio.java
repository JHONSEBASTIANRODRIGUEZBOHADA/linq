package Figuras;

public class trapecio 
{
    private double ladoC, ladoD, ladoH;

    public trapecio(double ladoA, double ladoB, double ladoC, double ladoD, double ladoH) 
    {
        // TO-DO hacer el super de este constructor
        //super(ladoA, ladoB);
        this.ladoC=ladoC;
        this.ladoD=ladoD;
        this.ladoH=ladoH;
    }




    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getLadoD() {
        return ladoD;
    }

    public void setLadoD(double ladoD) {
        this.ladoD = ladoD;
    }

    public double getLadoH() {
        return ladoH;
    }

    public void setLadoH(double ladoH) {
        this.ladoH = ladoH;
    }




    public void calcularArea(double ladoA,double ladoB, double ladoH, double areaTotal) 
    {
        areaTotal = (ladoA + ladoB) * ladoH / 2;
        System.out.println("El area del trapecio es " + areaTotal);
    }

    public void calcularPerimetro(double ladoA,double ladoD, double ladoB, double ladoC,double perimetroTotal) 
    {
        perimetroTotal = ladoA + ladoB + ladoC + ladoD;
        System.out.println("El perimetro del trapecio es: " + perimetroTotal);
    }
}