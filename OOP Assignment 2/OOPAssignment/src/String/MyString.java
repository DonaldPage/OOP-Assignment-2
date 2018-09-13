package String;

public class MyString {

    /* MyString is a String class, which accepts character strings of
       varying length. This class supports many commonly used string
       functions including length, copy, position, searching and replacing.
       With additional functions are
       There should be validation and error handling in place where appropriate.
     */

    // CLASS VARIABLES
    private char[] strValues;

    // CLASS CONSTRUCTORS
    // When instanciated, will require a value to specify the
    // elements of the array.
    public MyString(char[] strValue) {
        this.strValues = strValue;
    }


    // STRING FUNCTIONS

    // ADD ON END - Makes a copy of the array and adds a character
    //              onto the end of an existing array (string).
    public void addOnEnd(char newChar) {
        if (isEmpty()) {                                                    // Asks if the array is empty
            throw new IndexOutOfBoundsException();                          // Throws an exemption to stop the process
        }
            char[] newArray = new char[strValues.length + 1];               // Creates new array using the lengh of old array +1
            for (int i = 0; i < strValues.length; i++) {                    // Loops through the old array
                newArray[i] = strValues[i];                                 // Populates new array with details from the old array
            }
            newArray[newArray.length - 1] = newChar;                        // Adds the new character to end of the new array
            strValues = newArray;                                           // sets strValues to be new array

    }   // End of ADD ON END

    // COPY STRING - A mehtod with return type MyString, that
    //               returns a new instance of a MyString array
    //               that contains the old arrays details.
    public MyString copyString() {
        if (isEmpty()) {                                                    // Asks if the array is empty
            throw new NullPointerException();                               // Throws an exemption to stop the process
        }                                                                   // Otherwise...
            return new MyString(strValues);                                 // Returns a MyString object which contains arrays contents

    }   // End of COPY STRING

    // GET POSITION - Retrieves the character stored in a
    //                specified index, then then
    public char getPosInString(int i) {

        if (i > strValues.length-1 || i < 0) {                              // condition for error
            throw new IndexOutOfBoundsException();                          // Throws an exemption to stop the process
        }

    return strValues[i];                                                    // if not return character at position i

    }   // End of GET POSITION IN STRING

    // GET SUB STRING - Locates a given position in the array,
    //                  and returns a new string which reads
    //                  from start to index supplied
    public MyString getSubString(int lastPos) {
        lastPos--;                                                          // because 0 indexed
        if (lastPos > strValues.length || lastPos < 0) {                    // If position entered is > length of array or < 0
            throw new IndexOutOfBoundsException();}                         // Throws an exemption to stop the process
        char[] sub = new char[lastPos+1];                                   // Creating a new copy of the array +1
        for (int i = 0; i <= lastPos; i++) {                                // Loops through the old array
            sub[i] = strValues[i];                                          // Populates new array with details from the old array
        }
        return new MyString(sub);                                           // Returns a new MyString object contining the new array

    }   // End of GET SUB STRING

    // REPLACE - Expects two character inputs, and old char and a
    //           new char, then replace old, whith new.
    public void replace (char oldChar, char newChar) {                  // Takes old char and new char
        for (int i = 0; i < strValues.length; i++) {                    // Loops through the array
                if (strValues[i] == oldChar) {                          // If a position in the array matches the old char
                    strValues[i] = newChar;                             // Then replace with new char
                }
        }

    }   // End of REPLACE

    // FIND CHAR - Loops through the array and finds the numerical
    //             position of a given character.
    public int findChar(char c) {                                       // Excepts the input of a character
        for (int i = 0; i < strValues.length; i++) {                    // Loops through the array
            if (strValues[i] == c) {                                    // If the posion in the array matches the given char
                return i;                                               // Then return the numerical positon
            }
        }

        return -1;                                                      //

    }   // End of FIND CHAR

    // APPEND - Creates a new array, creates another new arry and
    //          and combines both array's lengths, finally loops through and
    //          adds both array details to a character array.
    public void append(char[] toAdd) {                                  // Accepts a character array of varying length
        char[] _strValue = new char[strValues.length                    // Creates new array, sets lengh as old array
                + toAdd.length];                                        // + new array's lengh
        for (int i = 0; i < strValues.length; i++) {                    // Loops through array
            _strValue[i] = strValues[i];                                // Sets old array details to new array
        }
        for (int i = strValues.length, j = 0;                           // Loops through new array, starting from after
             i < _strValue.length; i++, j++) {                          // the old array's length
            _strValue[i] = toAdd[j];                                    // Sets new details into the new array
        }
        strValues = _strValue;                                          // Replaces old array with new array

    }   // End of APPEND

    // REV ORDER - Creates a new array, loops through and reverses
    //             the order of characters in the original array.
    public void revOrder() {
        char[] _strValue = new char[strValues.length];                  // Creates new charcter array of same length as old
        for (int i = strValues.length-1, j = 0; i >= 0; i--, j++) {     // Loops through old array and reverses order
            _strValue[j] = strValues[i];                                // Swaps old details with reversed details
        }
        strValues = _strValue;                                          // Sets old array with new array's reversed details

    }   // End of REV ORDER


    // UTILITY BASED FUNCTIONS

    // LENGTH - Uses length to return an int value capacitiy
    //          of the array.
    public int length() {
        return strValues.length;                                            // Returns the length of array in an int value

    }   // End of LENGTH

    // IS EMPTY - A method with return type of boolean, returning true
    //            when and only when the lengh of the array is 0
    public boolean isEmpty() {
        return strValues.length == 0;                                       // Returns true if the array is empty

    }   // End of IS EMPTY

    // GET STRING VALUE - Uses java.lang.String toSring method to convert
    //                    the array to a string.
    public char[] getStrValues() {
        return strValues;                                                   // Returns the array values as a string

    }   // End of GET STRING VALUES

    // Override Object.toString(), provides a simple and easier way to
    // impliment System.out.println().
    @Override
    public java.lang.String toString() {
        return new java.lang.String(strValues);                             // Sets array's details as a Java string object
    }


}
