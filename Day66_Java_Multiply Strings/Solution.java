class Solution {
    public String multiply(String num1, String num2) {
        // long n1=Long.parseLong(num1);
        // long n2=Long.parseLong(num2);

        // long num3=n1*n2;

        // String res=Long.toString(num3);
        // return res;

        if(num1.equals("0") || num2.equals("0"))
            return "0";
        
        if(num1=="1")
            return num2;
        
        if(num2=="1")
            return num1;

        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                res[i + j + 1] += mul;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = m + n - 1; i > 0; i--) {
            if (res[i] >= 10) {
                res[i - 1] += res[i] / 10;
                res[i] %= 10;
            }
            sb.append(res[i]);
        }
        if (res[0] != 0) sb.append(res[0]);
        return sb.length() == 0 ? "0" : sb.reverse().toString();
    }
}
