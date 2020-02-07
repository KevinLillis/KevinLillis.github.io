
/**
 *
 * @author Dr. Lillis
 */
public class CircularBufferRunner {
    public static void main(String[] args) {
        run1();
//        run2();
    }
    
    
    static void run2(){
        MyCircularBuffer<Integer> buffer = new ArrayBuffer<>();
        //MyCircularBuffer<Integer> buffer = new LinkedBuffer<>();

        print(buffer);

        buffer.addFront(10);
        print(buffer);

        buffer.addFront(20);
        print(buffer);

        buffer.addFront(30);
        print(buffer);

        buffer.addFront(40);
        print(buffer);

        Integer x;
        
        x = buffer.removeRear();
        print(buffer);
        System.out.println(x);

        buffer.addFront(50);
        print(buffer);

        x = buffer.removeRear();
        print(buffer);
        System.out.println(x);

        x = buffer.removeRear();
        print(buffer);
        System.out.println(x);

        x = buffer.removeRear();
        print(buffer);
        System.out.println(x);

        x = buffer.removeRear();
        print(buffer);
        System.out.println(x);

    }
    
    static void run1(){
        MyCircularBuffer<Integer> buffer = new ArrayBuffer<>();
//        MyCircularBuffer<Integer> buffer = new LinkedBuffer<>();
        
        print(buffer);
        
        buffer.add(10);
        print(buffer);

        buffer.add(20);
        print(buffer);

        buffer.add(30);
        print(buffer);

        buffer.add(40);
        print(buffer);
        
        Integer x;
        
        x = buffer.remove();
        print(buffer);
        System.out.println(x);
        
        x = buffer.remove();
        print(buffer);
        System.out.println(x);

        buffer.add(50);
        print(buffer);
        
        buffer.add(60);
        print(buffer);
        
        x = buffer.remove();
        print(buffer);
        System.out.println(x);        

        x = buffer.remove();
        print(buffer);
        System.out.println(x);        

        x = buffer.remove();
        print(buffer);
        System.out.println(x);        

        x = buffer.remove();
        print(buffer);
        System.out.println(x);      }
    
    static void print(MyCircularBuffer buf){
        System.out.println("------------------");
        System.out.println(buf);
        System.out.printf("%-9s", buf.isEmpty() ? "Empty" : "Not Empty" );
        System.out.print(" | ");
        System.out.printf("%-8s", buf.isFull() ? "Full" : "Not Full");
        System.out.print(" | ");
        System.out.print(buf.capacity() + " Capacity");
        System.out.print(" | ");
        System.out.print(buf.size() + " Used");
        System.out.print(" | ");
        System.out.print(buf.free() + " Free");
        System.out.println();
    }
}
