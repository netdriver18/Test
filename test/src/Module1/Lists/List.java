package Module1.Lists;
public class List {

    // Represent values in this list
    private String[] values = new String[4];

    // Represent the number of values that were added to this list
    private int length = 0;

    public List() {
    }

    // Should add new value to the end of the list, increment length and extend array by x2 if needed
    public void add(String value) {
       String[] values1  = new String[values.length+1];
       values1 = values.clone();
       values1[values.length] = value;
       length++;
    }

    // Should add new value at the specified index, moving other values to the right,
    // increment length and extend array by x2 if needed
    public void addAtIndex(String value, int index) {
        String[] values3 = new String[values.length+1];
        System.arraycopy(values,index,values3, index+1, values.length-index);
        values3[index] = value;
        System.arraycopy(values,0, values3, 0, value.length() - index);
        length++;
    }

    // Should return a value at specified index, or null if index is out of list bounds
    public String get(int index) {
        if ((index > values.length-1)||(index<0)){
            return null;
        }
        else{
         return values[index];
        }
    }

    // Should return the index of the first occurrence of specified value in list
    // If the value does not exist - return -1
    public int indexOf(String value) {
        int i = 0;
        while (i < values.length){
            if (values[i].contains(value)){
                return i;
            }
        }
        return -1;
    }

    // Should remove the value at specified index, decrementing the length of this list and moving next values to the left
    public void remove(int index) {
        // TODO implement me
    }

    public int getLength() {
        return length;
    }
}
