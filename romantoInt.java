class Solution {
    public int romanToInt(String s) {
        int prev = 1000000;
        int answer = 0;
        int new_val;
        
        for (int i = 0; i < s.length(); i++) {
            new_val = decode(s.charAt(i));

            if (new_val > prev) {
                answer += (new_val - prev - prev);
                prev = new_val;
                continue;
            }

            else {
                prev = new_val;
                answer += new_val;
            }
        }
            

        return answer;
        
    }

    private int decode(char x) {
        if (x == 'I') {return 1;}
        else if (x == 'V') {return 5;}
        else if (x == 'X') {return 10;}
        else if (x == 'L') {return 50;}
        else if (x == 'C') {return 100;}
        else if (x == 'D') {return 500;}
        else if (x == 'M') {return 1000;}
        return 0;
    }
}
