class Solution {
    public boolean isValid(String s) {
        if(s==""||s==" ")
            return false;
        Stack<Character> stk=new Stack();
        int len=s.length();
        char[] ar=new char[len];
        ar=s.toCharArray();
        int flag=0;
        for(char ch:ar){
            if(ch=='('||ch=='{'||ch=='['){
                stk.push(ch);
                flag=1;
            }
            if(ch==')'){
                if(!stk.empty()){
                    if(stk.peek()=='(')
                        stk.pop();
                    else
                        return false;
                }
                else
                    return false;
            }
            if(ch=='}'){
                if(!stk.empty()){
                    if(stk.peek()=='{')
                        stk.pop();
                    else
                        return false;
                }
                else
                    return false;
            }
            if(ch==']'){
                if(!stk.empty()){
                    if(stk.peek()=='[')
                        stk.pop();
                    else
                        return false;
                }
                else
                    return false;
            }
        }
        if(flag==0)
            return false;
        else 
            return stk.empty();
    }
}
