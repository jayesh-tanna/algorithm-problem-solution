/*
https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
Given an unsorted array of n integers which can contain integers from 1 to n. Some elements can be repeated multiple times and some other elements can be absent from the array. Count frequency of all elements that are present and print the missing elements.
*/


public static void findCounts(int[] arr, int n)
        {
           
            int i = 0;
            while (i < n)
            {
              
                if (arr[i] <= 0)
                {
                    i++;
                    continue;
                }

              
                int elementIndex = arr[i] - 1;

               
                if (arr[elementIndex] > 0)
                {
                    arr[i] = arr[elementIndex];

                   
                    arr[elementIndex] = -1;
                }
                else
                {
                    
                    arr[elementIndex]--;

                  
                    arr[i] = 0;
                    i++;
                }
            }

            Console.Write("\nBelow are counts of " +
                           "all elements" + "\n");
            for (int j = 0; j < n; j++)
                Console.Write(j + 1 + "->" +
                   Math.Abs(arr[j]) + "\n");
        }
