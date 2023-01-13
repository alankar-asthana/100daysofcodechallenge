class Solution {
    public double myPow(double x, int n) {
        // if(n>=0)
        //     return Math.pow(x,n);
        // else{
        //     double a=Math.abs(n);
        //     return(1/(Math.pow(x,a)));
        // }
        
        //System.out.println(n);
        if(n<0){
            n=-n;
            x=1/x;
        }
        //System.out.println(n);
        double pow=1;
        while(n!=0){
            if((n & 1) != 0){
                pow*=x;
            }
            x*=x;
            n=n>>>1;
        }
        return pow;
    }
}
