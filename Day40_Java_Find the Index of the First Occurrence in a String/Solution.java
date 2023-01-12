class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==""||haystack==null||haystack==" "||needle==""||needle==null||needle==" ")
            return -1;
        if(haystack.length()<needle.length())
            return -1;
        if(haystack.length()==needle.length()){
            if(haystack.equalsIgnoreCase(needle))
                return 0;
            else return -1;
        }
        char[] ch1= haystack.toCharArray();
        char[] ch2=needle.toCharArray();
        
        for(int i=0;i<ch1.length-(ch2.length-1);i++){
            int flag=0;
            if(ch1[i]==ch2[0]){
                //System.out.println(ch1[i]);
                flag++;
                for(int j=1;j<ch2.length;j++){
                    if(ch2[j]==ch1[i+j]){
                        //System.out.println(ch1[j+i]);
                        flag++;
                    }
                    else
                        break;
                }
                if(flag==ch2.length)
                    return i;
            }
        }
        return -1;
    }
}
