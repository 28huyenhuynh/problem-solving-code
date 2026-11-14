class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
       for (int i = 0; i < logs.length; i++){
        if (logs[i].equals("../")) {
            if (count > 0) count--;
        } else if (logs[i].equals("./")){
            count = count; //so that we dont need to use regex for "x/"  
        } else {count++;}
       } 
         return count;
    }
}