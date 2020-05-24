
/**
 *
 * @author Dr. Lillis
 */
public class BitTester {
    public static void main(String[] args) {
        int x = -383934848;
        int y = 11923981;
        int answer = x >> 4;
        
        
        System.out.println(BitManipulation.toBinaryString(x));
//        System.out.println(toBinaryString(y));
        System.out.println("-".repeat(32+7));
        System.out.println(BitManipulation.toBinaryString(answer));
        
        System.out.println("-".repeat(32+7));
        x = -123;
        System.out.println(BitManipulation.toBinaryString(x));
        
        answer = BitManipulation.rotateLeft(x, 3);
        System.out.println(BitManipulation.toBinaryString(answer));

        
        
        //-------------------------------------------------------------
        System.out.println("-".repeat(32+7));
        x = -123;
        System.out.println(BitManipulation.toBinaryString(x));
        
        answer = BitManipulation.rotateRight(x, 3);
        System.out.println(BitManipulation.toBinaryString(answer));
        

        //-------------------------------------------------------------
        System.out.println("-".repeat(32+7));
        x = 123;
        System.out.println(BitManipulation.toBinaryString(x));
        
        answer = BitManipulation.setBit(x, 10);
        System.out.println(BitManipulation.toBinaryString(answer));


        //-------------------------------------------------------------
        System.out.println("-".repeat(32+7));
        x = -123;
        System.out.println(BitManipulation.toBinaryString(x));
        
        answer = BitManipulation.clearBit(x, 10);
        System.out.println(BitManipulation.toBinaryString(answer));


        //-------------------------------------------------------------
        System.out.println("-".repeat(32+7));
        x = 939387123;
        System.out.println(BitManipulation.toBinaryString(x));
        
        answer = BitManipulation.getBit(x, 11);
        System.out.println(answer);


        //-------------------------------------------------------------
        System.out.println("-".repeat(32+7));
        x = 939387123;
        System.out.println(BitManipulation.toBinaryString(x));
        
        answer = BitManipulation.toggleBit(x, 10);
        System.out.println(BitManipulation.toBinaryString(answer));


        //-------------------------------------------------------------
        System.out.println("-".repeat(32+7));
        x = 939387123;
        System.out.println(BitManipulation.toBinaryString(x));
        
        answer = BitManipulation.numberBitsSet(x);
        System.out.println(answer);



        //-------------------------------------------------------------
        System.out.println("-".repeat(32+7));
        x = 939387123;
        System.out.println(BitManipulation.toBinaryString(x));
        
        answer = BitManipulation.numberBitsCleared(x);
        System.out.println(answer);


    }
    

}
