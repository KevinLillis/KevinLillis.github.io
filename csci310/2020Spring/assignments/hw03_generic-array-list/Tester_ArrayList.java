import java.util.ArrayList;

public class Tester_ArrayList {
    public static void main(String[] args) {
        
        ArrayList<TestResultPart_1> tests;
        
        System.out.println("\n------------------------------");
        System.out.println("Testing Interface Methods with MyArrayList Object");
        tests = new ArrayList<>();
        runCommonTests(tests, new MyArrayList());        
        TestResultPart_1.reportTestResultPart_1s(tests);
        
        
        System.out.println("\n------------------------------");
        System.out.println("Testing Interface Methods with MyArrayListOp Object");
        tests = new ArrayList<>();
        runCommonTests(tests, new MyArrayListOp());        
        TestResultPart_1.reportTestResultPart_1s(tests);

        System.out.println("\n------------------------------");
        System.out.println("Testing Unique Array-Base Methods with MyArrayList Object");
        tests = new ArrayList<>();
        runMyArrayListTests(tests, new MyArrayList());        
        TestResultPart_1.reportTestResultPart_1s(tests);
    
    
        System.out.println("\n------------------------------");
        System.out.println("Testing Unique Array-Base Methods with MyArrayListOp Object");
        tests = new ArrayList<>();
        runMyArrayListTests(tests, new MyArrayListOp());        
        TestResultPart_1.reportTestResultPart_1s(tests);
        
        
        System.out.println("\n------------------------------");
        System.out.println("Testing All Constructors");
        tests = new ArrayList<>();
        runConstructorTests(tests);        
        TestResultPart_1.reportTestResultPart_1s(tests);
    }

    /*
     * Test all methods specified in the MyList Interface.
     */
    public static void runCommonTests(ArrayList<TestResultPart_1> tests, MyList<String> list){
        
        // Run the tests on MyArrayList
        runInitializeTests(tests, list);
        runAddTests(tests, list);        
        runClearTests(tests, list);        
        runContainsTests(tests, list);
        runFirstIndexOfTests(tests, list);
        runGetTests(tests, list);   
        runIsEmptyTests(tests, list);
        runLastIndexOfTests(tests, list);
        runRemoveTests(tests, list);
        runSetTests(tests, list);
        runExceptionTests(tests, list);
    
    }
    
    public static void runConstructorTests(ArrayList<TestResultPart_1> tests){
        MyList<String> list;
        MyArrayList aList;
        String[] strArr0 = {};
        String[] strArr1 = {"a"};
        String[] strArr2 = {"a", "b"};
        String[] strArr3 = {"a", "b", "c"};

        // Constructing MyArrayList
        list = new MyArrayList<>();
        tests.add(new TestResultPart_1("Constructor part 1", "[]", list.toString()));
        tests.add(new TestResultPart_1("Constructor part 2", "0", "" + (list.size())));
        aList = (MyArrayList)list;
        tests.add(new TestResultPart_1("Constructor part 3", "true", "" + (aList.capacity() == MyArrayList.INITIAL_CAPACITY)));
        
        list = new MyArrayList<>(strArr0);
        tests.add(new TestResultPart_1("Constructor part 4", "[]", list.toString()));
        tests.add(new TestResultPart_1("Constructor part 5", "0", "" + (list.size())));
        aList = (MyArrayList)list;
        tests.add(new TestResultPart_1("Constructor part 6", "true", "" + (aList.capacity() == MyArrayList.INITIAL_CAPACITY)));
        
        list = new MyArrayList<>(strArr1);
        tests.add(new TestResultPart_1("Constructor part 7", "[a]", list.toString()));
        tests.add(new TestResultPart_1("Constructor part 8", "1", "" + (list.size())));
        aList = (MyArrayList)list;
        tests.add(new TestResultPart_1("Constructor part 9", "true", "" + (aList.capacity() == aList.size())));

        list = new MyArrayList<>(strArr2);
        tests.add(new TestResultPart_1("Constructor part 10", "[a, b]", list.toString()));
        tests.add(new TestResultPart_1("Constructor part 11", "2", "" + (list.size())));
        aList = (MyArrayList)list;
        tests.add(new TestResultPart_1("Constructor part 12", "true", "" + (aList.capacity() == aList.size())));

        list = new MyArrayList<>(strArr3);
        tests.add(new TestResultPart_1("Constructor part 13", "[a, b, c]", list.toString()));
        tests.add(new TestResultPart_1("Constructor part 14", "3", "" + (list.size())));
        aList = (MyArrayList)list;
        tests.add(new TestResultPart_1("Constructor part 15", "true", "" + (aList.capacity() == aList.size())));
    
        // Constructing MyArrayListOp
        list = new MyArrayListOp<>();
        tests.add(new TestResultPart_1("Constructor part 36", "[]", list.toString()));
        tests.add(new TestResultPart_1("Constructor part 37", "0", "" + (list.size())));
        aList = (MyArrayListOp)list;
        tests.add(new TestResultPart_1("Constructor part 38", "true", "" + (aList.capacity() == MyArrayList.INITIAL_CAPACITY)));
        
        list = new MyArrayListOp<>(strArr0);
        tests.add(new TestResultPart_1("Constructor part 39", "[]", list.toString()));
        tests.add(new TestResultPart_1("Constructor part 40", "0", "" + (list.size())));
        aList = (MyArrayListOp)list;
        tests.add(new TestResultPart_1("Constructor part 41", "true", "" + (aList.capacity() == MyArrayList.INITIAL_CAPACITY)));
        
        list = new MyArrayListOp<>(strArr1);
        tests.add(new TestResultPart_1("Constructor part 42", "[a]", list.toString()));
        tests.add(new TestResultPart_1("Constructor part 43", "1", "" + (list.size())));
        aList = (MyArrayListOp)list;
        tests.add(new TestResultPart_1("Constructor part 44", "true", "" + (aList.capacity() == aList.size())));

        list = new MyArrayListOp<>(strArr2);
        tests.add(new TestResultPart_1("Constructor part 45", "[a, b]", list.toString()));
        tests.add(new TestResultPart_1("Constructor part 46", "2", "" + (list.size())));
        aList = (MyArrayListOp)list;
        tests.add(new TestResultPart_1("Constructor part 47", "true", "" + (aList.capacity() == aList.size())));

        list = new MyArrayListOp<>(strArr3);
        tests.add(new TestResultPart_1("Constructor part 48", "[a, b, c]", list.toString()));
        tests.add(new TestResultPart_1("Constructor part 49", "3", "" + (list.size())));
        aList = (MyArrayListOp)list;
        tests.add(new TestResultPart_1("Constructor part 50", "true", "" + (aList.capacity() == aList.size())));

    }
    
