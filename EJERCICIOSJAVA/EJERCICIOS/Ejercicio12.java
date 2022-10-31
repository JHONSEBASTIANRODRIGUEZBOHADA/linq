package EJERCICIOS;
import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) 
    {
        int totalIntentos = 3, intentos = 0, palAleatoria, acertado = 0;
        String palabras;
        String letUsuario;

        String[] palCosas = {"pez", "cocina", "lavadora"};

        palAleatoria = (int) Math.floor(Math.random() * palCosas.length);
        palabras = palCosas[palAleatoria];

        Scanner scanner = new Scanner(System.in);

        char[] letra = palabras.toCharArray();

        char[] letGuion = new char[letra.length];

        for(int i = 0; i < letra.length; i++)
        {
            letGuion[i] = '_';
        }

        System.out.println("AHORCADO");

        do
        {
            System.out.println("\nIntentos maximos: " + totalIntentos);
            System.out.println("Usted lleva: " + intentos);
            System.out.println("LA PALABRA TIENE: " + palabras.length() + " LETRAS");
            System.out.println(letGuion);

            System.out.println("\nIngrese una letra");
            letUsuario = scanner.next();
            
            if(palabras == letUsuario)
            {
                if(Arrays.equals(letra, letGuion))
                {
                    System.out.println(letGuion);
                    System.out.println("\uD83D\uDC7D");
                    System.out.println("ADIVINO LA PALABRA");
                    acertado = 1;
                }
            }
            if(palabras != letUsuario)
            {
                intentos++;
            }
            if(totalIntentos == intentos)
            {
                System.out.println("\nIntentos maximos: " + totalIntentos);
                System.out.println("Usted lleva: " + intentos);
                System.out.print("Se acabaron los intentos\nPERDIO");
                System.out.println("\nFINALIZO EL JUEGO");
                System.out.println("\nIngrese (0) si quiere volver a jugar. Ingrese (otro numero) si no quiere jugar mas");
                acertado = scanner.nextInt();
                intentos = 0;
            }
        }while(acertado == 0);
        System.out.println("Gracias por jugar");
        scanner.close();




















/*
        package EJERCICIOS;
import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) 
    {
        int totalIntentos = 3, intentos = 0, palAleatoria, acertado = 0;
        String palabras;
        char letUsuario;

        String[] palCosas = {"pez", "cocina", "lavadora"};

        palAleatoria = (int) Math.floor(Math.random() * palCosas.length);
        palabras = palCosas[palAleatoria];

        Scanner scanner = new Scanner(System.in);

        char[] letra = palabras.toCharArray();

        char[] letGuion = new char[letra.length];

        for(int i = 0; i < letra.length; i++)
        {
            letGuion[i] = '_';
        }

        System.out.println("AHORCADO");

        do
        {
            if(acertado == 0)
            {
                System.out.println("\nIntentos maximos: " + totalIntentos);
                System.out.println("Usted lleva: " + intentos);
                System.out.println("LA PALABRA TIENE: " + palabras.length() + " LETRAS");
                System.out.println(letGuion);

                System.out.println("\nIngrese una letra");
                letUsuario = scanner.next().charAt(0);

                for(int i = 0; i < letra.length; i++)
                {
                    if(letra[i] == letUsuario)
                    {
                        letGuion[i] = letUsuario;
                        if(Arrays.equals(letra, letGuion))
                        {
                            System.out.println(letGuion);
                            System.out.println("ADIVINO LA PALABRA");
                            acertado = 1;
                        }
                    }
                    if(letra[i] != letUsuario)
                    {
                        intentos++;
                    }
                    if(totalIntentos == intentos)
                    {
                        System.out.println("\nIntentos maximos: " + totalIntentos);
                        System.out.println("Usted lleva: " + intentos);
                        System.out.println("Se acabaron los intentos\nPERDIO\nFINALIZO EL JUEGO");
                        System.out.println("\nIngrese (0) si quiere volver a jugar. Ingrese (otro numero) si no quiere jugar mas");
                        acertado = scanner.nextInt();
                        intentos = 0;
                    }
                }
            }
        }while(acertado == 0);
        System.out.println("Gracias por jugar");
        scanner.close();
    }
} 
         */
    }
}