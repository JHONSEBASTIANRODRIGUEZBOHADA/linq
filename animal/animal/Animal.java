package animal;
import java.util.Scanner;

public class Animal {

    private String nombre;
    private int edad;
    private String raza;

    public void Animal(String nombre,int edad, String raza)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.raza=raza;
    }

    public Animal() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Scanner getLectura() {
        return lectura;
    }

    public void setLectura(Scanner lectura) {
        this.lectura = lectura;
    }
    Scanner lectura=new Scanner(System.in);

    public void registrarAnimal()
    {
        System.out.println("Ingrese el nombre del animal");
        nombre=lectura.next();

        System.out.println("Ingrese la edad del animal");
        edad=lectura.nextInt();
        lectura.close();

        System.out.println("Ingrese la raza del animal");
        raza=lectura.next();
    }
}