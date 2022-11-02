package EJERCICIOS;
import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args) 
    {
        int opciones;
        String usuario, contraseña;
        String [] usuarios = {"sebastian"};
        String [] contraseñas = {"23",};

        Scanner scanner = new Scanner(System.in);
        
        do
        {
            System.out.println("USUARIO");
            usuario = scanner.next().toLowerCase();

            System.out.println("CONTRASEÑA");
            contraseña = scanner.next().toLowerCase();
        
            if (usuarios[0].equals(usuario) && contraseñas[0].equals(contraseña)) 
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