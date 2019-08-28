public class TypeConversion {
    public static void main(String[] args) {
        // No conversion needed. 4 is an int literal being assigned
        // to an int variable
        int x;
        x = 4;
        System.out.println("x = " + x);
        
        // No conversion needed. 3.14 is a double literal being assigned
        // to a double variable
        double y;
        y = 3.14;
        System.out.println("y = " + y);
        
        
        // Automatic type conversion
        y = x; // automatically convert int x to double & assign to double variable
        System.out.println("y = " + y);
        
        
        byte bValue = 3;
        short sValue = 1;
        
        // byte uses fewer bits than short. So the byte variable can "safely"
        // be coverted to a short.
        sValue = bValue; 
        
        
        // Since sort uses more bits than byte, we need to manually "cast"
        // to the short to a byte.
        bValue = (byte)sValue; // Manual "type cast"
        
        
        // Also use type casting to convert a double to an int
        y = 3.14159;
        x = (int)y; // converting doublt to int
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        
        // Assigning literal value to a float variable.
        // Need to cast the double as a float
        float fValue;
        fValue = (float)12.1;// 12.1 is a double so we need to cast it as a float
        System.out.println("fValue = " + fValue);
        
        
        // Assigning literal value to a long variable
        // 2147483650 larger than the maximum int value.
        // Add L to the end to indicate it is a literal of type long
        long longValue = 2147483650L;
    }
    
}
