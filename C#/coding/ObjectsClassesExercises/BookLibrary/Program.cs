using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookLibrary
{
    class Program
    {
        class Library
        {
            public string Name { get; set; }
            public List<Book> BookList { get; set; }
        }

        class Book
        {
            public string Title { get; set; }
            public string Name { get; set; }
            public double Price { get; set; }
        }

        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            List<Book> bookList = new List<Book>();

            for (int i = 1; i <= n; i++)
            {
                string[] input = Console.ReadLine().Split().ToArray();
                Book book = new Book() { Title = input[0], Name = input[1], Price = double.Parse(input[5])};
                bookList.Add(book);
            }

            bookList = bookList.OrderBy(a => a.Name).ToList();
            List<Book> temp = new List<Book>();
            List<Library> libraryList = new List<Library>();

            string name = bookList[0].Name;

            for (int i = 0; i < bookList.Count; i++)
            {
                if (bookList[i].Name != name)
                {
                    Library newOne = new Library();
                    newOne.Name = name;
                    newOne.BookList = temp.ToList();
                    libraryList.Add(newOne);
                    temp.Clear();
                    name = bookList[i].Name;
                    temp.Add(bookList[i]);
                    if (i == bookList.Count - 1)
                    {
                        Library newOne1 = new Library();
                        newOne1.Name = name;
                        newOne1.BookList = temp.ToList();
                        libraryList.Add(newOne1);
                    }
                }
                else
                {
                    temp.Add(bookList[i]);
                    if (i == bookList.Count - 1)
                    {
                        Library newOne = new Library();
                        newOne.Name = name;
                        newOne.BookList = temp.ToList();
                        libraryList.Add(newOne);
                    }
                }
            }
            Dictionary<string, double> results = new Dictionary<string, double>();
            foreach (Library library in libraryList)
            {
                double sum = 0.0;
                foreach (Book book in library.BookList)
                {
                    sum += book.Price;
                }
                results[library.Name] = sum;
                sum = 0.0;
            }

            results = results.OrderByDescending(a => a.Value).ToDictionary(pair => pair.Key, pair => pair.Value);
            foreach (KeyValuePair<string, double> pair in results)
            {
                Console.WriteLine("{0} -> {1:f2}", pair.Key, pair.Value);
            }
        }
    }
}
