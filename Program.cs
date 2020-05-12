using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Drawing;
using System.IO;

namespace ConsoleApp1
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var cells = new List<Cell>();
            var points = new Point[1];
            points[0] = new Point(10, 20);
            var linkdatas = new List<LinkData>
            {
                new LinkData(30, 40, points[0])
            };
            cells.Add(new Cell(1, 1, points, linkdatas, false));
            using (var file = File.CreateText(@"C:\Work\test.txt"))
            {
                var serializer = new JsonSerializer
                {
                    ReferenceLoopHandling = ReferenceLoopHandling.Serialize,
                    Formatting = Formatting.Indented,
                    PreserveReferencesHandling = PreserveReferencesHandling.None,
                    TypeNameHandling = TypeNameHandling.Auto
                };
                serializer.Serialize(file, cells);
            }
            using (var reader = new StreamReader(@"C:\Work\test.txt"))
            {
                var result = reader.ReadToEnd();
                reader.Close();
                var desCells = JsonConvert.DeserializeObject<List<Cell>>(result);
                Console.WriteLine(desCells[0].Links[0].Location.X);
                Console.WriteLine(desCells[0].Links[0].Location.Y);
            }

            Console.ReadLine();
        }
    }

    public class Cell
    {
        [JsonProperty("ID")]
        public int Id { get; set; }

        [JsonProperty("IsHint")]
        public bool IsHint { get; set; }

        [JsonProperty("Number")]
        public int Number { get; set; }

        [JsonProperty("Points")]
        public Point[] Points { get; set; }

        [JsonProperty("Links")]
        public List<LinkData> Links { get; set; }

        [JsonConstructor]
        public Cell(int id, int number, Point[] points, List<LinkData> links, bool isHint = false)
        {
            Id = id;
            Number = number;
            IsHint = isHint;
            Links = links; // always empty !!!
            Points = points;
        }

        // Code not serialized
    }

    public struct LinkData
    {
        [JsonConstructor]
        public LinkData(int cellId1, int cellId2, Point linkLocation)
        {
            CellId1 = cellId1;
            CellId2 = cellId2;
            Location = linkLocation;
        }

        [JsonProperty("CellId1")]
        public int CellId1 { get; }

        [JsonProperty("CellId2")]
        public int CellId2 { get; }

        [JsonProperty("linkLocation")]
        public Point Location { get; }

        public static LinkData Empty => new LinkData(0, 0, Point.Empty);
    }
}