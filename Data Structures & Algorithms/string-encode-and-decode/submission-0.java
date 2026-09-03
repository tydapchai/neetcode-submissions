class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> results = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int slash = str.indexOf("#", i);

            int length = Integer.parseInt(str.substring(i, slash));

            int start = slash + 1;
            int end = start + length;

            String word = str.substring(start, end);
            results.add(word);
            i = end;
        }
        return results;
    }
}
