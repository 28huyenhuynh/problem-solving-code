class Solution {
    public String makeGood(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            char swapped = (char) (c ^ 32);
            if (!stack.isEmpty() && stack.peek() == swapped) {stack.pop();} else stack.push(c);
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()){
            result.append(stack.peek());
            stack.pop();
        }
        result.reverse();
        return result.toString();
    }
}