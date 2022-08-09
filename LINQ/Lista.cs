using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQ
{
    internal class Lista
    {
        public Lista()
        {
            List<string> Colores = new List<string>();
            Colores.Add("Azul");
            Colores.Add("Rojo");
            Colores.Add("Verde");
            Colores.Add("Amarillo");
            Colores.Add("Morado");

            Colores[1] = "Rosado";
            Colores.Insert(5, "Blanco");
            Colores.Sort();

            foreach (string color in Colores)
            {
                Console.WriteLine(color);
            }

            Console.WriteLine("\nCount: " + Colores.Count);

            Console.WriteLine("\nValor dentro del indice: " + Colores.IndexOf("Amarillo"));
            Console.WriteLine("\nEl valor se encuentra en la lista: " + Colores.Contains("Verde"));
            Console.Clear();
            Console.WriteLine("\nCount: " + Colores.Count);
            Console.ReadKey();
        }
    }
}
