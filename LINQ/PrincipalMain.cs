using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQ
{
    internal class PrincipalMain
    {
        static void Main(string[] args)
        {
            //coleccion que almacena elementos de forma LIFO
            Stack<int> num = new Stack<int>();
            foreach (int numero in new int[] { 2, 4, 6, 8, 10 })
            {
                num.Push(numero);

            }

            Console.WriteLine("\nRecorriendo la pila");

            foreach(int numero in num)
            {
                Console.WriteLine("\n" + numero);
            }

            Console.WriteLine("\nEliminar un elemento");

            num.Pop();

            foreach(int numero in num)
            {
                Console.WriteLine("\n" + numero);
            }

            Console.WriteLine("\nPrecione una tecla para salir");
            Console.ReadKey();
        }
    }
}
