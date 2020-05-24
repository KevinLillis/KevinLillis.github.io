/**
 *
 * @author Dr. Lillis
 */
public class ListOfStrings implements ListOfStringInterface {
    public static final int DEFAULT_CAPACITY = 4;
    private String[] array;
    private int size = 0;

    public ListOfStrings(int initialCapacity){
        array = new String[initialCapacity];
    }
    
    public ListOfStrings(){
        this(DEFAULT_CAPACITY);
    }
    
    @Override
    public void add(String str) {
        addLast(str);
    }

    @Override
    public void add(int i, String str) throws IndexOutOfBoundsException {
        if(i < 0 || i > this.size()){
            String message = "Cannot add element at index " + i;
            throw new IndexOutOfBoundsException(message);
        }
        
        if(this.size() == this.getCapacity()){
            // double the size of the array
            this.ensureCapacity(this.getCapacity() * 2);
        }
        
        // Now we can add str at index position i
        // First make a "hole" at position i
        System.arraycopy(array, i, array, i+1, this.size() - i);
        array[i] = str;
        
        size++;
    }

    @Override
    public void addFirst(String str) {
        this.add(0, str);
    }

    @Override
    public void addLast(String str) {
        this.add(this.size(), str);
    }

    @Override
    public void clear() {
        array = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void compress() {
        if(this.getCapacity() > this.size()){
            String[] temp = new String[this.size()];
            System.arraycopy(array, 0, temp, 0, this.size());
            array = temp;
        }
    }

    @Override
    public boolean contains(String str) {
        return this.firstIndexOf(str) != -1;
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        if (getCapacity() < minCapacity){
            // Need to increase the capacity
            String[] temp = new String[minCapacity];
            System.arraycopy(array, 0, temp, 0, this.size());
            array = temp;
        }
    }

    @Override
    public int firstIndexOf(String str) {
        for ( int i = 0; i < size; i++){
            if(array[i].equals(str)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int i) throws IndexOutOfBoundsException {
        if(i < 0 || i > this.size() - 1) {
            String message = "index " + i + " is not valid.";
            throw new IndexOutOfBoundsException(message);
        }
        
        return array[i];
    }

    @Override
    public int getCapacity() {
        return array.length;
    }

    @Override
    public String getFirst() throws IllegalStateException {
        if(this.isEmpty()){
            String message = "List is empty, cannot get first.";
            throw new IllegalStateException(message);
        }
        return get(0);
    }

    @Override
    public String getLast() throws IllegalStateException {
        if(this.isEmpty()){
            String message = "List is empty, cannot get last.";
            throw new IllegalStateException(message);
        }
        return get(this.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public int lastIndexOf(String str) {
        for ( int i = this.size() - 1; i >= 0; i--){
            if(array[i].equals(str)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String remove(String str) {
        int i = firstIndexOf(str);
        if(i < 0){
            return null;
        }
        
        return remove(i);
    }

    @Override
    public String remove(int i) throws IndexOutOfBoundsException {
        if(i < 0 || i > this.size() - 1) {
            String message = "index " + i + " is not valid.";
            throw new IndexOutOfBoundsException(message);
        }
        String removedItem = this.get(i);
        
        // Adjust the array - Shift some things to the left
        if (i < size() - 1){
            System.arraycopy(array, i+1, array, i, this.size()-i-1);
        }
        size--;
        
        return removedItem;
    }

    @Override
    public String removeFirst() throws IllegalStateException {
        if(this.isEmpty()){
            String message = "List is empty, cannot remove first item.";
            throw new IllegalStateException(message);
        }
        return remove(0);
    }

    @Override
    public String removeLast() throws IllegalStateException {
        if(this.isEmpty()){
            String message = "List is empty, cannot remove last item.";
            throw new IllegalStateException(message);
        }
        return remove(this.size() - 1);
    }

    @Override
    public String set(int i, String str) throws IndexOutOfBoundsException {
        if(i < 0 || i > this.size()){
            String message = "Cannot set element at index " + i;
            throw new IndexOutOfBoundsException(message);
        }
        
        String oldValue = array[i];
        array[i] = str;
        
        return oldValue;
    }

    @Override
    public String setFirst(String str) throws IllegalStateException {
        if(this.isEmpty()){
            String message = "List is empty, cannot set first item.";
            throw new IllegalStateException(message);
        }
        return this.set(0, str);
    }

    @Override
    public String setLast(String str) throws IllegalStateException {
        if(this.isEmpty()){
            String message = "List is empty, cannot set last item.";
            throw new IllegalStateException(message);
        }
        return this.set(this.size() - 1, str);
    }

    @Override
    public int size() {
        return size;
    }
    
    @Override
    public String toString(){
        String s = "[";
        boolean firstItem = true;
        
        for(int i = 0; i < size; i++){
            if(firstItem){
                s += this.get(i);
                firstItem = false;
            } else {
                s += ", " + this.get(i);
            }
        }
        
        s += "]";
        return s;
        
    }
    

}
