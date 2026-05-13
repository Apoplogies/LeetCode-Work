class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        //This solution uses binary search to find the location
        //of a number in a sorted array, or insert it into
        //the location it should be placed in.

        
        int min = 0;
        int max = nums.length - 1;
        int tracker = (max + min)/2;

        //edge cases are edge cases
        if (nums[nums.length - 1] < target) {return nums.length;}

        if (nums[0] > target) {return 0;}
        //binary search
        while (tracker >= min && tracker <= max) {
            
            if (nums[tracker] == target) {
                return tracker;
            }
            

            else if (max - min == 1) {
                return max;
            }

            else if (nums[tracker] > target) {
                max = tracker;
            }

            else if (nums[tracker] < target) {
                min = tracker;
            }

        
            
            tracker = (max + min)/2;

        }
        return tracker;
    }
}
```
