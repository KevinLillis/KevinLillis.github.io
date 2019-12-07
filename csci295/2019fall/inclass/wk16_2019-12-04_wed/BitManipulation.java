/**
 *
 * @author Dr. Lillis
 */
public class BitManipulation {
    // High bit iS 0, all others are 1
    public static final int MASK_HIGH_0 = 0b01111111111111111111111111111111;
    
    // High bit iS 1, all others are 0
    public static final int MASK_HIGH_1 = 0b10000000000000000000000000000000;

    // Low bit iS 0, all others are 1
    public static final int MASK_LOW_0 = 0b11111111111111111111111111111110;
    
    // Low bit iS 1, all others are 0
    public static final int MASK_LOW_1 = 0b00000000000000000000000000000001;
    
    // All bits are 0
    public static final int MASK_ZEROS = 0b00000000000000000000000000000000;
    
    // All bits are 1
    public static final int MASK_ONES = 0b11111111111111111111111111111111;

    
    public static String toBinaryString(int x){
        String s = "";
        
        // Outer loop goes 8 tiems, once for each group of 4 bits
        for(int i = 0; i < 8; i++){
            
            // Inner loop goes four times, once for each bit in the group.
            for(int j = 0; j < 4; j++){
                s = (x & MASK_LOW_1) + s; // Isolate low bit
                x = x >>> 1; // Shift x by 1 position
            }
            
            // Add space to front, but not the last time when i == 7
            if(i < 7){
                s = " " + s;
            }
        }
        
        return s;
    }
    
    /**
     * Returns the value of x after it has been rotated left n positions.
     */
    public static int rotateLeft(int x, int n){
        int highBit;
        
        for(int i = 0; i < n; i++){
            // Loop body rotates left one position
            highBit = x < 0 ? 1 : 0; // high bit is 1 if x is neg, it's 0 if x is pos
            x = x << 1;
            
            if(highBit == 0){
                // Clear low bit of x to 0
                x = x & MASK_LOW_0;
            } else {
                // Set low bit of x to 1
                x = x | MASK_LOW_1;
            }
        }
        
        return x;
    }
    
    /**
     * Returns the value of x after it has been rotated right n positions.
     */
    public static int rotateRight(int x, int n){
        int lowBit;
        
        for (int i = 0; i < n;i++){
            // Loop body rotates right one position
            lowBit = x & MASK_LOW_1;
            x = x >>> 1;
            
            if(lowBit == 0){
                // Clear the high bit to zero
                x = x & MASK_HIGH_0;
            } else {
                // Set the high bit to one
                x = x | MASK_HIGH_1;
            }
            
        }
        return x;
    }
    
    /**
     * Returns the value of x after the bit at position pos has been set to 1.
     */
    public static int setBit(int x, int pos){
        int mask = rotateLeft(MASK_LOW_1, pos);
        return x | mask;
    }

    /**
     * Returns the value of x after the bit at position pos has been cleared to 0.
     */
    public static int clearBit(int x, int pos){
        int mask = rotateLeft(MASK_LOW_0, pos);
        return x & mask;
    }

    public static int getBit(int x, int pos){
        x = x >>> pos;
        return x & MASK_LOW_1;
    }
    
    public static int toggleBit(int x, int pos){
        int b = getBit(x, pos);
        
        if(b == 1){
            // clear bit pos to 0
            x = clearBit(x, pos);
        } else {
            // set bit pos to 1
            x = setBit(x, pos);
        }
        return x;
    }
    
    public static int numberBitsSet(int x){
        int count = 0;
        for(int i = 0; i < 32; i++){
            count += x & MASK_LOW_1;
            x = x >>> 1;
        }
        return count;
    }


    public static int numberBitsCleared(int x){
        int count = 32;
        for(int i = 0; i < 32; i++){
            count -= x & MASK_LOW_1;
            x = x >>> 1;
        }
        return count;
    }

}
