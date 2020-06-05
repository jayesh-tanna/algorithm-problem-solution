/*
implement insertion sort
*/
internal class Program
    {
        private static void Main(string[] args)
        {
            int[] ans = { 2, 3, 4, 1, 5 };
            InsertionSort(ans);
            foreach (var item in ans)
            {
                Console.WriteLine(item);
            }
            Console.ReadLine();
        }

        public static void InsertionSort(int[] nums)
        {
            for (int i = 1; i < nums.Length; i++)
            {
                int value = nums[i];
                int j = i;
                while (j > 0 && nums[j - 1] >= value)
                {
                    nums[j] = nums[j - 1];
                    j--;
                }
                nums[j] = value;
            }
        }
   }     
