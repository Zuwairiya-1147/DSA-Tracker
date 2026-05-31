class Solution{
    public int numbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                count++;
        }
        return count;
    }
    public void moveZeroes(int[] nums){
        int count = numbers(nums);
        int[] a = new int[count];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                a[k++] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(k > i)
                nums[i]=a[i];
            else
                nums[i]=0;
        }
    }
}


//Optimal
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i=index; i<nums.length; i++) {
            nums[i]=0;
        }
    }
}
