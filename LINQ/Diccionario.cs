using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQ
{
    internal class Diccionario
    {
        public Diccionario()
        {
            //crear diccionario
            //Crear el diccionario el cual es de edades
            Dictionary<string, int> Edades = new Dictionary<string, int>();

            //rellenenar diccionario
            Edades.Add("Juan", 18);
            Edades.Add("Diana", 19);
            Edades.Add("Maria", 21);
            Edades.Add("Julio", 50);
            Edades.Add("Michell", 12);

            //recorrer el diccionario
            foreach(KeyValuePair<string, int> Persona in Edades)
            {
                Console.WriteLine($"Nombre: {Persona.Key} Edad: {Persona.Value}");
                Console.ReadKey();
            }
        }
    }
}
