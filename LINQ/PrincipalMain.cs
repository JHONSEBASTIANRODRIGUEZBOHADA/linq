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
            Stack<string> pila = new Stack<string>();

            pila.Push("hola");
            pila.Push("buenas");
            pila.Push("tardes,");
            pila.Push("adios");
            pila.Push("a todos.");

            pila.Pop(); // pop quitar un elemento


            Console.WriteLine("Primer elemento: " + pila.Peek()); // peek = saber cual es el primer elemento de la pila
            
            pila.Clear();

            pila.

            Console.WriteLine("Numero elementos: " + pila.Count); // count = saber el numero de elementos de la pila
            
            //Console.WriteLine("mmmdmdmd" + pila.ToArray());

            foreach (string p in pila)
            {
                Console.WriteLine(p);
            }

            Console.WriteLine("\npresione una tecla para seguir");
            Console.ReadLine();
        }
    }
}
