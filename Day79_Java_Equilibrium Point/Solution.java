import java.util.*;
/*
 * @author Alankar Asthana
 */
public class Equilibrium {
    public static void main(String[] args){
        int[] arr={3,4,8,-9,9,7};
        int n=arr.length;
        int pos=0;
        int rs=0;
        for(int i=0;i<n;i++)
            rs+=arr[i];
        int ls=0;
        for(int i=0;i<n;i++){
            rs-=arr[i];
            if(ls==rs){
                pos=i+1;
                break;
            }
            ls+=arr[i];
        }
        System.out.println("Equilibrium Position is: "+pos);
        System.out.println("Element at equilibrium position is: "+arr[pos-1]);
    }
}
