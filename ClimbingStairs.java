class ClimbingStairs {
    public int climbStairs(int n) {
        //DP solution
        int[] dp_arr = new int[n];
        return subtractAndRecurse(n, dp_arr);
        
    }

    int subtractAndRecurse(int n, int[] dp_arr) {
        //n is the number of remaining steps
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }

        else if (n == 2) {
            return 2;
        }

        else if (n == 3) {
            return 3;
        }

        if (dp_arr[n - 1] != 0) {
            return dp_arr[n - 1];
        }        
        else {
            int sol = subtractAndRecurse(n - 1, dp_arr) + subtractAndRecurse(n-2, dp_arr);
            dp_arr[n - 1] = sol;
            return sol;
        }
        
            
        
        

    }
}
