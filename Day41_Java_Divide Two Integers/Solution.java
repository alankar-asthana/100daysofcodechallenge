class Solution {
    public int divide(int dividend, int divisor) {
        
        // int endr=(int)Math.pow(2,31)-1;
        // int startr=2*(-1);
        // startr=(int)Math.pow(startr,31);

        // int div1=dividend;
        // int div2=divisor;
        // if(dividend==startr && divisor<0)
        //     return (dividend*(-1)-1);
        // if(dividend==endr)
        //     return dividend;
        // if(dividend<0)
        //     div1=dividend*(-1);
        // if(divisor<0)
        //     div2=divisor*(-1);
        // System.out.println(div1+" "+div2);
        // if(div2>div1)
        //     return 0;
        // if(div2==0)
        //     return 0;
        // System.out.println(div1+" "+div2);
        // int flag=0;
        // for(int i=0;i<=div1;i=i+div2){
        //     flag++;
        // }
        // flag--;
        // System.out.print(flag);
        
        // if(divisor<0 || dividend<0)
        //     flag=flag*(-1);
        // if(divisor<0 && dividend<0)
        //     flag=flag*(-1);
        // if(flag>(Math.pow(2,31)-1))
        //     return (int)(Math.pow(2,31)-1);
        // if(flag<(startr))
        //     return startr;
        // return flag;

        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }
        // Sign of result
        int sign = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0) ? -1 : 1;
        // Quotient
        int quotient = 0;
        // Take the absolute value
        long absoluteDividend = Math.abs((long) dividend);
        long absoluteDivisor = Math.abs((long) divisor);
        // Loop until the  dividend is greater than divisor
        while (absoluteDividend >= absoluteDivisor) {
            // This represents the number of bits shifted or
            // how many times we can double the number
            int shift = 0;
            while (absoluteDividend >= (absoluteDivisor << shift)) {
                shift++;
            }
            // Add the number of times we shifted to the quotient
            quotient += (1 << (shift - 1));
            // Update the dividend for the next iteration
            absoluteDividend -= absoluteDivisor << (shift - 1);
        }
        return sign == -1 ? -quotient : quotient;
    }
}
