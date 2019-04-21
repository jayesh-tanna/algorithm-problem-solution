//Problem: https://www.hackerrank.com/challenges/two-arrays/problem
//Language: C#

static string twoArrays(int k, int[] A, int[] B) {
        Array.Sort(A);
        Array.Sort(B, new Comparison<int>((a,b) => b.CompareTo(a)));
        for(int i=0;i<A.Length;i++){
            if(A[i] + B[i] < k)
                return "NO";
        }
        return "YES";
    }
