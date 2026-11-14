class Solution {
    public int minLength(String s) {
        if (!s.contains("AB") && !s.contains("CD")) return s.length();
        while (s.contains("AB") || s.contains("CD")) {
            s = s.replaceAll("AB", "");
            s = s.replaceAll("CD", "");
        }
        return s.length();
    }
}