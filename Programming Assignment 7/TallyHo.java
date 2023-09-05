public class TallyHo {

    // Instance variables = must be private which means
    // they only exist inside class and not publically outside
    // Define a variable with a type and name
    private int value;
    private int limit;

    // All public methods together in a class are the "public interface"

    /** 
    * Method adds 1 to the current value
    */      
    public void countValue () {
        value++;   // value++
        if (value>limit) {
            System.out.println("Count cannot go over the limit");
            value--;
        }
    }

    /**
    *  Method returns current contents of value
    */
    public int getValue () {
        return value;
    }

    // Method resets value to zero
    public void resetValue() {
        value = 0;
    }

    //Method sets a maxximum limit on the count
    public void setlimit(int max) {

        limit=max;
    }

    //Method undoes the last count increment
    public void undo() {
        value--;
        if (value<0) {
            System.out.println("Cannot undo because count would be less than 0.");
            value=0;
        }
    }

    //Method reports back the remaining space 
    public int space() {
        return limit-value;
    }


    // Constructor - is a special method that sets up instance variables
    // Look like a method with no return type
    // The constructor always has a capital letter at the start, because
    // its name always matches the class name.
    public TallyHo(int max) {   // A Constructor 
        value = 0;
        limit=max;
    }
    public TallyHo() {
        value = 0;
    }

}