    /*
     * Tests those methods that are unique to the MyArrayList class.
     */
    public static void runMyArrayListTests(ArrayList<TestResultPart_1> tests, MyArrayList<String> list){
        int initialCap = list.capacity();
        list.clear();
        tests.add(new TestResultPart_1("ArrayList Unique part 1", "true", "" + (list.capacity() > 0)));
        
        for(int i = 0; i < initialCap; i++){
            list.add("" + i);
        }
        tests.add(new TestResultPart_1("ArrayList Unique part 2", "true", "" + (list.capacity() == list.size())));
        
        list.ensureCapacity(initialCap + 2);
        list.add("a");
        list.add("b");
        tests.add(new TestResultPart_1("ArrayList Unique part 3", "true", "" + (list.capacity() == list.size())));
        
        list.removeLast();
        list.removeLast();
        tests.add(new TestResultPart_1("ArrayList Unique part 4", "true", "" + (list.size() == initialCap)));
        
        list.trimToSize();
        tests.add(new TestResultPart_1("ArrayList Unique part 5", "true", "" + (list.capacity() == initialCap)));
        tests.add(new TestResultPart_1("ArrayList Unique part 6", "true", "" + (list.capacity() == list.size())));
        
        list.clear();
        list.ensureCapacity(list.capacity() + 10);
        for(int i = 0; i < list.capacity(); i++){
            list.add("" + i);
        }
        initialCap = list.capacity();
        list.ensureCapacity(list.capacity() / 2);
        tests.add(new TestResultPart_1("ArrayList Unique part 7", "true", "" + (list.capacity() == initialCap)));
        
        try{
            list.ensureCapacity(-1);
            tests.add(new TestResultPart_1("ArrayList Unique part 8", "exception expected", "exception not thrown"));
        } catch(IllegalArgumentException ex){
            tests.add(new TestResultPart_1("ArrayList Unique part 9", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.ensureCapacity(0);
            tests.add(new TestResultPart_1("ArrayList Unique part 10", "exception expected", "exception not thrown"));
        } catch(IllegalArgumentException ex){
            tests.add(new TestResultPart_1("ArrayList Unique part 11", "exception thrown", "exception thrown"));   
        }
        
    }
    
    public static void runInitializeTests(ArrayList<TestResultPart_1> tests, MyList<String> list){
        list.clear();
        tests.add(new TestResultPart_1("Initial1 part 1", "[]", list.toString()));
        tests.add(new TestResultPart_1("initial1 part 2", "true", "" + list.isEmpty()));
        tests.add(new TestResultPart_1("initial part 3", "0", "" + list.size()));         
        
    }
    
    public static void runAddTests(ArrayList<TestResultPart_1> tests, MyList<String> list){
        list.clear();
        list.add("a");
        tests.add(new TestResultPart_1("add1 part 1", "[a]", list.toString()));

        list.add("b");
        tests.add(new TestResultPart_1("add1 part 2", "[a, b]", list.toString()));

        list.add("c");
        tests.add(new TestResultPart_1("add1 part 3", "[a, b, c]", list.toString()));

        list.add("d");
        tests.add(new TestResultPart_1("add1 part 4", "[a, b, c, d]", list.toString()));

        list.addFirst("z");
        tests.add(new TestResultPart_1("add1 part 5", "[z, a, b, c, d]", list.toString()));

        list.addFirst("y");
        tests.add(new TestResultPart_1("add1 part 6", "[y, z, a, b, c, d]", list.toString()));

        list.addLast("e");
        tests.add(new TestResultPart_1("add1 part 7", "[y, z, a, b, c, d, e]", list.toString()));

        list.add(0, "x");
        tests.add(new TestResultPart_1("add1 part 8", "[x, y, z, a, b, c, d, e]", list.toString()));
    
        list.add(7, "1");
        tests.add(new TestResultPart_1("add1 part 9", "[x, y, z, a, b, c, d, 1, e]", list.toString()));

        list.add(9, "2");
        tests.add(new TestResultPart_1("add1 part 10", "[x, y, z, a, b, c, d, 1, e, 2]", list.toString()));

        list.add(1, "A");
        tests.add(new TestResultPart_1("add1 part 11", "[x, A, y, z, a, b, c, d, 1, e, 2]", list.toString()));
        
        list.add(5, "A");
        tests.add(new TestResultPart_1("add1 part 12", "[x, A, y, z, a, A, b, c, d, 1, e, 2]", list.toString()));
        
        // Section 2
        list.clear();
        list.addFirst("a");
        tests.add(new TestResultPart_1("add2 part 1", "[a]", list.toString()));
        
        // Section 3
        list.clear();
        list.addLast("a");
        tests.add(new TestResultPart_1("add3 part 1", "[a]", list.toString()));
        
        // Section 4
        list.clear();
        list.add(0, "a");
        tests.add(new TestResultPart_1("add4 part 1", "[a]", list.toString()));

    }

    public static void runClearTests(ArrayList<TestResultPart_1> tests, MyList<String> list){
        list.clear();
        tests.add(new TestResultPart_1("clear1 part 1", "[]", list.toString()));
        tests.add(new TestResultPart_1("clear1 part 2", "0", "" + list.size()));
        tests.add(new TestResultPart_1("clear1 part 3", "true", "" + list.isEmpty()));
        
        list.add("a");
        list.clear();
        tests.add(new TestResultPart_1("clear1 part 4", "[]", list.toString()));
        tests.add(new TestResultPart_1("clear1 part 5", "0", "" + list.size()));
        tests.add(new TestResultPart_1("clear1 part 6", "true", "" + list.isEmpty()));
        
        list.add("a");
        list.add("b");
        list.clear();
        tests.add(new TestResultPart_1("clear1 part 7", "[]", list.toString()));
        tests.add(new TestResultPart_1("clear1 part 8", "0", "" + list.size()));
        tests.add(new TestResultPart_1("clear1 part 9", "true", "" + list.isEmpty()));
    }

    public static void runContainsTests(ArrayList<TestResultPart_1> tests, MyList<String> list){
        list.clear();
        tests.add(new TestResultPart_1("Contains1 part 1", "false", "" + list.contains("a")));
        
        list.add("a");
        tests.add(new TestResultPart_1("Contains1 part 2", "true", "" + list.contains("a")));
        tests.add(new TestResultPart_1("Contains1 part 3", "false", "" + list.contains("b")));
        
        list.add("b");
        tests.add(new TestResultPart_1("Contains1 part 4", "true", "" + list.contains("a")));
        tests.add(new TestResultPart_1("Contains1 part 5", "true", "" + list.contains("b")));
        tests.add(new TestResultPart_1("Contains1 part 6", "false", "" + list.contains("c")));

        list.add("c");
        tests.add(new TestResultPart_1("Contains1 part 7", "true", "" + list.contains("a")));
        tests.add(new TestResultPart_1("Contains1 part 8", "true", "" + list.contains("b")));
        tests.add(new TestResultPart_1("Contains1 part 9", "true", "" + list.contains("c")));
        tests.add(new TestResultPart_1("Contains1 part 10", "false", "" + list.contains("d")));
    
    }

    public static void runFirstIndexOfTests(ArrayList<TestResultPart_1> tests, MyList<String> list){
        // Section 1
        list.clear();
        tests.add(new TestResultPart_1("FirstIndexOf1 part 1", "-1", "" + list.firstIndexOf("a")));
        
        list.add("a");
        tests.add(new TestResultPart_1("FirstIndexOf1 part 2", "0", "" + list.firstIndexOf("a")));
        tests.add(new TestResultPart_1("FirstIndexOf1 part 3", "-1", "" + list.firstIndexOf("b")));
            
        list.add("b");
        tests.add(new TestResultPart_1("FirstIndexOf1 part 4", "0", "" + list.firstIndexOf("a")));
        tests.add(new TestResultPart_1("FirstIndexOf1 part 5", "1", "" + list.firstIndexOf("b")));
        tests.add(new TestResultPart_1("FirstIndexOf1 part 6", "-1", "" + list.firstIndexOf("c")));

        list.add("a");
        tests.add(new TestResultPart_1("FirstIndexOf1 part 7", "0", "" + list.firstIndexOf("a")));
        tests.add(new TestResultPart_1("FirstIndexOf1 part 8", "1", "" + list.firstIndexOf("b")));
        tests.add(new TestResultPart_1("FirstIndexOf1 part 9", "-1", "" + list.firstIndexOf("c")));

        // Section 2
        list.clear();
        tests.add(new TestResultPart_1("FirstIndexOf2 part 1", "-1", "" + list.firstIndexOf("a")));
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        tests.add(new TestResultPart_1("FirstIndexOf2 part 2", "0", "" + list.firstIndexOf("a")));
        tests.add(new TestResultPart_1("FirstIndexOf2 part 3", "1", "" + list.firstIndexOf("b")));
        tests.add(new TestResultPart_1("FirstIndexOf2 part 4", "2", "" + list.firstIndexOf("c")));        

        // Section 3
        list.clear();
        tests.add(new TestResultPart_1("FirstIndexOf3 part 1", "-1", "" + list.firstIndexOf("a")));
        
        list.add("a");
        list.add("b");
        list.add("c");
        tests.add(new TestResultPart_1("FirstIndexOf3 part 2", "0", "" + list.firstIndexOf("a")));
        tests.add(new TestResultPart_1("FirstIndexOf3 part 3", "1", "" + list.firstIndexOf("b")));
        tests.add(new TestResultPart_1("FirstIndexOf3 part 4", "2", "" + list.firstIndexOf("c")));        
    }
    
    public static void runGetTests(ArrayList<TestResultPart_1> tests, MyList<String> list){
        list.clear();
        list.add("a");
        tests.add(new TestResultPart_1("get1 part 1", "a", list.getFirst()));        
        tests.add(new TestResultPart_1("get1 part 2", "a", list.getLast())); 
        tests.add(new TestResultPart_1("get1 part 3", "a", list.get(0))); 
        
        list.add("b");
        tests.add(new TestResultPart_1("get1 part 4", "a", list.getFirst()));        
        tests.add(new TestResultPart_1("get1 part 5", "b", list.getLast())); 
        tests.add(new TestResultPart_1("get1 part 6", "a", list.get(0))); 
        tests.add(new TestResultPart_1("get1 part 7", "b", list.get(1))); 

        list.add("c");
        tests.add(new TestResultPart_1("get1 part 8", "a", list.getFirst()));        
        tests.add(new TestResultPart_1("get1 part 9", "c", list.getLast())); 
        tests.add(new TestResultPart_1("get1 part 10", "a", list.get(0))); 
        tests.add(new TestResultPart_1("get1 part 11", "b", list.get(1))); 
        tests.add(new TestResultPart_1("get1 part 11", "c", list.get(2))); 
    }
    
    public static void runIsEmptyTests(ArrayList<TestResultPart_1> tests, MyList<String> list){
        list.clear();
        tests.add(new TestResultPart_1("isEmpty1 part 1", "true", "" + list.isEmpty())); 
        
        list.add("a");
        tests.add(new TestResultPart_1("isEmpty1 part 1", "false", "" + list.isEmpty())); 
        
        list.add("b");
        tests.add(new TestResultPart_1("isEmpty1 part 1", "false", "" + list.isEmpty())); 
    }
    
    public static void runLastIndexOfTests(ArrayList<TestResultPart_1> tests, MyList<String> list){
        // Section 1
        list.clear();
        tests.add(new TestResultPart_1("LastIndexOf1 Part 1", "-1", "" + list.lastIndexOf("a")));
        
        list.add("a");
        tests.add(new TestResultPart_1("LastIndexOf1 Part 2", "0", "" + list.lastIndexOf("a")));
        tests.add(new TestResultPart_1("LastIndexOf1 Part 3", "-1", "" + list.lastIndexOf("b")));
            
        list.add("b");
        tests.add(new TestResultPart_1("LastIndexOf1 Part 4", "0", "" + list.lastIndexOf("a")));
        tests.add(new TestResultPart_1("LastIndexOf1 Part 5", "1", "" + list.lastIndexOf("b")));
        tests.add(new TestResultPart_1("LastIndexOf1 Part 6", "-1", "" + list.lastIndexOf("c")));

        list.add("a");
        tests.add(new TestResultPart_1("LastIndexOf1 Part 7", "2", "" + list.lastIndexOf("a")));
        tests.add(new TestResultPart_1("LastIndexOf1 Part 8", "1", "" + list.lastIndexOf("b")));
        tests.add(new TestResultPart_1("LastIndexOf1 Part 9", "-1", "" + list.lastIndexOf("c")));

        // Section 2
        list.clear();
        tests.add(new TestResultPart_1("LastIndexOf2 part 1", "-1", "" + list.lastIndexOf("a")));
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        tests.add(new TestResultPart_1("LastIndexOf2 part 2", "0", "" + list.lastIndexOf("a")));
        tests.add(new TestResultPart_1("LastIndexOf2 part 3", "3", "" + list.lastIndexOf("b")));
        tests.add(new TestResultPart_1("LastIndexOf2 part 4", "2", "" + list.lastIndexOf("c")));        

        // Section 3
        list.clear();
        tests.add(new TestResultPart_1("LastIndexOf3 part 1", "-1", "" + list.firstIndexOf("a")));
        
        list.add("a");
        list.add("b");
        list.add("c");
        tests.add(new TestResultPart_1("LastIndexOf3 part 2", "0", "" + list.firstIndexOf("a")));
        tests.add(new TestResultPart_1("LastIndexOf3 part 3", "1", "" + list.firstIndexOf("b")));
        tests.add(new TestResultPart_1("LastIndexOf3 part 4", "2", "" + list.firstIndexOf("c")));        
    }
    
    public static void runRemoveTests(ArrayList<TestResultPart_1> tests, MyList<String> list){
        list.clear();
        String result;
        list.add("a");
        result = list.removeFirst();
        tests.add(new TestResultPart_1("Remove1 part 1", "[]", list.toString()));
        tests.add(new TestResultPart_1("Remove1 part 2", "0", "" + list.size()));
        tests.add(new TestResultPart_1("Remove1 part 3", "true", "" + list.isEmpty()));
        tests.add(new TestResultPart_1("Remove1 part 4", "a", result));
    
        list.add("a"); // list == [a]
        result = list.removeLast(); // list == [] 
        tests.add(new TestResultPart_1("Remove1 part 5", "[]", list.toString()));
        tests.add(new TestResultPart_1("Remove1 part 6", "0", "" + list.size()));
        tests.add(new TestResultPart_1("Remove1 part 7", "true", "" + list.isEmpty()));
        tests.add(new TestResultPart_1("Remove1 part 8", "a", result));

        list.add("a"); // list == [a]
        list.add("b"); // list == [a, b]
        result = list.removeFirst(); // list == [b]
        tests.add(new TestResultPart_1("Remove1 part 9", "[b]", list.toString()));
        tests.add(new TestResultPart_1("Remove1 part 10", "1", "" + list.size()));
        tests.add(new TestResultPart_1("Remove1 part 11", "false", "" + list.isEmpty()));
        tests.add(new TestResultPart_1("Remove1 part 12", "a", result));
  
        list.addFirst("a"); // list == [a, b]
        result = list.removeLast(); // list == [a]
        tests.add(new TestResultPart_1("Remove1 part 13", "[a]", list.toString()));
        tests.add(new TestResultPart_1("Remove1 part 14", "1", "" + list.size()));
        tests.add(new TestResultPart_1("Remove1 part 15", "false", "" + list.isEmpty()));
        tests.add(new TestResultPart_1("Remove1 part 16", "b", result));
    
        list.addLast("b"); // list == [a, b]
        list.addLast("c"); // list == [a, b, c]
        result = list.removeFirst(); // list == [b, c]
        tests.add(new TestResultPart_1("Remove1 part 17", "[b, c]", list.toString()));
        tests.add(new TestResultPart_1("Remove1 part 18", "2", "" + list.size()));
        tests.add(new TestResultPart_1("Remove1 part 19", "false", "" + list.isEmpty()));
        tests.add(new TestResultPart_1("Remove1 part 20", "a", result));
    
        list.addFirst("a"); // list == [a, b, c]
        result = list.removeLast(); // list == [a, b]
        tests.add(new TestResultPart_1("Remove1 part 21", "[a, b]", list.toString()));
        tests.add(new TestResultPart_1("Remove1 part 22", "2", "" + list.size()));
        tests.add(new TestResultPart_1("Remove1 part 23", "false", "" + list.isEmpty()));
        tests.add(new TestResultPart_1("Remove1 part 24", "c", result));
        
        list.addLast("c"); // list == [a,b,c]
        result = list.remove(0); // list = [b, c]
        tests.add(new TestResultPart_1("Remove1 part 25", "[b, c]", list.toString()));
        tests.add(new TestResultPart_1("Remove1 part 26", "2", "" + list.size()));
        tests.add(new TestResultPart_1("Remove1 part 27", "false", "" + list.isEmpty()));
        tests.add(new TestResultPart_1("Remove1 part 28", "a", result));        
        
        result = list.remove(0); // list = [c]
        tests.add(new TestResultPart_1("Remove1 part 29", "[c]", list.toString()));
        tests.add(new TestResultPart_1("Remove1 part 30", "1", "" + list.size()));
        tests.add(new TestResultPart_1("Remove1 part 31", "false", "" + list.isEmpty()));
        tests.add(new TestResultPart_1("Remove1 part 32", "b", result));

        result = list.remove(0); // list = []
        tests.add(new TestResultPart_1("Remove1 part 33", "[]", list.toString()));
        tests.add(new TestResultPart_1("Remove1 part 34", "0", "" + list.size()));
        tests.add(new TestResultPart_1("Remove1 part 35", "true", "" + list.isEmpty()));
        tests.add(new TestResultPart_1("Remove1 part 36", "c", result));
        
        list.add("a"); // list = [a]
        list.add("b"); // list = [a, b]
        list.add("c"); // list = [a, b, c]
        result = list.remove(2); // list = [a, b]
        tests.add(new TestResultPart_1("Remove1 part 37", "[a, b]", list.toString()));
        tests.add(new TestResultPart_1("Remove1 part 38", "2", "" + list.size()));
        tests.add(new TestResultPart_1("Remove1 part 39", "false", "" + list.isEmpty()));
        tests.add(new TestResultPart_1("Remove1 part 40", "c", result));

        result = list.remove(1); // list = [a]
        tests.add(new TestResultPart_1("Remove1 part 41", "[a]", list.toString()));
        tests.add(new TestResultPart_1("Remove1 part 42", "1", "" + list.size()));
        tests.add(new TestResultPart_1("Remove1 part 43", "false", "" + list.isEmpty()));
        tests.add(new TestResultPart_1("Remove1 part 44", "b", result));
    }    
    
    public static void runSetTests(ArrayList<TestResultPart_1> tests, MyList<String> list){
        list.clear();
        String result;
        
        list.add("a"); // list == [a]
        result = list.setFirst("b"); // list == [b]
        tests.add(new TestResultPart_1("Set1 part 1", "[b]", "" + list.toString()));
        tests.add(new TestResultPart_1("Set1 part 2", "a", result));
        tests.add(new TestResultPart_1("Set1 part 3", "1", "" + list.size()));
        
        list.addFirst("w"); // list == [w, b]
        result = list.setFirst("a"); // list == [a, b]
        tests.add(new TestResultPart_1("Set1 part 4", "[a, b]", "" + list.toString()));
        tests.add(new TestResultPart_1("Set1 part 5", "w", result));
        tests.add(new TestResultPart_1("Set1 part 6", "2", "" + list.size()));

        list.addLast("c"); // list == [a, b, c]
        result = list.setFirst("x"); // list == [x, b, c]
        tests.add(new TestResultPart_1("Set1 part 7", "[x, b, c]", "" + list.toString()));
        tests.add(new TestResultPart_1("Set1 part 8", "a", result));
        tests.add(new TestResultPart_1("Set1 part 9", "3", "" + list.size()));
        
        list.removeFirst(); // list == [b, c]
        list.removeFirst(); // list == [c]
        list.setFirst("a"); // list == [a]

        result = list.setLast("b"); // list == [b]
        tests.add(new TestResultPart_1("Set1 part 10", "[b]", "" + list.toString()));
        tests.add(new TestResultPart_1("Set1 part 11", "a", result));
        tests.add(new TestResultPart_1("Set1 part 12", "1", "" + list.size()));
        
        list.addFirst("w"); // list == [w, b]
        result = list.setLast("x"); // list == [w, x]
        tests.add(new TestResultPart_1("Set1 part 13", "[w, x]", "" + list.toString()));
        tests.add(new TestResultPart_1("Set1 part 14", "b", result));
        tests.add(new TestResultPart_1("Set1 part 15", "2", "" + list.size()));

        list.addLast("c"); // list == [w, x, c]
        result = list.setLast("y"); // list == [w, x, y]
        tests.add(new TestResultPart_1("Set1 part 16", "[w, x, y]", "" + list.toString()));
        tests.add(new TestResultPart_1("Set1 part 17", "c", result));
        tests.add(new TestResultPart_1("Set1 part 18", "3", "" + list.size()));

        result = list.set(0,"a"); // list == [a, x, y]
        tests.add(new TestResultPart_1("Set1 part 19", "[a, x, y]", "" + list.toString()));
        tests.add(new TestResultPart_1("Set1 part 20", "w", result));
        tests.add(new TestResultPart_1("Set1 part 21", "3", "" + list.size()));

        result = list.set(1,"b"); // list == [a, b, y]
        tests.add(new TestResultPart_1("Set1 part 22", "[a, b, y]", "" + list.toString()));
        tests.add(new TestResultPart_1("Set1 part 23", "x", result));
        tests.add(new TestResultPart_1("Set1 part 24", "3", "" + list.size()));
    
        result = list.set(2,"c"); // list == [a, b, c]
        tests.add(new TestResultPart_1("Set1 part 25", "[a, b, c]", "" + list.toString()));
        tests.add(new TestResultPart_1("Set1 part 26", "y", result));
        tests.add(new TestResultPart_1("Set1 part 27", "3", "" + list.size()));
        
        list.removeLast(); // list == [a, b]
        result = list.set(0, "x"); // list == [x, b]
        tests.add(new TestResultPart_1("Set1 part 28", "[x, b]", "" + list.toString()));
        tests.add(new TestResultPart_1("Set1 part 29", "a", result));
        tests.add(new TestResultPart_1("Set1 part 30", "2", "" + list.size()));

        result = list.set(1, "y"); // list = [x, y]
        tests.add(new TestResultPart_1("Set1 part 31", "[x, y]", "" + list.toString()));
        tests.add(new TestResultPart_1("Set1 part 32", "b", result));
        tests.add(new TestResultPart_1("Set1 part 33", "2", "" + list.size()));
        
        list.removeLast(); // list == [x]
        result = list.set(0, "a"); // list == [a]
        tests.add(new TestResultPart_1("Set1 part 34", "[a]", "" + list.toString()));
        tests.add(new TestResultPart_1("Set1 part 35", "x", result));
        tests.add(new TestResultPart_1("Set1 part 36", "1", "" + list.size()));

    }
    
    
    public static void runExceptionTests(ArrayList<TestResultPart_1> tests, MyList<String> list){
        // Section 1 - IllegalStateExceptions
        list.clear();
        MyList<String>emptyList = list;
        
        // empty getFirst
        try {
            emptyList.getFirst();
            tests.add(new TestResultPart_1("Exceptions1 part 1", "exception expected", "exception not thrown"));
            
        } catch(IllegalStateException ex) {
            tests.add(new TestResultPart_1("Exceptions1 part 2", "exception thrown", "exception thrown"));
        }
        
        // Empty getLast
        try {
            emptyList.getLast();
            tests.add(new TestResultPart_1("Exceptions1 part 3", "exception expected", "exception not thrown"));
            
        } catch(IllegalStateException ex) {
            tests.add(new TestResultPart_1("Exceptions1 part 4", "exception thrown", "exception thrown"));
        }
        
        
        // Empty setFirst
        try {
            emptyList.setFirst("a");
            tests.add(new TestResultPart_1("Exceptions1 part 5", "exception expected", "exception not thrown"));
            
        } catch(IllegalStateException ex) {
            tests.add(new TestResultPart_1("Exceptions1 part 6", "exception thrown", "exception thrown"));
        }
        

        // Empty setLast
        try {
            emptyList.setLast("a");
            tests.add(new TestResultPart_1("Exceptions1 part 7", "exception expected", "exception not thrown"));
            
        } catch(IllegalStateException ex) {
            tests.add(new TestResultPart_1("Exceptions1 part 8", "exception thrown", "exception thrown"));
        }
        
        // Empty removeFirst
        try {
            emptyList.removeFirst();
            tests.add(new TestResultPart_1("Exceptions1 part 9", "exception expected", "exception not thrown"));
            
        } catch(IllegalStateException ex) {
            tests.add(new TestResultPart_1("Exceptions1 part 10", "exception thrown", "exception thrown"));
        }
        

        // Empty removeLast
        try {
            emptyList.removeLast();
            tests.add(new TestResultPart_1("Exceptions1 part 11", "exception expected", "exception not thrown"));
            
        } catch(IllegalStateException ex) {
            tests.add(new TestResultPart_1("Exceptions1 part 12", "exception thrown", "exception thrown"));
        }     
        
        // Section 2 - IndexOutOfBoundsException
        list.clear();
        // Get -----------------        
        try{
            list.get(-1);
            tests.add(new TestResultPart_1("Exceptions2 part 1", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 2", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.get(0);
            tests.add(new TestResultPart_1("Exceptions2 part 3", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 4", "exception thrown", "exception thrown"));   
        }

        try{
            list.get(1);
            tests.add(new TestResultPart_1("Exceptions2 part 5", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 6", "exception thrown", "exception thrown"));   
        }
        
        list.add("a");
        try{
            list.get(-1);
            tests.add(new TestResultPart_1("Exceptions2 part 7", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 8", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.get(1);
            tests.add(new TestResultPart_1("Exceptions2 part 9", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 10", "exception thrown", "exception thrown"));   
        }

        try{
            list.get(2);
            tests.add(new TestResultPart_1("Exceptions2 part 11", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 12", "exception thrown", "exception thrown"));   
        }
    
        list.add("b");
        try{
            list.get(-1);
            tests.add(new TestResultPart_1("Exceptions2 part 13", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 14", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.get(2);
            tests.add(new TestResultPart_1("Exceptions2 part 15", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 16", "exception thrown", "exception thrown"));   
        }

        try{
            list.get(3);
            tests.add(new TestResultPart_1("Exceptions2 part 17", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 18", "exception thrown", "exception thrown"));   
        }

        // Add -----------------
        list.clear();
        try{
            list.add(-1, "a");
            tests.add(new TestResultPart_1("Exceptions2 part 19", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 20", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.add(1, "a");
            tests.add(new TestResultPart_1("Exceptions2 part 21", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 22", "exception thrown", "exception thrown"));   
        }
        
        list.clear();
        list.add("a");
        try{
            list.add(-1, "b");
            tests.add(new TestResultPart_1("Exceptions2 part 23", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 24", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.add(2, "b");
            tests.add(new TestResultPart_1("Exceptions2 part 25", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 26", "exception thrown", "exception thrown"));   
        }
        
        list.clear();
        list.add("a");
        list.add("b");
        try{
            list.add(-1, "c");
            tests.add(new TestResultPart_1("Exceptions2 part 27", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 28", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.add(3, "c");
            tests.add(new TestResultPart_1("Exceptions2 part 29", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 30", "exception thrown", "exception thrown"));   
        }

        list.clear();
        list.add("a");
        list.add("b");
        list.add("c");
        try{
            list.add(-1, "d");
            tests.add(new TestResultPart_1("Exceptions2 part 31", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 32", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.add(4, "d");
            tests.add(new TestResultPart_1("Exceptions2 part 33", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 34", "exception thrown", "exception thrown"));   
        }
        
        // Set -----------------
        list.clear();
        list.add("a");
        try{
            list.set(-1, "b");
            tests.add(new TestResultPart_1("Exceptions2 part 35", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 36", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.set(1, "c");
            tests.add(new TestResultPart_1("Exceptions2 part 37", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 38", "exception thrown", "exception thrown"));   
        }
        
        list.clear();
        list.add("a");
        list.add("b");
        try{
            list.set(-1, "c");
            tests.add(new TestResultPart_1("Exceptions2 part 39", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 40", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.set(2, "d");
            tests.add(new TestResultPart_1("Exceptions2 part 41", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 42", "exception thrown", "exception thrown"));   
        }

        list.clear();
        list.add("a");
        list.add("b");
        list.add("c");
        try{
            list.set(-1, "d");
            tests.add(new TestResultPart_1("Exceptions2 part 43", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 44", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.set(3, "e");
            tests.add(new TestResultPart_1("Exceptions2 part 45", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 46", "exception thrown", "exception thrown"));   
        }

        // Remove -----------------
        list.clear();
        list.add("a");
        try{
            list.remove(-1);
            tests.add(new TestResultPart_1("Exceptions2 part 47", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 48", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.remove(1);
            tests.add(new TestResultPart_1("Exceptions2 part 49", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 50", "exception thrown", "exception thrown"));   
        }
        
        list.clear();
        list.add("a");
        list.add("b");
        try{
            list.remove(-1);
            tests.add(new TestResultPart_1("Exceptions2 part 51", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 52", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.remove(2);
            tests.add(new TestResultPart_1("Exceptions2 part 53", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 54", "exception thrown", "exception thrown"));   
        }

        list.clear();
        list.add("a");
        list.add("b");
        list.add("c");
        try{
            list.remove(-1);
            tests.add(new TestResultPart_1("Exceptions2 part 55", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 56", "exception thrown", "exception thrown"));   
        }
        
        try{
            list.remove(3);
            tests.add(new TestResultPart_1("Exceptions2 part 57", "exception expected", "exception not thrown"));
        } catch(IndexOutOfBoundsException ex){
            tests.add(new TestResultPart_1("Exceptions2 part 58", "exception thrown", "exception thrown"));   
        }
        

        
    }
    
} 

/* Holds results of a single result */
class TestResultPart_1 {

    private String message;
    private String expected;
    private String received;

    public TestResultPart_1(String message, String expected, String received) {
        this.message = message;
        this.expected = expected;
        this.received = received;
    }
    
    private boolean passed() {
        return expected.equals(received);
    }
        
    public static void reportTestResultPart_1s(ArrayList<TestResultPart_1> testResults) {
        System.out.println("Results of " + testResults.size() + " tests:");
        boolean errorsFound = false;
        for (TestResultPart_1 result : testResults) {
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
} // End of class TestResultPart_1
