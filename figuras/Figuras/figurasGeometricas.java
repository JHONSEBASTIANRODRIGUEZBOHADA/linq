package Figuras;

public class figurasGeometricas 
{
    private double ladoA, ladoB, areaTotal, perimetroTotal;




    public figurasGeometricas(){}

    public figurasGeometricas(double ladoA, double ladoB, double areaTotal, double perimetroTotal) 
    {
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.areaTotal=areaTotal;
        this.perimetroTotal=perimetroTotal;
    }
    



    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getPerimetroTotal() {
        return perimetroTotal;
    }

    public void setPerimetroTotal(double perimetroTotal) {
        this.perimetroTotal = perimetroTotal;
    }
}