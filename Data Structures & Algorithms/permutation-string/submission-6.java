class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] countS1=  new int[26];
        int n = s1.length();
        if(n>s2.length()) return false;
        int[] window = new int[26];
        for(int i = 0;i<s1.length();i++){
            countS1[s1.charAt(i)-'a']++;
        }
        for(int i = 0;i<s2.length();i++){
            window[s2.charAt(i)-'a']++;
            if(i>=n){
                window[s2.charAt(i-n)-'a']--;
            }
            if(Arrays.equals(window,countS1)) return true;
        }       
        return false;
    }
}
