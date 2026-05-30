class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += arr[i];

        max = sum;

        for (int i = k; i < arr.length; i++) {
            sum -= arr[i - k];
            sum += arr[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }
}