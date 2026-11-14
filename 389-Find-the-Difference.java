class Solution {
    public char findTheDifference(String s, String t) {
   String concat = s + t;
   char result = 0;
   for (char x: concat.toCharArray()){
    result ^= x;
   }
   return result;
    }
}