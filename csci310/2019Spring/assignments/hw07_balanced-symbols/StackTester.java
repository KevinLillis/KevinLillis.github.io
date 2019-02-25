public class StackTester {
    public static int errorCount = 0;
    public static void main(String[] args){
        MyStack<Integer> stack = new LinkedStack<>();
        
        int expSize;
        boolean expIsEmpty;
        String expContent;
        String message;
        int tos;
        int expTos;

        //----------------------------------------------------------------------
        message = "1) Initialized Stack";
        expSize = 0;
        expIsEmpty = true;
        expContent = "TOS []";
        check(stack, expSize, expIsEmpty, expContent, message);
        
        //----------------------------------------------------------------------
        message = "2) Push 10";
        stack.push(10);
        expSize = 1;
        expIsEmpty = false;
        expContent = "TOS [10]";
        check(stack, expSize, expIsEmpty, expContent, message);

        //----------------------------------------------------------------------
        message = "3) Push 20";
        stack.push(20);
        expSize = 2;
        expIsEmpty = false;
        expContent = "TOS [20, 10]";
        check(stack, expSize, expIsEmpty, expContent, message);

        //----------------------------------------------------------------------
        message = "4) Push 30";
        stack.push(30);
        expSize = 3;
        expIsEmpty = false;
        expContent = "TOS [30, 20, 10]";
        check(stack, expSize, expIsEmpty, expContent, message);

        //----------------------------------------------------------------------
        message = "5) Top";
        tos = stack.top();
        expTos = 30;
        expSize = 3;
        expIsEmpty = false;
        expContent = "TOS [30, 20, 10]";
        check(stack, expSize, expIsEmpty, expContent, tos, expTos, message);

        //----------------------------------------------------------------------
        message = "6) Pop";
        tos = stack.pop();
        expTos = 30;
        expSize = 2;
        expIsEmpty = false;
        expContent = "TOS [20, 10]";
        check(stack, expSize, expIsEmpty, expContent, tos, expTos, message);

        //----------------------------------------------------------------------
        message = "7) Pop";
        tos = stack.pop();
        expTos = 20;
        expSize = 1;
        expIsEmpty = false;
        expContent = "TOS [10]";
        check(stack, expSize, expIsEmpty, expContent, tos, expTos, message);
        
        //----------------------------------------------------------------------
        message = "8) Top";
        tos = stack.top();
        expTos = 10;
        expSize = 1;
        expIsEmpty = false;
        expContent = "TOS [10]";
        check(stack, expSize, expIsEmpty, expContent, tos, expTos, message);

        //----------------------------------------------------------------------
        message = "9) Pop";
        tos = stack.pop();
        expTos = 10;
        expSize = 0;
        expIsEmpty = true;
        expContent = "TOS []";
        check(stack, expSize, expIsEmpty, expContent, tos, expTos, message);
        
        //----------------------------------------------------------------------
        checkExceptions();
        
        if(errorCount == 0){
            System.out.println("No Errors Found");
        } else {
            System.out.println(errorCount + " Error(s) Found");
        }
        
    }
    
    public static void checkExceptions(){
        boolean localError = false;
        String failMessage = "";
        
        MyStack<Integer> s = new LinkedStack<>();
        try{
            int x = s.pop();
            failMessage += "\tException not thrown for pop on an empty stack";
            localError = true;
        }
        catch(EmptyStackException e){
            
        }
        
        try{
            int x = s.top();
            failMessage += "\tException not thrown for top on an empty stack";
            localError = true;
        }
        catch(EmptyStackException i){
            
        }

        if(localError){
            System.out.println("Exception Tests");
            System.out.println(failMessage);
            System.out.println();
            errorCount++;
        }
        
    }
    
    public static void check(MyStack s, int expSize, boolean expIsEmpty, String expContent, String message){
        boolean localError = false;
        String failMessage = "";
        if(s.size() != expSize){
            localError = true;
            failMessage += "\tsize: expected " + expSize + ",  got " + s.size();
        }
        if(s.isEmpty() != expIsEmpty){
            localError = true;
            failMessage += "\n\tisEmpty: expected " + expIsEmpty + ",  got " + s.isEmpty();            
        }
        if(!s.toString().equals(expContent)){
            localError = true;
            failMessage += "\n\tContent: expected " + expContent + ",  got " + s.toString();                        
        }
        if(localError){
            System.out.println(message);
            System.out.println(failMessage);
            System.out.println();
            errorCount++;
        }
        
    }
    
    public static void check(MyStack s, int expSize, boolean expIsEmpty, String expContent, int tos, int expTos, String message){
        boolean localError = false;
        String failMessage = "";
        if(s.size() != expSize){
            localError = true;
            failMessage += "\tsize: expected " + expSize + ",  got " + s.size();
        }
        if(s.isEmpty() != expIsEmpty){
            localError = true;
            failMessage += "\n\tisEmpty: expected " + expIsEmpty + ",  got " + s.isEmpty();            
        }
        if(!s.toString().equals(expContent)){
            localError = true;
            failMessage += "\n\tContent: expected " + expContent + ",  got " + s.toString();                        
        }
        if(tos != expTos){
            localError = true;
            failMessage += "\n\tTos: expected " + expTos + ",  got " + tos;                                    
        }
        if(localError){
            System.out.println(message);
            System.out.println(failMessage);
            System.out.println();
            errorCount++;
        }
        
    }

}
