
/*
Given Binary Search Tree. The task is to find sum of all elements smaller than and equal to Kth smallest element.
https://practice.geeksforgeeks.org/problems/sum-of-k-smallest-elements-in-bst/0
*/

using System;

namespace CrackingCoding
{
    public class Program1
    {
        static public void Main()
        {
            int testcases = Convert.ToInt32(Console.ReadLine());
            while (testcases-- > 0)
            {
                int sizeOfArray = Convert.ToInt32(Console.ReadLine());
                int[] arr = new int[sizeOfArray];
                arr = Array.ConvertAll(Console.ReadLine().Trim().Split(), int.Parse);

                Node root = null;

                for (int i = 0; i < sizeOfArray; i++)
                {
                    root = BinaryTree.newNode(root, arr[i]);
                }

                int k = Convert.ToInt32(Console.ReadLine());
                int sum = BinaryTree.GetSumOfKSmallestElements(root, k);
                Console.WriteLine(sum);
            }
        }
    }

    public class Node
    {
        public int data;
        public Node left;
        public Node right;
    }

    public class Data
    {
        public int K { get; set; }
        public int Sum { get; set; }

        public Data(int k)
        {
            K = k;
        }
    }

    public class BinaryTree
    {
        public static Node createNewNode(int value)
        {
            Node temp = new Node();
            temp.data = value;
            temp.left = null;
            temp.right = null;
            return temp;
        }

        static public Node newNode(Node root, int data)
        {
            if (root == null)
                root = createNewNode(data);
            else if (data < root.data)
                root.left = newNode(root.left, data);
            else
                root.right = newNode(root.right, data);

            return root;
        }

        internal static int GetSumOfKSmallestElements(Node root, int k)
        {
            Data data = new Data(k);
            PrintSumOfKSmallestElements(root, data);
            return data.Sum;
        }

        private static void PrintSumOfKSmallestElements(Node root, Data data)
        {
            if (root == null || data.K <= 0)
                return;

            PrintSumOfKSmallestElements(root.left, data);

            if (data.K <= 0)
                return;

            data.Sum += root.data;
            data.K--;

            PrintSumOfKSmallestElements(root.right, data);
        }
    }
}
