import java.util.HashMap;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int ptr_1 = 0;
        int ptr_2 = 0;
        int length = s1.length();
        int window_length = ptr_2 - ptr_1;
        HashMap<Character, Integer> instantCheck = new HashMap<>();
        HashMap<Character, Integer> temp = new HashMap<>();
        //First, we initialise a hashmap with Key (character) : Value (Number of times it appears in s1)
        //One, instant check, remains static; it is a fixed reference that holds the original frequency
        //The temp hashmap can be changed as needed
        for (int i = 0; i < s1.length(); i++) {
            if (instantCheck.get(s1.charAt(i)) == null) {
                instantCheck.put(s1.charAt(i), 1);
                temp.put(s1.charAt(i), 1);
            }
            else {
                int existing_count = instantCheck.get(s1.charAt(i));
                instantCheck.put(s1.charAt(i), existing_count + 1);
                temp.put(s1.charAt(i), existing_count + 1);
            }
        }

        //We can then check, for each 
        
        while (ptr_2 < s2.length() && window_length < length) {
            
            if (temp.get(s2.charAt(ptr_2)) == null || temp.get(s2.charAt(ptr_2)) == 0) {
                
                int ptr_3 = ptr_2 - 1;
                while (ptr_3 >= ptr_1) {
                    int originalFrequency = instantCheck.get(s2.charAt(ptr_3));
                    temp.put(s2.charAt(ptr_3), originalFrequency);
                    ptr_3--;
                }
                


                if (ptr_1 == ptr_2) {
                    ptr_1++;
                    ptr_2++;
                }
                else {
                    ptr_1++;
                    ptr_2 = ptr_1;
                }

               
            }

            else {
                int temp_val = temp.get(s2.charAt(ptr_2));
                temp.put(s2.charAt(ptr_2), temp_val - 1);
                ptr_2++;
                window_length = ptr_2 - ptr_1;
                
            }


        }
        if (window_length == length) {return true;}
        return false;
    }
}
