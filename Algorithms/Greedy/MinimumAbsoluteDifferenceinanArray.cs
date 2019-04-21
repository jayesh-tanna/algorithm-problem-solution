//Problem: https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
//Language: C#

static int minimumAbsoluteDifference(int[] arr) {
        Array.Sort(arr);
        int min = int.MaxValue;
        for(int i=0;i<arr.Length-1;i++){
            int absDiff = Math.Abs(arr[i] - arr[i+1]);
            if(absDiff < min)
                min = absDiff;
        }
        return min;
    }
