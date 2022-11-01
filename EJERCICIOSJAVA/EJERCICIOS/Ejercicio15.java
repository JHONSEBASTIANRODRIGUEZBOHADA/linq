package EJERCICIOS;
import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args) 
    {
        String usuario;
        String contraseña;
        String [] usuarios = {"sebastian", "jonathan"};
        String [] contraseñas = {"ss", "ddd"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nLOG IN");
        for (int i = 1; i < usuarios.length; i++) 
        {
            System.out.println("\nUSUARIO");
            usuario = scanner.next();
            if (usuarios[i] == usuario) 
            {
                for (int j = 0; j < contraseñas.length; j++)
                {
                    System.out.println("CONTRASEÑA");
                    contraseña = scanner.next();
                    if (contraseñas[i] == contraseña) 
                    {
                        System.out.println("Bienvenido");
                    }    
                }
            }
        }
        scanner.close();
    }
}
