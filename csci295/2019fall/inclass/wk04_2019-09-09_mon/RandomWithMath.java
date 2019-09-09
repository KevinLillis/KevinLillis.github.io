import java.util.Random;

/**
 *
 * @author kevin
 */
public class RandomWithMath {
    public static void main(String[] args) {
        /* Generate randome numbers using Math */
        // 0.0 <= rand < 1.0
        double rand = Math.random();
        // System.out.println("Math.random gave: " + rand);
        
        /* Generate random numbers using Random */
        Random gen = new Random(); // gen stands for "generator"

        // random integer that has ass 2^32 different bit permutations
        int x = gen.nextInt();
                
        // to get a random number from 1 to 10
        int roll = gen.nextInt(10); // 0 <= roll < 10
        roll += 1; // now 1 <= roll < 11, same as 1 <= roll <= 10
        
        // For the next two line, number are from 0.0 to 1.0 (like Math)
        float fValue = gen.nextFloat();
        double dVale = gen.nextDouble();
        
        // Returs true/false with equal probability
        boolean boolValue = gen.nextBoolean();
        
        // Doesn't give all possilbe long valus, only 42 bit numbers
        long lValue = gen.nextLong();
        
        //gen.setSeed(1985);
        System.out.println(gen.nextInt());
        System.out.println(gen.nextInt());
        System.out.println(gen.nextInt());
        System.out.println(gen.nextInt());
        System.out.println(gen.nextInt());
        
    }
}
