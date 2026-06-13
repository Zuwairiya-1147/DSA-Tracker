class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1; i>=0; i--) {
            while(!st.isEmpty() && st.peek() <= arr[i])
            st.pop();
            
            a.add(st.isEmpty()? -1 : st.peek());
            
            st.push(arr[i]);
        }
         Collections.reverse(a);
         return a;
    }
}