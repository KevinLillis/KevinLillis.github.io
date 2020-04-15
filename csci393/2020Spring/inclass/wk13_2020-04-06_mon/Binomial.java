/**
 *
 * @author Dr. Lillis
 */
/*
     n choose k    =  bin(n, k)          Fact       Rec     Dynamic 
    10 choose 5    =    252              good      good       good
    20 choose 10   =  184,756             11       good       good
    40 choose 20   = 137,846,528,820   div/zero   too long    good

    80 choose 40   = 107,507,208,733,336,176,461,620
                                       div/zero      N/A     Large neg
*/
public class Binomial {
    public static void main(String[] args) {
        int n = 10;
        int k = 5;
        
        System.out.println(n + " choose " + k);
        System.out.printf("Factorials  : %,d%n", binomialFact(n, k));
        System.out.printf("Recursive   : %,d%n", binomialRec(n, k));
        System.out.printf("Dynamic     : %,d%n", binomialDynamic(n, k));
    }

    // Using Factorials
    static int binomialFact(int n, int k){
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
    
    static int factorial(int x){
        int answer = 1;
        for(int y = x; y > 0; y--)
            answer *= y;
        return answer;
    }    
    
    // Using Recursion
    static int binomialRec(int n, int k){
        if(k == 0 || n == k){
            return 1;
        }
        
        return binomialRec(n-1, k-1) + binomialRec(n-1, k);
    }

    // Using Dynamic Programming
    static long binomialDynamic(int N, int K){
        long[][] tri = new long[N+1][]; // n rows
        tri[0] = new long[1];
        tri[0][0] = 1;
        for(int n = 1; n <= N; n++){
            tri[n] = new long[n+1];
            for(int k = 0; k < tri[n].length; k++){
                if(k==0 || k == tri[n].length - 1){
                    tri[n][k] = 1;
                } else {
                    tri[n][k] = tri[n-1][k-1] + tri[n-1][k];
                }
            }
        }
        
        return tri[N][K];
    }
    
}
