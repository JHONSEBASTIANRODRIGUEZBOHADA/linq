package RETOS;
import java.util.*;

public class Reto2 {
    public static void main(String[] args)
    {
        int meses, peso, dosisVacunas;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad en meses del bebe");
        meses = scanner.nextInt();
        try
        {
            if(meses <= 12)
            {
                System.out.println("Ingrese el peso del bebe en kg");
                peso = scanner.nextInt();

                dosisVacunas = (peso + 10)/(meses * 10) * 8;

                System.out.println("La cantida de dosis a aplicar es: " + dosisVacunas);
            }
            else
            {
                System.out.println("No tiene la edad indicada");
            }
        }catch (Exception e)
        {
            System.out.println("ingreso un valor incorrecto");
        }
        scanner.close();
    }
}
