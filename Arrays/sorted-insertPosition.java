class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int high = arr.length - 1;
        int low = 0;
        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k)
                return mid;
            else if (arr[mid] < k)
                low = mid + 1;
            else
                high = low - 1;
        }
        return low;
    }
};