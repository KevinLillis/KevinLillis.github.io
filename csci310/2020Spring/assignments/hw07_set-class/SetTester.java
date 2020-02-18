
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SetTester {

    static List<TestResult> tests = new ArrayList<>();
    
    static SetI<Integer> set1 = new ArrayListSet<>();
    static SetI<Integer> set2 = new ArrayListSet<>();
    static SetI<Integer> set3 = new ArrayListSet<>();
    
    static Integer[] array1;
    static Integer[] array2;
    static Integer[] array3;
    
    static List<Integer> list1;
    static List<Integer> list2;
    static List<Integer> list3;
    
    static String expected, result;
    static List<Integer> expectedElements;

    public static void main(String[] args) {
        
        testPowerSet();
        constructorTests();
        testSetOperations();
        
        TestResult.reportTestResults(tests);
    }

    static void testPowerSet(){
        set1 = set1.factory(new Integer[]{1, 2, 3});
        
        SetI<SetI<Integer>> powerSet = set1.powerSet();
        
        ArrayList<SetI<Integer>> sol = new ArrayList<>();
        // Empty set
        sol.add(new ArrayListSet<>());
        
        // Sets with one element
        sol.add(new ArrayListSet<>(new Integer[]{1}));
        sol.add(new ArrayListSet<>(new Integer[]{2}));
        sol.add(new ArrayListSet<>(new Integer[]{3}));
        
        // Sets with 2 element
        sol.add(new ArrayListSet<>(new Integer[]{1, 2}));
        sol.add(new ArrayListSet<>(new Integer[]{1, 3}));
        sol.add(new ArrayListSet<>(new Integer[]{2, 3}));

        // Sets with 3 element
        sol.add(new ArrayListSet<>(new Integer[]{1, 2, 3}));

        
        expected = "" + true;
        result = "" + (sol.size() == powerSet.card());
        tests.add(new TestResult("Power Set 1: size", expected, result));
        
        for (SetI set : sol){
            expected = "" + true;
            result = "" + powerSet.contains(set);
            tests.add(new TestResult("Power Set 2: " + set, expected, result));
        }
    }
    
    static void constructorTests(){
        SetI<Integer> set;
        
        //========================================================= Constructor ()
        set = new ArrayListSet<>();
        expected = "{}";
        result = "" + set.toString();
        tests.add(new TestResult("Constructor 1", expected, result));
        
        expected = "0";
        result = "" + set.card();
        tests.add(new TestResult("Constructor 2", expected, result));
        
        expected = "" + true;
        result = "" + set.isEmpty();
        tests.add(new TestResult("Constructor 3", expected, result));

        
        //====================================================== Constructor (E e)
        set = new ArrayListSet<>(7);
        expected = "{7}";
        result = "" + set.toString();
        tests.add(new TestResult("Constructor 4", expected, result));
        
        expected = "1";
        result = "" + set.card();
        tests.add(new TestResult("Constructor 5", expected, result));
        
        expected = "" + false;
        result = "" + set.isEmpty();
        tests.add(new TestResult("Constructor 6", expected, result));

        
        //============================================= Constructor (List<E> list)
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(13));
        set = new ArrayListSet<>(list);

        expected = "{13}";
        result = "" + set.toString();
        tests.add(new TestResult("Constructor 7", expected, result));
        
        expected = "1";
        result = "" + set.card();
        tests.add(new TestResult("Constructor 8", expected, result));
        
        expected = "" + false;
        result = "" + set.isEmpty();
        tests.add(new TestResult("Constructor 9", expected, result));
        
        
        //=============================================== Constructor (E[] array1)
        array1 = new Integer[]{1, 2, 3, 4};
        set = new ArrayListSet<>(array1);
        expectedElements = Arrays.asList(array1);

        expected = "true";
        result = "" + SetTester.sameElements(set.toList(), expectedElements);
        tests.add(new TestResult("Constructor 10", expected, result));
        
        expected = "4";
        result = "" + set.card();
        tests.add(new TestResult("Constructor 11", expected, result));
        
        expected = "" + false;
        result = "" + set.isEmpty();
        tests.add(new TestResult("Constructor 12", expected, result));
        
    }
    
    public static void testSetOperations(){
        
        //================================================================== clear
        set1.clear();
        expected = "{}";
        result = "" + set1.toString();
        tests.add(new TestResult("clear 1", expected, result));
        
        expected = "0";
        result = "" + set1.card();
        tests.add(new TestResult("clear 2", expected, result));
        
        expected = "" + true;
        result = "" + set1.isEmpty();
        tests.add(new TestResult("clear 3", expected, result));
        
        List<Integer> asList = set1.toList();
        expectedElements = new ArrayList<>();
        expected = "" + true;
        result = "" + SetTester.sameElements(asList, expectedElements);
        tests.add(new TestResult("clear 4", expected, result));

        
        //====================================================== add
        set1.clear();
        set1.add(7);
        expected = "{7}";
        result = "" + set1.toString();
        tests.add(new TestResult("add 1", expected, result));

        set1.add(7);
        expected = "{7}";
        result = "" + set1.toString();
        tests.add(new TestResult("add 2", expected, result));
        
        //============================================= contains
        set1.clear();
        set1.add(7);

        expected = "true";
        result = "" + set1.contains(7);
        tests.add(new TestResult("contains 1", expected, result));
        
        expected = "false";
        result = "" + set1.contains(12);
        tests.add(new TestResult("contains 2", expected, result));
        
        set1.clear();
        expected = "" + false;
        result = "" + set1.contains(1);
        tests.add(new TestResult("contains 3", expected, result));
        
        
        //================================================ equals
        array1 = new Integer[]{1, 2, 3, 4};
        array2 = new Integer[]{4, 2, 1, 3};

        set1 = set1.factory(array1);
        set2 = set2.factory(array2);

        expected = "true";
        result = "" + set1.equals(set2);
        tests.add(new TestResult("equals 1", expected, result));
        
        
        //================================================ toString
        set1.clear();
        expected = "{}";
        result = "" + set1.toString();
        tests.add(new TestResult("toString 1", expected, result));
        
        set1.add(12);
        expected = "{12}";
        result = "" + set1.toString();
        tests.add(new TestResult("toString 2", expected, result));
        
        set1.add(13);
        set1.add(14); // {12, 13, 14} But order doesn't matter
        String asString = set1.toString();
        expected = "true";
        result = "" + asString.startsWith("{");
        tests.add(new TestResult("toString 3", expected, result));

        expected = "true";
        result = "" + asString.endsWith("}");
        tests.add(new TestResult("toString 4", expected, result));
        
        expected = "12";
        result = "" + asString.length();
        tests.add(new TestResult("toString 5", expected, result));

        expected = "3";
        result = "" + asString.indexOf(",");
        tests.add(new TestResult("toString 6", expected, result));

        expected = "7";
        result = "" + asString.lastIndexOf(",");
        tests.add(new TestResult("toString 7", expected, result));
        
        //================================================ clone
        array1 = new Integer[] {1, 2, 3, 4};
        set1 = set1.factory(array1);
        
        set2 = (SetI<Integer>)set1.clone();

        expected = "true";
        result = "" + SetTester.sameElements(set1.toList(), set2.toList());
        tests.add(new TestResult("clone 1", expected, result));
        
        expected = "true";
        result = "" + (set1.card() == set2.card());
        tests.add(new TestResult("clone 2", expected, result));
        
        //================================================ toArray
        array1 = new Integer[] {2, 4, 6, 8, 10};
        set1 = set1.factory(array1);
        
        list1 = Arrays.asList(array1);
        array2 = set1.toArray(array2);
        expected = "true";
        result = "" + sameElements(array1, array2);
        tests.add(new TestResult("toArray 1", expected, result));
        
        //================================================ discard
        array1 = new Integer[]{1, 2, 3, 4};
        set1 = set1.factory(array1);
        
        set1.discard(1);
        expected = "" + 3;
        result = "" + set1.card();
        tests.add(new TestResult("discard 1", expected, result));
        
        expected = "" + true;
        result = "" + (set1.contains(2) && set1.contains(3) && set1.contains(4));
        tests.add(new TestResult("discard 2", expected, result));
        
        set1.discard(7);
        expected = "" + 3;
        result = "" + set1.card();
        tests.add(new TestResult("discard 3", expected, result));
        
        expected = "" + true;
        result = "" + (set1.contains(2) && set1.contains(3) && set1.contains(4));
        tests.add(new TestResult("discard 4", expected, result));

        //================================================ pop
        array1 = new Integer[]{1, 2, 3, 4};
        list1 = Arrays.asList(array1);
        set1 = set1.factory(array1);

        list2 = new ArrayList<>();
        while(!set1.isEmpty()){
            list2.add(set1.pop());
        }
        
        expected = "" + true;
        result = "" + set1.isEmpty();
        tests.add(new TestResult("pop 1", expected, result));
        
        expected = "" + true;
        result = "" + SetTester.sameElements(list1, list2);
        tests.add(new TestResult("pop 2", expected, result));
        
        set1.clear();
        expected = "Exception thrown";
        try{
            set1.pop();
            result = "Exception not thrown";
            tests.add(new TestResult("pop 3a", expected, result));
        } catch (EmptySetException e){
            result = "Exception thrown";
            tests.add(new TestResult("pop 3b", expected, result));            
        }        
        
        //================================================ intersection
        array1 = new Integer[]{1, 2, 3, 4};
        array2 = new Integer[]{3, 4, 5, 6};
        
        list1 = Arrays.asList(array1);
        list2 = Arrays.asList(array2);

        set1 = set1.factory(array1);
        set2 = set2.factory(array2);

        set3 = set1.intersection(set2);
        list3 = new ArrayList<>(Arrays.asList(3, 4)); // Expected elements
        expected = "" + true;
        result = "" + SetTester.sameElements(list3, set3.toList());
        tests.add(new TestResult("intersection 1", expected, result));        
        

        set3 = set1.intersection(set1);
        expected = "" + true;
        result = "" + SetTester.sameElements(list1, set3.toList());
        tests.add(new TestResult("intersection 2", expected, result));    
        
        set2.clear();
        set3 = set1.intersection(set2);
        expected = "" + true;
        result = "" + set3.isEmpty();
        tests.add(new TestResult("intersection 3", expected, result));    

        set3 = set2.intersection(set1);
        expected = "" + true;
        result = "" + set3.isEmpty();
        tests.add(new TestResult("intersection 4", expected, result));    


        //================================================ union
        array1 = new Integer[]{1, 2, 3, 4};
        array2 = new Integer[]{3, 4, 5, 6};
        
        list1 = Arrays.asList(array1);
        list2 = Arrays.asList(array2);

        set1 = set1.factory(array1);
        set2 = set2.factory(array2);

        set3 = set1.union(set2);
        list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)); // expected elements
        expected = "" + true;
        result = "" + SetTester.sameElements(list3, set3.toList());
        tests.add(new TestResult("union 1", expected, result));        
        

        set3 = set1.union(set1);
        expected = "" + true;
        result = "" + SetTester.sameElements(list1, set3.toList());
        tests.add(new TestResult("union 2", expected, result));    
        
        set2.clear();
        set3 = set1.union(set2);
        expected = "" + true;
        result = "" + SetTester.sameElements(list1, set1.toList());;
        tests.add(new TestResult("union 3", expected, result));    

        set3 = set2.union(set1);
        expected = "" + true;
        result = "" + SetTester.sameElements(list1, set1.toList());;
        tests.add(new TestResult("union 4", expected, result));    

        //================================================ difference
        array1 = new Integer[]{1, 2, 3, 4};
        array2 = new Integer[]{3, 4, 5, 6};
        
        list1 = Arrays.asList(array1);
        list2 = Arrays.asList(array2);

        set1 = set1.factory(array1);
        set2 = set2.factory(array2);
        set3 = set1.difference(set2);

        list3 = new ArrayList<>(Arrays.asList(1, 2)); // expected elements
        expected = "" + true;
        result = "" + SetTester.sameElements(list3, set3.toList());
        tests.add(new TestResult("difference 1", expected, result));        

        set3 = set1.difference(set1);
        expected = "" + true;
        result = "" + set3.isEmpty();
        tests.add(new TestResult("difference 2", expected, result));    
        
        set2.clear();
        set3 = set1.difference(set2);
        expected = "" + true;
        result = "" + SetTester.sameElements(list1, set1.toList());
        tests.add(new TestResult("difference 3", expected, result));    

        set3 = set2.difference(set1);
        expected = "" + true;
        result = "" + set3.isEmpty();
        tests.add(new TestResult("difference 4", expected, result));           
        
        
        //================================================ symmetric difference
        set1 = set1.factory(new Integer[]{1, 2, 3, 4      });
        set2 = set2.factory(new Integer[]{      3, 4, 5, 6});
        
        set3 = set1.symmetricDifference(set2);
        list3 = new ArrayList<>(Arrays.asList(1, 2, 5, 6)); // expected elements
        expected = "" + true;
        result = "" + SetTester.sameElements(list3, set3.toList());
        tests.add(new TestResult("symmetric difference 1", expected, result));  

        set3 = set1.symmetricDifference(set1);
        expected = "" + true;
        result = "" + set3.isEmpty();
        tests.add(new TestResult("symmetric difference 2", expected, result));    
        
        set2.clear();
        set3 = set1.symmetricDifference(set2);
        expected = "" + true;
        result = "" + SetTester.sameElements(list1, set1.toList());
        tests.add(new TestResult("symmetric difference 3", expected, result));    

        set3 = set2.symmetricDifference(set1);
        expected = "" + true;
        result = "" + SetTester.sameElements(list1, set3.toList());
        tests.add(new TestResult("symmetric difference 4", expected, result));
   
        //================================================ isDisjoint
        set1 = set1.factory(new Integer[]{1, 2, 3, 4            });
        set2 = set2.factory(new Integer[]{      3, 4, 5, 6      });
        set3 = set3.factory(new Integer[]{            5, 6, 7, 8});


        
        expected = "" + false;
        result = "" + set1.isDisjoint(set2);
        tests.add(new TestResult("isDisjoint 1", expected, result));  

        expected = "" + true;
        result = "" + set1.isDisjoint(set3);
        tests.add(new TestResult("isDisjoint 2", expected, result));  

        set3.clear();
        expected = "" + true;
        result = "" + set1.isDisjoint(set3);
        tests.add(new TestResult("isDisjoint 3", expected, result));  

        set1.clear();
        expected = "" + true;
        result = "" + set1.isDisjoint(set3);
        tests.add(new TestResult("isDisjoint 4", expected, result));  



        //================= isSubset, isProperSubset, isSuperset, isProperSuperset
        set1 = set1.factory(new Integer[]{1, 2, 3, 4});
        set2 = set2.factory(new Integer[]{1, 2, 3, 4});
        
        
        expected = "" + true;
        result = "" + set1.isSubset(set2);
        tests.add(new TestResult("isSubset 1", expected, result));  

        expected = "" + false;
        result = "" + set1.isProperSubset(set2);
        tests.add(new TestResult("isProperSubset 1", expected, result));  

        expected = "" + true;
        result = "" + set1.isSuperset(set2);
        tests.add(new TestResult("isSuperset 1", expected, result));  

        expected = "" + false;
        result = "" + set1.isProperSuperset(set2);
        tests.add(new TestResult("isProperSuperset 1", expected, result));  

        // ---------------------------------
        set1 = set1.factory(new Integer[]{1, 2, 3, 4, 5});
        set2 = set2.factory(new Integer[]{1, 2, 3, 4});


        expected = "" + false;
        result = "" + set1.isSubset(set2);
        tests.add(new TestResult("isSubset 2", expected, result));  

        expected = "" + false;
        result = "" + set1.isProperSubset(set2);
        tests.add(new TestResult("isProperSubset 2", expected, result));  

        expected = "" + true;
        result = "" + set1.isSuperset(set2);
        tests.add(new TestResult("isSuperset 2", expected, result));  

        expected = "" + true;
        result = "" + set1.isProperSuperset(set2);
        tests.add(new TestResult("isProperSuperset 2", expected, result));  
        
        // ---------------------------------
        set1 = set1.factory(new Integer[]{1, 2, 3, 4});
        set2 = set2.factory(new Integer[]{1, 2, 3, 4, 5});
        expected = "" + true;
        result = "" + set1.isSubset(set2);
        tests.add(new TestResult("isSubset 3", expected, result));  

        expected = "" + true;
        result = "" + set1.isProperSubset(set2);
        tests.add(new TestResult("isProperSubset 3", expected, result));  

        expected = "" + false;
        result = "" + set1.isSuperset(set2);
        tests.add(new TestResult("isSuperset 3", expected, result));  

        expected = "" + false;
        result = "" + set1.isProperSuperset(set2);
        tests.add(new TestResult("isProperSuperset 3", expected, result));          

        // ---------------------------------
        set1 = set1.factory(new Integer[]{});
        set2 = set2.factory(new Integer[]{1, 2, 3, 4});
        
        expected = "" + true;
        result = "" + set1.isSubset(set2);
        tests.add(new TestResult("isSubset 4", expected, result));  

        expected = "" + true;
        result = "" + set1.isProperSubset(set2);
        tests.add(new TestResult("isProperSubset 4", expected, result));  

        expected = "" + false;
        result = "" + set1.isSuperset(set2);
        tests.add(new TestResult("isSuperset 4", expected, result));  

        expected = "" + false;
        result = "" + set1.isProperSuperset(set2);
        tests.add(new TestResult("isProperSuperset 4", expected, result));          

        // ---------------------------------
        set1 = set1.factory(new Integer[]{1, 2, 3, 4});
        set2 = set2.factory(new Integer[]{});
        
        expected = "" + false;
        result = "" + set1.isSubset(set2);
        tests.add(new TestResult("isSubset 5", expected, result));  

        expected = "" + false;
        result = "" + set1.isProperSubset(set2);
        tests.add(new TestResult("isProperSubset 5", expected, result));  

        expected = "" + true;
        result = "" + set1.isSuperset(set2);
        tests.add(new TestResult("isSuperset 5", expected, result));  

        expected = "" + true;
        result = "" + set1.isProperSuperset(set2);
        tests.add(new TestResult("isProperSuperset 5", expected, result));  

        // ---------------------------------
        set1 = set1.factory(new Integer[]{});
        set2 = set2.factory(new Integer[]{});
        
        expected = "" + true;
        result = "" + set1.isSubset(set2);
        tests.add(new TestResult("isSubset 6", expected, result));  

        expected = "" + false;
        result = "" + set1.isProperSubset(set2);
        tests.add(new TestResult("isProperSubset 6", expected, result));  

        expected = "" + true;
        result = "" + set1.isSuperset(set2);
        tests.add(new TestResult("isSuperset 6", expected, result));  

        expected = "" + false;
        result = "" + set1.isProperSuperset(set2);
        tests.add(new TestResult("isProperSuperset 6", expected, result));          
    }    

    
    
    static boolean sameElements(List<Integer> L1, List<Integer> L2){
        for(Integer i : L1) {
            if(!L2.contains(i)){
                return false;
            }
        }
        
        for(Integer i : L2){
            if(!L1.contains(i)){
                return false;
            }
        }
        
        return true;
    }

    static boolean sameElements(Integer[] array1, Integer[] array2){
        List<Integer> list1 = Arrays.asList(array1);
        List<Integer> list2 = Arrays.asList(array2);
        return SetTester.sameElements(list1, list2);
    }

}


/* Holds results of a single result */
class TestResult {

    private final String message;
    private final String expected;
    private final String received;

    public TestResult(String message, String expected, String received) {
        this.message = message;
        this.expected = expected;
        this.received = received;
    }

    private boolean passed() {
        return expected.equals(received);
    }

    public static void reportTestResults(List<TestResult> testResults) {
        System.out.println("Results of " + testResults.size() + " tests:");
        boolean errorsFound = false;
        for (TestResult result : testResults) {
            if (!result.passed()) {
                System.out.println("Error: " + result.message);
                System.out.println("\tExpected: \"" + result.expected + "\"");
                System.out.println("\tReceived: \"" + result.received + "\"");
                errorsFound = true;
            }
        }

        if (!errorsFound) {
            System.out.println("No Errors Found.");
        }
    }
} // End of class TestResult
