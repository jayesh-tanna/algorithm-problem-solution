
/*
Write a function to find duplicates from given integer array.
*/


static List<int> FindDuplicates(int[] arr)
        {
            if (arr == null)
                throw new ArgumentNullException();
            if (arr.Length == 0)
                throw new ArgumentException();
            HashSet<int> set = new HashSet<int>();
            List<int> duplicateItems = new List<int>();
            for (int i = 0; i < arr.Length; i++)
            {
                if (set.Contains(arr[i]))
                    duplicateItems.Add(arr[i]);
                else
                    set.Add(arr[i]);
            }
            duplicateItems.Sort();
            return duplicateItems;
        }
