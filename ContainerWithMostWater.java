class ContainerWithMostWater {
    public int maxArea(int[] height) {
        //I had a lot of difficulty with this one; the greedy algorithm is not super intuitive imo!
        //Neetcode + the leetcode hints was valuable
        int ptr1 = 0;
        int ptr2 = height.length - 1;
        int max = area(height, ptr1, ptr2);



        while (ptr2 > ptr1) {
            int h1 = height[ptr1];
            int h2 = height[ptr2];

            if (h1 > h2) {
                ptr2--;
            }
            else {ptr1++;}

            int temp = area(height, ptr1, ptr2);
            if (temp > max) {max = temp;}
        }


        return max;

        
    }

    public int area(int[] heights, int val1, int val2) {
        int temp = heights[val1];
        if (heights[val2] < heights[val1]) {
            temp = heights[val2];
        }

        return (temp) * (val2 - val1);
    }
}
```
