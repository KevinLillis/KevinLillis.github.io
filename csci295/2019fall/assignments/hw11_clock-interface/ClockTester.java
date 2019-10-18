

import java.util.ArrayList;



public class ClockTester {
    static ArrayList<TestResult> tests;

    private static String expected, result;
    
    public static void main(String[] args) {
        
        // Test Clock_1
        System.out.println("=================================================");
        System.out.println("Testing Clock_1");
        tests = new ArrayList<>();        
        clock_1ConstructorTests();
        runTests(new Clock_1());
        TestResult.reportTestResults(tests);
        
        // Test Clock_2
        System.out.println("=================================================");
        System.out.println("Testing Clock_2");
        tests = new ArrayList<>();        
        clock_2ConstructorTests();
        runTests(new Clock_2());
        TestResult.reportTestResults(tests);
    }

    public static void runTests(Clock c){
        c.setTime(1, 2, 3);
        expected = "1:2:3";
        result = c.toString();
        tests.add(new TestResult("Test 1", expected, result));
        
        c.setHour(11);
        expected = "11:2:3";
        result = c.toString();
        tests.add(new TestResult("Test 2", expected, result));

        c.setMinute(12);
        expected = "11:12:3";
        result = c.toString();
        tests.add(new TestResult("Test 3", expected, result));

        c.setSecond(13);
        expected = "11:12:13";
        result = c.toString();
        tests.add(new TestResult("Test 4", expected, result));
        
        c.reset();
        expected = "0:0:0";
        result = c.toString();
        tests.add(new TestResult("Test 5", expected, result));
        
        c.setTime(21, 22, 23);
        expected = "21:22:23";
        result = c.toString();
        tests.add(new TestResult("Test 6", expected, result));
        
        expected = "" + 21;
        result = "" + c.getHour();
        tests.add(new TestResult("Test 7", expected, result));

        expected = "" + 22;
        result = "" + c.getMinute();
        tests.add(new TestResult("Test 8", expected, result));

        expected = "" + 23;
        result = "" + c.getSecond();
        tests.add(new TestResult("Test 9", expected, result));

    }
    
    public static void clock_1ConstructorTests(){
        Clock c;
        
        c = new Clock_1();
        expected = "0:0:0";
        result = c.toString();
        tests.add(new TestResult("Constructor 1", expected, result));
        
        c = new Clock_1(10);
        expected = "10:0:0";
        result = c.toString();
        tests.add(new TestResult("Constructor 2", expected, result));

        c = new Clock_1(10, 11);
        expected = "10:11:0";
        result = c.toString();
        tests.add(new TestResult("Constructor 3", expected, result));

        c = new Clock_1(10, 11, 12);
        expected = "10:11:12";
        result = c.toString();
        tests.add(new TestResult("Constructor 4", expected, result));
    }

    public static void clock_2ConstructorTests(){
        Clock c;
        
        c = new Clock_2();
        expected = "0:0:0";
        result = c.toString();
        tests.add(new TestResult("Constructor 1", expected, result));
        
        c = new Clock_2(10);
        expected = "10:0:0";
        result = c.toString();
        tests.add(new TestResult("Constructor 2", expected, result));

        c = new Clock_2(10, 11);
        expected = "10:11:0";
        result = c.toString();
        tests.add(new TestResult("Constructor 3", expected, result));

        c = new Clock_2(10, 11, 12);
        expected = "10:11:12";
        result = c.toString();
        tests.add(new TestResult("Constructor 4", expected, result));
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
        
    public static void reportTestResults(ArrayList<TestResult> testResults) {
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
        
        if(!errorsFound){
            System.out.println("No Errors Found.");
        }
    }    
} // End of class TestResult