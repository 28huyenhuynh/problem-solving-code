class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()){
            if (!stack.isEmpty() && (stack.peek() == '(' && c == ')' || stack.peek() == '[' && c == ']' || stack.peek() == '{' && c == '}')){
                stack.pop();
            } else
            stack.push(c);
        }
        if (stack.size() != 0) return false;
        return true;
    }
}