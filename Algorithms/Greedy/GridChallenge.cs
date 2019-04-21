//Problem: https://www.hackerrank.com/challenges/grid-challenge/problem
//Language: C#

static string gridChallenge(string[] grid) {
        for (int i = 0; i < grid.Length; i++){
            grid[i] = String.Concat(grid[i].OrderBy(c => c));
        }
        for(int row = 0;row<grid.Length-1;row++){
            for(int col = 0;col<grid.Length-1;col++){
                if(grid[col][row] > grid[col+1][row])
                    return "NO";
            }
        }
        return "YES";
    }
