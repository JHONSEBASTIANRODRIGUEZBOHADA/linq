using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQ
{
    internal class MetodoRange
    {
        public void segundometodo ()
        {
            /*Console.WriteLine("---------------------------------------------------");

            IEnumerable<int> squares = Enumerable.Range(1, 10).Select(x => x * x);
            foreach (int x in squares)
            Console.Write("[{0}]", x);
            Console.WriteLine("\nPress any key to continue...");
            Console.ReadKey(true);*/



            Stack<string> pila = new Stack<string>();

            pila.Push("hola");
            pila.Push("buenas");
            pila.Push("tardes,");
            pila.Push("adios");
            pila.Push("a todos.");

            pila.Pop(); // pop quitar un elemento


            Console.WriteLine("Primer elemento: " + pila.Peek()); // peek = saber cual es el primer elemento de la pila

            pila.Clear();

            Console.WriteLine("Tipo de arreglo : " + pila.ToArray());  // ToArray detetecta el tipo de array

            Console.WriteLine("El arreglo contiene un elemento denominado (buenos dias):  " + pila.Contains(""));  // ToArray detetecta el tipo de array

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
