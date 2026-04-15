import java.util.HashSet;
class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> x = new HashSet<Integer>();
        int offset = 0;
        int original = nums.length;
        for (int i = 0; i < nums.length - offset; i++) {

            
            while ((i + offset < original) && x.contains(nums[i + offset])) {
                //remove the element
                offset++;
            }

            if (i + offset >= original) {break;}
            x.add(nums[i + offset]);
            nums[i] = nums[i + offset];
        }

        
        return original - offset;
    }
}
