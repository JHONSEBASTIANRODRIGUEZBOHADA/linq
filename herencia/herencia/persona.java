package herencia;

public class persona {
    private int valorHonorario;
    private int productoValor;
    private int horas;
    private int cantidadHoras;
    private int valorTotal;

    public persona() 
    {
        
    }

    public persona(int valorHonorario,int productoValor, int horas, int cantidadHoras, int valorTotal) 
    {
        
    }

    public int getValorHonorario() {
        return valorHonorario;
    }

    public void setValorHonorario(int valorHonorario) {
        this.valorHonorario = valorHonorario;
    }

    public double getProductoValor() {
        return productoValor;
    }

    public void setProductoValor(double productoValor) {
        this.productoValor = productoValor;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }


    public void calcularHonorarios(int valorHonorario, int productoValor, int horas, int cantidadHoras, final int reteica) 
    {
        valorHonorario = (productoValor * horas) * cantidadHoras - reteica;
    }
}
