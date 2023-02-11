
import java.util.*;
/*
 * @author Alankar Asthana
 */
public class Consecutive {
    static boolean isVow(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String str=sc.next();
        if(str.length()==2){
            if(isVow(str.charAt(0)) && str.charAt(0)==str.charAt(1))
                str=str.substring(0,1);
        }
        else{
            for(int i=0;i<str.length()-1;i++){
                if(isVow(str.charAt(i))){
                    while(str.charAt(i)==str.charAt(i+1)){
                        if(i+1 != str.length()-1)
                            str=str.substring(0, i+1)+str.substring(i+2,str.length());
                        else{
                            str=str.substring(0, str.length()-1);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(str);
    }
}
