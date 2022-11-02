package STOP;
import java.util.*;

public class Mono {
    public static void main(String[] args) 
    {
        String apellido;
        String[][] nombre = new String [2][3];
        nombre[1][1] = "Miguel";
        String fruta = "Mango";
        String color = "negro";
        String color2 = "blanco";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Apellido que inicie con letra M");
        apellido = scanner.next();

        for (int i = 0; i < 3; i++) 
        {
            System.out.println(fruta);    
        }
        if (color != color2) 
        {
            System.out.println("Tu color puede ser correcto");    
        }
        scanner.close();
    }
    
}
