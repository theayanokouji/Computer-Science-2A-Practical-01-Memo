package acsse.csc2a;

public class TextStore {

    // instance variables
    private TextReverse rTransform;
    private char[] contents;
    private int length;
    private final int ERROR_INDEX_NEGATIVE = -1;
    private final int ERROR_INDEX_TOO_HIGH = -2;
    
    public TextStore() {
        length = 1;                   // Set the length
        contents = new char[1];       // Create the array
        contents[0] = ' '; 
        rTransform = new TextReverse();
    }

    /**
     * 
     * @param strContents - string to store
     * @param intLength - length of the char array
     */
    public TextStore(char[] strContents, int intLength) {
        length = intLength;
        contents = new char[length];
        for (int i = 0; i < length; i++) // Assign contents to the char array in the class
        {
            contents[i] = strContents[i];
        }
        rTransform = new TextReverse();
    }

    /**
     * 
     * @param original - Original object to copy from
     */
    public TextStore(TextStore original) {
        contents = original.contents;
        rTransform = new TextReverse();
    }

    // [access modifier] [return type] [name of function]
    /**
     * 
     * @return The length of the string
     */
    public int getLength() {
        return contents.length;
    }

    public void transform() {
        rTransform.transform(contents, contents.length);
    }

    /**
     * 
     * @param index - The index for the character 
     * @return The character at that index
     */
    public char getCharAt(int index) {
        if (index < 0)
            System.exit(ERROR_INDEX_NEGATIVE); // Uses error codes to terminate the program if out of bounds
        else if (index >= contents.length)
            System.exit(ERROR_INDEX_TOO_HIGH);

        return contents[index];
    }
}
