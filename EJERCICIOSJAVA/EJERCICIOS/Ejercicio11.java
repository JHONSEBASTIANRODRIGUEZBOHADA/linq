package EJERCICIOS;
import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) 
    {
        int opciones, eleccion = 0, total = 0, puntos = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("QUIEN QUIERE SER MILLONARIO");

        do
        {
            if( eleccion == 0)
            {
                System.out.println("\n(1).¿Qué es una variable?");
                System.out.println("1. Espacio de memoria");
                System.out.println("2. Algoritmo");
                System.out.println("3. Int, string, double, etc");
                opciones = scanner.nextInt();

                if(opciones == 1)
                {
                    System.out.println("CORRECTO");
                    total = total + puntos;
                    System.out.println("Tiene " + total + " puntos");
                    System.out.println("\n(2).¿Qué es Java?");
                    System.out.println("1. Pseudocódigo.");
                    System.out.println("2. Programa.");
                    System.out.println("3. Lenguaje de programación.");
                    opciones = scanner.nextInt();

                    if(opciones == 3)
                    {
                        System.out.println("CORRECTO");
                        total = total + puntos;
                        System.out.println("Tiene " + total + " puntos");
                        System.out.println("\n(3.)¿Qué es un algoritmo?");
                        System.out.println("1. Combinación de pasos lógicos de forma organizada para resolver un problema");
                        System.out.println("2. Combinación de pasos aleatorios de forma desordenada para resolver un problema");
                        System.out.println("3. combinación de pasos aleatorios de forma organizada para resolver un problema");
                        opciones = scanner.nextInt();

                        if(opciones == 1)
                        {
                            System.out.println("CORRECTO");
                            total = total + puntos;
                            System.out.println("Tiene " + total + " puntos");
                            System.out.println("\n(4.)¿Cuál es la segunda fase a la hora de programar?");
                            System.out.println("1. Prueba y depuración.");
                            System.out.println("2. Diseño del algoritmo.");
                            System.out.println("3. Codificación");
                            opciones = scanner.nextInt();

                            if(opciones == 2)
                            {
                                System.out.println("CORRECTO");
                                total = total + puntos;
                                System.out.println("Tiene " + total + " puntos");
                                System.out.println("\n(5.)¿Cual es la manera de reutilizar código?");
                                System.out.println("1. Bloques");
                                System.out.println("2. Variables");
                                System.out.println("3. Funciones");
                                opciones = scanner.nextInt();

                                if(opciones == 3)
                                {
                                    System.out.println("CORRECTO");
                                    total = total + puntos;
                                    System.out.println("Tiene " + total + " puntos");
                                    System.out.println("\nFINALIZO EL JUEGO");

                                }else{System.out.println("INCORRECTO\nFINALIZO EL JUEGO");}

                            }else{System.out.println("INCORRECTO\nFINALIZO EL JUEGO");}

                        }else{System.out.println("INCORRECTO\nFINALIZO EL JUEGO");}

                    }else{System.out.println("INCORRECTO\nFINALIZO EL JUEGO");}

                }else{System.out.println("INCORRECTO\nFINALIZO EL JUEGO");}
                
            }else{System.out.println("INCORRECTO");}

            System.out.println("\nIngrese (0) si quiere volver a jugar. Ingrese (otro numero) si no quiere jugar mas");
            eleccion = scanner.nextInt();

            total = 0;
        }while(eleccion == 0);

        System.out.println("\nGRACIAS POR JUGAR");
        scanner.close();
    }
}