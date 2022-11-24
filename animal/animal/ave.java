package animal;

public class ave extends Animal
{
    private String colorPlumas = "d";

    ave ave = new ave(getNombre(), getEdad(), getRaza(), colorPlumas);

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public ave getAve() {
        return ave;
    }

    public void setAve(ave ave) {
        this.ave = ave;
    }

    public ave(String nombre, int edad, String raza,String colorPlumas) 
    {
        this.colorPlumas = colorPlumas;
    }

    public void registrarColorPlumas() 
    {
        System.out.println("Ingrese el color de plumas del animal");
        setColorPlumas(lectura.next());
    }

    public void mostrarAve() 
    {
    System.out.println("El nombre del ave es: " + getNombre() + " y la edad del animal es " + getEdad() + " y el color de plumas es: " + colorPlumas);
    }

}