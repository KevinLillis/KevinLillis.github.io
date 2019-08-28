public class EvaluatingExpressions {
    public static void main(String[] args) {
        long long1, long2;
        long1 = 21474836472345L; // A long literal value
        long2 = long1 + long1; // Adding two longs give a long. No conversion used
        
        
        int iValue = 1;
        double dValue = 3.14;
        
        System.out.println(iValue + dValue); // this ends up being a double value
        
        // Numeric overflow
        int maxValue = 2147483647; // Largest possible int value

        // Adding 1 to the largest int value causes an overflow and we
        // end up with the larges possible negative value.
        int intValue = maxValue + 1; // Adding 1 causes an overflow 
        System.out.println("intValue = " + intValue);
        
        // Look at division
        // This does integer division
        int iResult = 20 / 3;
        System.out.println("iResult = " + iResult);

        
        // This does integer division, then converts the result to a double
        double dResult1 = 20 / 3;
        System.out.println("dResult1 = " + dResult1);
        
        
        // The 20 is cast to double. The 3 is automatically converted to a double.
        // Floating point division is then performed.
        double dResult2 = (double)20 / 3;
        System.out.println("dResult2 = " + dResult2);
                
        
        
        
    }
    
}
