/**
 *
 * @author Dr. Lillis
 */
public class ListOfStrings  implements ListOfStringInterface {
    // Class and Instance variables
    public static final int DEFAULT_CAPACITY = 4;
    private String[] array;
    private int size = 0;
    
    // Constructors
    public ListOfStrings(int initialCapacity){
        array = new String[initialCapacity];
    }
    
    public ListOfStrings(){
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void add(String str) {
        add(this.size(), str);
    }

    @Override
    public void add(int i, String str) throws IndexOutOfBoundsException {
        if(i < 0 || i > size){ // note, i can equal size
            String message = "Cannot add element " + i;
            throw new IndexOutOfBoundsException(message);
        }
        
        if(size == this.getCapacity()){
            // double the size of the array
            this.ensureCapacity(this.getCapacity() * 2);
        }
        
        // Shift items to the right to make a "hole" at index i
        System.arraycopy(array, i, array, i+1, size - i);
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
        String[] temp = new String[this.size()];
        System.arraycopy(array, 0, temp, 0, this.size());
        array = temp;
    }

    @Override
    public boolean contains(String str) {
        return this.firstIndexOf(str) >= 0;
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        if(this.getCapacity() < minCapacity){
            // Need to increase the capacity
            String[] temp = new String[minCapacity];
            System.arraycopy(array, 0, temp, 0, this.size());
            array = temp;
        }
    }

    @Override
    public int firstIndexOf(String str) {
        for(int i = 0; i < size; i++){
            if(array[i].equals(str)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int i) throws IndexOutOfBoundsException {
        if(i < 0 || i > this.size() - 1){
            String message = "index " + i + " is not valid";
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
        if(isEmpty()){
            String message = "List is empty, cannot get first.";
            throw new IllegalStateException(message);
        }
        return get(0);
    }

    @Override
    public String getLast() throws IllegalStateException {
        if(isEmpty()){
            String message = "List is empty, cannot get last.";
            throw new IllegalStateException(message);
        }
        return get(size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int lastIndexOf(String str) {
        for(int i = size() - 1; i >= 0 ; i--){
            if(array[i].equals(str)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String remove(String str) {
        int index = firstIndexOf(str);
        if(index < 0){
            // str is not in the list
            return null;
        } else {
            return remove(index);
        }
    }

    @Override
    public String remove(int i) throws IndexOutOfBoundsException {
        if(i < 0 || i > size() - 1){
            throw new IndexOutOfBoundsException("Index " + i + " not valid");
        }
        
        String removedItem = this.get(i);
        
        // now adjust the array
        if (i < size() - 1){
            System.arraycopy(array, i+1, array, i, size-i-1);
        }
        size--;
        
        return removedItem;
    }

    @Override
    public String removeFirst() throws IllegalStateException {
        if(isEmpty()){
            throw new IllegalStateException("List is empty, cannot remove first.");
        }
        return remove(0);
    }

    @Override
    public String removeLast() throws IllegalStateException {
        if(isEmpty()){
            throw new IllegalStateException("List is empty, cannot remove last.");
        }
        return remove(size() - 1);
    }

    @Override
    public String set(int i, String str) throws IndexOutOfBoundsException {
        if(i < 0 || i > this.size()){
            throw new IndexOutOfBoundsException("Cannot set element " + i);
        }
        
        String oldValue = array[i];
        array[i] =  str;
        return oldValue;
    }

    @Override
    public String setFirst(String str) throws IllegalStateException {
        if(isEmpty()){
            throw new IllegalStateException("List is empty, cannot set first.");
        }
        return set(0, str);
    }

    @Override
    public String setLast(String str) throws IllegalStateException {
        if(isEmpty()){
            throw new IllegalStateException("List is empty, cannot set last.");
        }
        return set(size() - 1, str);
    }

    @Override
    public int size() {
        return size;
    }
    
    @Override
    public String toString(){
        String s = "";
        
        s += "[";
        
        boolean firstItem = true;
        for(int i = 0; i < this.size(); i++){
            if(firstItem){
                s += array[i];
                firstItem = false;
            } else {
                s += ", ";
                s += array[i];
            }
        }
        
        s += "]";
        
        //s += " (" + this.size() + "/" + this.getCapacity() + ")";
        return s;
    }

}
