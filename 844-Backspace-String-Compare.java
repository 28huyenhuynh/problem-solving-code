class Solution {
    public boolean backspaceCompare(String s, String t) {
    ArrayDeque<Character> S = new ArrayDeque<>();
    ArrayDeque<Character> T = new ArrayDeque<>();
    for (int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if (c == '#'){
            if (!S.isEmpty()) S.pop();} else S.push(c); 
    }
    for (int i = 0; i < t.length(); i++){
        char c = t.charAt(i);
        if (c == '#'){
            if (!T.isEmpty()) T.pop();} else T.push(c); 
    }

    return S.toString().equals(T.toString());
    }
}