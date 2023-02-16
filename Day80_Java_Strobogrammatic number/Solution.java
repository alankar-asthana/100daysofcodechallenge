import java.util.*;
/*
 * @author Alankar Asthana
 */

public class StrobogrammaticNumber {
    static boolean SBMNumber(String str){
        if(str.contains("2")||str.contains("3")||str.contains("4")||str.contains("5")||str.contains("7") ){
                return false;
            }
        else{
                StringBuilder S=new StringBuilder(str);
                StringBuilder S1=new StringBuilder();
                S.reverse();
                for(int i=0;i<S.length();i++){
                    switch (S.charAt(i)) {
                        case '6':
                            S1.append('9');
                            break;
                        case '9':
                            S1.append('6');
                            break;
                        default:
                            S1.append(S.charAt(i));
                            break;
                    }
                }
                String newstr=S1.toString();
            return newstr.equals(str);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        String str=sc.next();
        if(SBMNumber(str))
            System.out.println(str+" is a Strobogrammatic Number");
        else
            System.out.println(str+" is not a Strobogrammatic Number");
    }
}
