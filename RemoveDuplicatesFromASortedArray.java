public class RemoveDuplicatesFromASortedArray {
    
    public static int removeDuplicates(int[] nums) {

        int write = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                nums[write] = nums[i];
                write++;
            }
        }

        return write;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2};
        System.out.println(removeDuplicates(arr));
    }
}
