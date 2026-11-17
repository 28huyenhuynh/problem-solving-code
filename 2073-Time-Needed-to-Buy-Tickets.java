class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < tickets.length; i++){
            queue.offer(i);
        }
        int time = 0;
        int i;
        while (!queue.isEmpty()){
            i = queue.poll();
            tickets[i] = tickets[i] - 1;
            time++;
            if (i == k && tickets[i] == 0) return time;
            if (tickets[i] > 0) queue.offer(i);
        }
        return time; 
    }
}