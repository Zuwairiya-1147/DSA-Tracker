class Solution {
    public void reverse(int arr[], int high, int low) {
        if (low >= high)
            return;
        int temp = arr[high];
        arr[high] = arr[low];
        arr[low] = temp;
        reverse(arr, high - 1, low + 1);
    }

    public void reverseArray(int arr[]) {
        int high = arr.length - 1;
        int low = 0;
        reverse(arr, high, low);
    }
}