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
            Console.WriteLine("---------------------------------------------------");

            IEnumerable<int> squares = Enumerable.Range(1, 10).Select(x => x * x);
            foreach (int x in squares)
            Console.Write("[{0}]", x);
            Console.WriteLine("\nPress any key to continue...");
            Console.ReadKey(true);
        }



    }
}
