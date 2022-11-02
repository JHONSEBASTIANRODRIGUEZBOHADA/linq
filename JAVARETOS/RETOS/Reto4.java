package RETOS;
import java.util.*;

public class Reto4 {
    public static void main(String[] args)
    {
        int maquina, usuario;

        maquina =  (int)(Math.random()*3+1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPIEDRA, PAPEL O TIGERA");
        System.out.println("\nElija: (1.Piedra), (2.Papel) o (3.Tigera)");
        usuario = scanner.nextInt();

        switch(maquina)
        {
            case 1:
                System.out.println("MAQUINA = Piedra");
                switch(usuario)
                {
                    case 1:
                        System.out.println("HAS EMPATADO");
                    break;

                    case 2:
                        System.out.println("HAS GANADO");
                    break;

                    case 3:
                        System.out.println("HAS PERDIDO");
                    break;

                    default:
                        System.out.println("No ingreso un valor correcto");
                    break;
                }
            break;

            case 2:
                System.out.println("MAQUINA = Papel");
                switch(usuario)
                {
                    case 1:
                        System.out.println("HAS PERDIDO");
                    break;

                    case 2:
                        System.out.println("HAS EMPATADO");
                    break;

                    case 3:
                        System.out.println("HAS GANADO");
                    break;

                    default:
                        System.out.println("No ingreso un valor correcto");
                    break;
                }
            break;

            case 3:
                System.out.println("MAQUINA = Tigera");
                switch(usuario)
                {
                    case 1:
                        System.out.println("HAS GANADO");
                    break;

                    case 2:
                        System.out.println("HAS PERDIDO");
                    break;

                    case 3:
                        System.out.println("HAS EMPATADO");
                    break;

                    default:
                        System.out.println("No ingreso un valor correcto");
                    break;
                }
                break;
        }
        scanner.close();
    }
}
