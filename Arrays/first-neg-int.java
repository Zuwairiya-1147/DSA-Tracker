class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        ArrayList<Integer> neg = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                q.add(arr[i]);
            }
            if (i >= k - 1) {
                if (!q.isEmpty())
                    neg.add(q.peek());
                else
                    neg.add(0);

                if (!q.isEmpty() && arr[i - k + 1] == q.peek())
                    q.poll();
            }
        }
        return neg;
    }
}