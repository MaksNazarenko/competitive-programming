//Bit Mask
class Solution {
    public char findTheDifference(String s, String t) {
        char ans = t.charAt(t.length()-1);
        for(int i = 0; i < s.length(); i++){
            ans ^= s.charAt(i);
            ans ^= t.charAt(i);
        }
        return ans;
    }
}

//brute force
class Solution {
    public char findTheDifference(String s, String t) {
        int[] letters = new int[26];
        for(int i = 0; i < s.length(); i++){
            letters[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            letters[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(letters[i] == -1) {
                return (char)(i + 'a');
            }
        }
        return ' ';
    }
}