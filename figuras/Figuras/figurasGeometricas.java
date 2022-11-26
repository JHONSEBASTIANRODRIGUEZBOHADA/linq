package Figuras;

public class figurasGeometricas 
{
    private double ladoA, ladoB;

    public figurasGeometricas(){}

    public figurasGeometricas(double ladoA, double ladoB) 
    {
        this.ladoA=ladoA;
        this.ladoB=ladoB;
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



}