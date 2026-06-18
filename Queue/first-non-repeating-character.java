class Solution {
    public String firstNonRepeating(String s) {
        // code here
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];
        StringBuilder sbr = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
            q.offer(s.charAt(i));
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.poll();
            }
            if(q.isEmpty())
            sbr.append("#");
            else
            sbr.append(q.peek());
        }
        return sbr.toString();
    }
}