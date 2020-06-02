/*
Implement selection sort
*/

internal class Program
{
        private static void Main(string[] args)
        {
            int[] ans = { 5, 4, 3, 1, 2, 1 };
            SelectionSort(ans);
            foreach (var item in ans)
            {
                Console.WriteLine(item);
            }
            Console.ReadLine();
        }

        private static void SelectionSort(int[] nums)
        {
            for (int i = 0; i < nums.Length - 1; i++)
            {
                int minIdx = i;
                for (int j = i + 1; j < nums.Length; j++)
                {
                    if (nums[j] < nums[minIdx])
                        minIdx = j;
                }
                int temp = nums[minIdx];
                nums[minIdx] = nums[i];
                nums[i] = temp;
            }
        }
  }
