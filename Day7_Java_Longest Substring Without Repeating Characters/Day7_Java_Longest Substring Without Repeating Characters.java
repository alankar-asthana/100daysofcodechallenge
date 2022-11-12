class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int p;
        
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            String str=String.valueOf(s.charAt(i));
            p=i+1;
            char ch=s.charAt(p);
            while(!str.contains(String.valueOf(ch))){                
                str+=ch;
                p++;
                if(p==s.length())
                    break;
                ch=s.charAt(p);
            }
            max = Math.max(max, str.length());
        }
        return max;
    }
}
