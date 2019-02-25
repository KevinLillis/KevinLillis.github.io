
import java.util.ArrayList;


public class HWGrader {
    private static ArrayList<String> balanced;
    private static ArrayList<String> unBalanced;
    private static ArrayList<String> strangeBalanced;
    private static ArrayList<String> strangeUnbalanced;
    
    private static int testCount = 0;
    private static int errorCount = 0;
    
    public static void main(String[] args){
        balanced = getBalancedStrings();
        unBalanced = getUnbalancedStrings();
        strangeBalanced = getStrangeBalancedStrings();
        strangeUnbalanced = getStrangeUnbalancedStrings();

        runTests_A();
        runTests_B();
        runTests_C();
        
        System.out.println(testCount + " tests run");
        
        if(errorCount == 0){
            System.out.println("No Errors Found");
        } else {
            System.out.println(errorCount + " Error(s) Found");
        }

    }
    
    private static void runTests_A(){
        BalanceChecker balCheck = new BalanceChecker();
        balCheck.addPair('(', ')');
        balCheck.addPair('{', '}');
        balCheck.addPair('<', '>');
        balCheck.addPair('[', ']');
        
        
        for(String s : balanced){
            testCount++;
            if(!balCheck.isBalanced(s)){
                errorCount++;
                System.out.println("A1: String: " + s);
                System.out.println("   Is balanced. Reported as unbalanced.");
            }
        }
        
        for(String s : unBalanced){
            testCount++;
            if(balCheck.isBalanced(s)){
                errorCount++;
                System.out.println("A2: String: " + s);
                System.out.println("   Is unbalanced. Reported as balanced.");
            }
        }        
    }
    
    private static void runTests_B(){
        // All should be balanced since no pairs are added
        BalanceChecker balCheck = new BalanceChecker();
        
        for(String s : balanced){
            testCount++;
            if(!balCheck.isBalanced(s)){
                errorCount++;
                System.out.println("B1: String: " + s);
                System.out.println("   Is balanced. Reported as unbalanced.");
            }
        }
        
        for(String s : unBalanced){
            testCount++;
            if(!balCheck.isBalanced(s)){
                errorCount++;
                System.out.println("B2: String: " + s);
                System.out.println("   Is balanced. Reported as unbalanced.");
            }
        }        
    }

    private static void runTests_C(){
        BalanceChecker balCheck = new BalanceChecker();
        balCheck.addPair('#', '$');
        balCheck.addPair('a', 'A');        
        
        for(String s : strangeBalanced){
            testCount++;
            if(!balCheck.isBalanced(s)){
                errorCount++;
                System.out.println("C1: String: " + s);
                System.out.println("   Is balanced. Reported as unbalanced.");
            }
        }
        
        for(String s : strangeUnbalanced){
            testCount++;
            if(balCheck.isBalanced(s)){
                errorCount++;
                System.out.println("C2: String: " + s);
                System.out.println("   Is unbalanced. Reported as balanced.");
            }
        }        
    }
    
    private static ArrayList<String> getBalancedStrings(){
        ArrayList<String> list = new ArrayList<>();
        list.add("((()))");
        list.add("{{{}}}");
        list.add("<<<>>>");
        list.add("[[[]]]");
        list.add("St. Ambrose");
        list.add("(St.) {A<m[bro]s>e}");
        
        return list;
    }

    private static ArrayList<String> getUnbalancedStrings(){
        ArrayList<String> list = new ArrayList<>();
        list.add("(()))");
        list.add("{{{}}");
        list.add(">>><<<");
        list.add("]]");
        list.add("]St.[ Ambrose");
        list.add("{St.) {A<m[bro]s>e}");
        list.add("(St.) {A<mbro]s>e}");
        list.add("(St.) {A<m[bros>e}");
        list.add("(St.) {A<m[bro]s>e");
        list.add("{]");
        
        return list;
    }
    
    private static ArrayList<String> getStrangeBalancedStrings(){
        // These are balanced with the pairs (#,$), and (a,A)
        ArrayList<String> list = new ArrayList<>();
        list.add("##school$$");
        list.add("#$#$#$");
        list.add("Saint Ambrose");
        list.add("(()))");
        list.add("{{{}}");
        list.add(">>><<<");
        list.add("]]");
        
        return list;
    }

    private static ArrayList<String> getStrangeUnbalancedStrings(){
        // These are unbalanced with the pairs (#,$), and (a,A)
        ArrayList<String> list = new ArrayList<>();
        list.add("#school$$");
        list.add("#$##$");
        list.add("SAINT AMBROSE");
        list.add("(((#)))");
        list.add("$26.50");
        list.add("You're # 1!");
        
        return list;
    }

}
