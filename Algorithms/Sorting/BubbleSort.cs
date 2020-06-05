/*
Implement bubble sort
*/

internal class Program
    {
        private static void Main(string[] args)
        {
            int[] ans = { 5, 4, 3, 1, 2 };
            BubbleSort(ans);
            foreach (var item in ans)
            {
                Console.WriteLine(item);
            }
            Console.ReadLine();
        }

        public static void BubbleSort(int[] nums)
        {
            for (int i = 0; i < nums.Length - 1; i++)
            {
                bool swap = false;
                for (int j = 0; j < nums.Length - i - 1; j++)
                {
                    if (nums[j] > nums[j + 1])
                    {
                        swap = true;
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
                if (!swap)
                    break;
            }
        }
 }
