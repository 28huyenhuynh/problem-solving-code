// XOR all chars of s and t: matching pairs cancel out, the extra char is left
public class Lc0389FindTheDifference {

    public char findTheDifference(String s, String t) {
        String concat = s + t;
        char result = 0;
        for (char x : concat.toCharArray()) {
            result ^= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Lc0389FindTheDifference sol = new Lc0389FindTheDifference();
        System.out.println(sol.findTheDifference("abcd", "abcde")); // expect e
    }
}