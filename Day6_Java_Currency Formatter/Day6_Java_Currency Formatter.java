import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale in = new Locale("en","in");  
        NumberFormat nf= NumberFormat.getCurrencyInstance(Locale.US);
        String us=nf.format(payment);
        NumberFormat nf2=NumberFormat.getCurrencyInstance(in);
        String india=nf2.format(payment);
        NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=nf3.format(payment);
        NumberFormat nf4=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=nf4.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
