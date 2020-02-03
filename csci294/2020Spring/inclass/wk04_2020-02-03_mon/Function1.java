/* Function1.java */

class Function1 {
    public static void main(String[] args) {
        funA(5);
    }
    
    static void funA(int counter){
        if(counter > 0){
            System.out.println("FunA " + counter);
            funB(counter - 1);
        }
    }
    
    static void funB(int counter){
        if(counter > 0){
            System.out.println("FunB " + counter);
            funA(counter - 1);
        }
    }
}