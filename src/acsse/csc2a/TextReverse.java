package acsse.csc2a;

public class TextReverse {

    public void transform(char[] contents, int intLength) {
        char[] reversed = new char[intLength];
        int r = 0;
        // loop from the end of the array to the start (backwards)
        for (int i = intLength - 1; i >= 0; i--)
        {
            // Copy the contents across to the temp array
            reversed[r++] = contents[i];
        }
        
        for (int i = 0; i < intLength; i++)
            contents[i] = reversed[i];
    }
}
