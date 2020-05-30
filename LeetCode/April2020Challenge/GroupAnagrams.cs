/*
https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3288/
Given an array of strings, group anagrams together.
Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
*/

public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        if (strs == null)
                throw new ArgumentNullException();
            var dict = new Dictionary<string, IList<string>>();
            for (int i = 0; i < strs.Length; i++)
            {
                string sorted = String.Concat(strs[i].OrderBy(c => c));
                if (!dict.ContainsKey(sorted))
                    dict.Add(sorted, new List<string>());
                dict[sorted].Add(strs[i]);
            }
            return dict.Select(x => x.Value).ToList();
    }
}
