class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        
        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) {
                continue;
            }
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && isAnagrams(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                   
                }
            }
             results.add(group);
            
        }
        return results;
    }

    public boolean isAnagrams(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    }

    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }
    for (int c : count) {
        if (c != 0) {
            return false;
        }
    }
    return true;
}

}


