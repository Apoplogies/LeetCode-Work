class PlusOne {
    int[] LongerNum;
    int flag = 0;
    public int[] plusOne(int[] digits) {
        //Longer number will onl ybe used if the solution
        // is an integer greater than the input integer
        
        //Add 1 to the last digit
        int x = digits[digits.length - 1] + 1;
        x = x % 10;
        digits[digits.length - 1] = x;
        
        //then increment the digit to the left in place value terms by 1, if needed
        increment(digits, digits.length - 1);
        

        if (flag == 1) {return LongerNum;}
        
        return digits;
    }

    void increment(int[] digits, int index) {
        //We only need to increment if the value has been updated to 10 
        //(which means current index becomes 0, the next number up is incremented by 1)
        if (digits[index] == 0) {
            //If there are no numbers left in the array to increment, we have to make a new array
            if (index == 0) {
                
                int[] new_arr = new int[digits.length + 1];
                new_arr[0] = 1;
                for (int i = 0; i < digits.length; i++) {
                    
                    new_arr[i + 1] = digits[i];
                    
                }

                
                LongerNum = new_arr;
                flag = 1;
            }
            
            else {
                int x = digits[index - 1] + 1;
                x = x % 10;
                digits[index - 1] = x;

                increment(digits, index - 1);
            }  
        }
        

    }
}
