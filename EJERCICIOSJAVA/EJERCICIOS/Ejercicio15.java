package EJERCICIOS;
import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args) 
    {
        int opciones;
        String usuario, contraseña;
        String [] usuarios = {"sebastian", "jonathan"};
        String [] contraseñas = {"ss", "ddd"};

        Scanner scanner = new Scanner(System.in);
        
        do
        {
            System.out.println("USUARIO");
            usuario = scanner.next().toLowerCase();

            System.out.println("CONTRASEÑA");
            contraseña = scanner.next().toLowerCase();
        
            if (usuarios[0].equals(usuario) && contraseñas[0].equals(contraseña)||usuarios[1].equals(usuario) && contraseñas[1].equals(contraseña)) 
            {
                System.out.println("BIENVENIDO");
            }
            else
            {
                System.out.println("USUARIO O CONTRASEÑA INCORRECTOS");
            }
            System.out.println("\nIngrese (0) si quiere volver ingresar usuasio y contraseña. Ingrese (otro numero) si quiere salir");
            opciones = scanner.nextInt();
        }while(opciones == 0);
        scanner.close();
    }
}