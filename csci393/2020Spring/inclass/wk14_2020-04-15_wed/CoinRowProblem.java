
import java.util.ArrayList;
import java.util.Collections;

public class CoinRowProblem {

    public static void main(String[] args) {
        // n coins, indexed from 1 to n.
        // position zero is not used.
        int[] C;
        C = new int[]{0, 5, 1, 2, 10, 6, 2}; // Example from Class
        //C = new int[]{0, 1, 10, 8, 9, 20, 10, 4};
        //C = new int[]{0, 1, 20, 5, 10};
//        C = new int[]{0, 10, 1, 2, 3, 11};// use first and last
        //C = new int[]{0, 10, 1, 12, 3};// use first but not last
        //C = new int[]{0, 1, 2, 4, 30};// use last but not first
        //C = new int[]{0, 1, 20, 3, 40, 2};// use neither first nor last
        //C = new int[]{0, 7};

        int n = C.length - 1; // number of coins, C[0] not used
        int[] F = new int[C.length];

        // was coin i used during step i
        boolean[] usedCoin = new boolean[C.length]; // all initialized to false

        int[] cameFrom = new int[C.length]; // Which previous step was used
        F[0] = 0;
        F[1] = C[1];
        if(n == 1){
            usedCoin[1] = true;
        }

        // Compute value of max solution and record how the solution 
        // was obtained.
        for (int i = 2; i <= n; i++) {
            if (C[i] + F[i - 2] > F[i - 1]) {
                F[i] = C[i] + F[i - 2];
                usedCoin[i] = true;
                cameFrom[i] = i - 2;
            } else {
                F[i] = F[i - 1];
                usedCoin[i] = false;
                if(i == 2){
                    usedCoin[1] = true; // because i is never equal to 1
                }
                cameFrom[i] = i - 1;
            }
        }

        System.out.println("-----------");
        String h = "%1s %5s %2s %4s %4s %n";
        String s = "%d) %3d %4d %4d  %-1b %n";
        System.out.printf(h, "i", "C[i]", "F[i]", "From", "Used");
        for(int i = 0; i < C.length; i++){
            System.out.printf(s, i, C[i] ,F[i], cameFrom[i], usedCoin[i]);
        }
        System.out.println("-----------");
        
        // Recover the solution
        ArrayList<String> solution = new ArrayList<>();
        int i = n;
        while (i > 0) {
            if (usedCoin[i]) {
                solution.add("c" + i + "(" + C[i] + ")");
            }
            i = cameFrom[i];
        }

        Collections.reverse(solution);
        // Display results
        System.out.println("Max value is " + F[n]);
        System.out.println();

        System.out.println("Coins used:");
        System.out.println(solution);

    }

}
