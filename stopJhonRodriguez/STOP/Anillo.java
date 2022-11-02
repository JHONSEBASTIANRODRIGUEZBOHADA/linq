package STOP;

public class Anillo {
    public static void main(String[] args) 
    {
        String nombre = "Arcadio";    
        final String apellido = nombre;
        String ciudad = "Bogota";
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido" + apellido);
        System.out.println("Esta en la ciudad: " + ciudad);

        String[][] matriz = new String [1][1];
        matriz[1][1] = "Anon";
    }
}
