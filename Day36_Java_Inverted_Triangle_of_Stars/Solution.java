import java.util.* ;

// Solution1:

class Solution {
    static String[] invIsoTriangle(int n) {
        // code here
        String[] ar=new String[n];
        String s="";
        int p=0;
        for(int i=n;i>0;i--){
            for(int k=n;k>i;k--){
                s+=" ";
            }
            for(int j=2*i-1;j>0;j--){
                s+="*";
            }
            ar[p]=s;
            p++;
            s="";
        }
        return ar;
    }
};

//Solution2:

public class Solution 
{
	public static ArrayList<String> Triangle(int n)
    {
        //    Write your code here.
        ArrayList<String> ar=new ArrayList();
        String s="";
        for(int i=n;i>0;i--){
            for(int k=n;k>i;k--){
                s+=" ";
            }
            for(int j=2*i-1;j>0;j--){
                s+="*";
            }
            ar.add(s);
            s="";
        }
        return ar;
    }
}
