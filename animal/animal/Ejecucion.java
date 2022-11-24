package animal;
import animal.Animal;

public class Ejecucion
{
    public static void main(String[] args) 
    {
        Animal animal = new Animal();
        ave ave = new ave(animal.getNombre(), animal.getEdad(), animal.getRaza(), ave.getColorPlumas());

        animal.registrarAnimal();
        ave.registrarColorPlumas();
        ave.mostrarAve();
    }
}
