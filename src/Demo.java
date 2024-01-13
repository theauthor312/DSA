public class Demo {
    public static void main(String[] args) {
       int[] nums = {2, 5, 12, 13, 18, 19, 22, 25, 28, 31, 36, 40, 42, 44, 45, 50};
       int target = 31;

       int result1 = linearSearch(nums, target, 0);
       int result2 = binarySearch(nums, target, 0, nums.length - 1, 0);

       if(result2 != -1)
           System.out.println("Element found at Index: " + result2);
       else
           System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target, int index) {
        /// LINEAR SEARCH ALGORITHM - O(n)
        if (nums[index] == target) {
            return index;
        }else{
            index++;
            if (index == nums.length)
                return -1;
            return linearSearch(nums, target, index);
        }
    }

    public static int binarySearch(int[] nums, int target, int left, int right, int noOfTimesCalled) {
        /// BINARY SEARCH ALGORITHM - O(log n)
        if(left<=right){
            noOfTimesCalled++;
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                System.out.println("Steps taken by Binary: " + noOfTimesCalled);
                return mid;
            }else if (nums[mid] < target){
                return binarySearch(nums, target, mid + 1, right, noOfTimesCalled);
            }else if (nums[mid] > target){
                return binarySearch(nums, target, left, mid - 1, noOfTimesCalled);
            }
        }
        System.out.println("Steps taken by Binary: " + noOfTimesCalled);
        return -1;
    }
}
