class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int[] count = new int[26]; 
        for (int i = 0; i < s.length(); i++){
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            };
            count[s.charAt(i) - 'a']++;
        }
        int min = s.length();
        boolean exist = false;
        for (int i = 0; i < 26; i++){
            if (count[i] == 1) {min = Math.min(min, map.get((char) (i + 'a')));
            exist = true;}
        }
        if (exist == false) return -1;
        return min;
    }
}