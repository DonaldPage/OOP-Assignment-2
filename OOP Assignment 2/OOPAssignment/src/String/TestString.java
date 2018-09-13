package String;

public class TestString {


    public static void main(java.lang.String[] args) {

        /* CALLING THE TESTING METHODS FOR ALL METHODS IN MYSTRING
           ======================================================= */

        // TEST1 - GET POSITION
        //testGetPosition();
        // TEST2 - GET STRING VALUES
        //testGetSrtValues();
        // TEST3 - ADD ON END
        //testAddOnEnd();
        // TEST4 - GET SUB STRING
        //testGetSubString();
        // TEST5 - LENGTH
        //testLengh();
        // TEST6 - REPLACE
        testRepalce();
        // TEST7 - FIND CHAR
        //testFindChar();
        // TEST8 - REV ORDER
        //testRevOrder();
        // TEST9 - COPY STRING
        //testCopyStr();
        // TEST10 - APPEND
        //testAppend();

    }

    //              TESTING METHODS WITHIN MYSTRING CLASS
    //              =====================================

    // TEST1 - GET POSITION
    private static void testGetPosition() {

        // Instantiation of the MyString object
        MyString str1 = new MyString(new char[]{'h', 'e', 'l', 'l', 'o'});

        // Test getting a characters position within the range
        // of the array str1, in this case 0-4.
        System.out.println("------------ getPosInString --------------");
        System.out.println(" Show character held in position 1");
        System.out.println(" Char at pos 1 = " + str1.getPosInString(1));
        System.out.println("-----------------------------------\n");
        // Test validation by trying to get a character outside
        // the lowest range of the array.
        System.out.println("------------ getPosInString --------------");
        System.out.println(" Trying to get char at a possition\n" +
                " which is out of bounds e.g. -1 \n");
        try {
            str1.getPosInString(-1);                                      // Including the test within a try/catch
        } catch (IndexOutOfBoundsException e) {                             // to keep program running.
            System.out.println(e);                                          // Prints the caught error to screen
        }
        System.out.println("-----------------------------------\n");
        // Test validation by trying to get a character outside
        // the highest range of the array.
        System.out.println("------------ getPosInString --------------");
        System.out.println(" Show character held in position 4");
        System.out.println(" Char at pos 4 = " + str1.getPosInString(4));
        System.out.println("-----------------------------------\n");

        // Test validation by trying to get a character outside
        // the range of the array.
        System.out.println("------------ getPosInString --------------");
        System.out.println(" Trying to get char at a possition\n" +
                " which is out of bounds e.g. 5 \n");
        try {
            str1.getPosInString(5);                                      // Including the test within a try/catch
        } catch (IndexOutOfBoundsException e) {                             // to keep program running.
            System.out.println(e);                                          // Prints the caught error to screen
        }
        System.out.println("-----------------------------------\n");

    }   // End of TEST1

    // TEST2 - GET STRING VALUES
    private static void testGetSrtValues() {

        // Instantiation of the MyString object
        MyString str1 = new MyString(new char[]{'h', 'e', 'l', 'l', 'o'});

        // Thest the methods ability to return the required results.
        System.out.println("---------- getStrValues ------------");
        System.out.println("Demonstrates showing array contents");
        System.out.println(str1.getStrValues());
        System.out.println("-----------------------------------\n");

    }   // End of TEST2

    // TEST3 - ADD ON END
    private static void testAddOnEnd() {

        // Instantiation of the MyString object
        MyString str1 = new MyString(new char[]{'h', 'e', 'l', 'l', 'o'});

        // Test methos by calling it and inputting the required
        // peramiter and printing the result to screen.
        System.out.println("------------ testAddOnEnd -------------");
        System.out.println("Demonstrates adding a char to the array");
        str1.addOnEnd('w');
        System.out.println(str1.getStrValues());
        System.out.println("---------------------------------------\n");

    }   // End of TEST3

    // TEST4 - GET SUB STRING
    private static void testGetSubString() {

        // Instantiation of the MyString object
        MyString str1 = new MyString(new char[]{'h', 'e', 'l', 'l', 'o'});

        // Test method by entering a valid character position.
        System.out.println("--------- testGetSubString ----------");
        System.out.println("Demonstrates showing array sub string");
        System.out.println("Position entered = 3");
        System.out.println(str1.getSubString(3));
        System.out.println("--------------------------------------\n");
        // Test method by entering an invalid character position.
        System.out.println("---------- testGetSubString -----------");
        System.out.println("Trying to use an out of bounds position");
        System.out.println("Position entered = 3");
        try {
            str1.getSubString(6);                                           // Including the test within a try/catch
        } catch (IndexOutOfBoundsException e) {                             // to keep program running.
            System.out.println(e);                                          // Prints the caught error to screen
        }
        System.out.println("--------------------------------------\n");

    }   // End of TEST4

    // TEST5 - LENGTH
    private static void testLengh() {

        // Instantiation of the MyString object
        MyString str1 = new MyString(new char[]{'h', 'e', 'l', 'l', 'o'});

        // Test method by calling it and outputting the result.
        System.out.println("--------------- testLengh ---------------");
        System.out.println("Calling method to display length of array");
        System.out.println("Array Contents: ");
        System.out.println(str1.getStrValues());
        System.out.println("Length: " + str1.length());
        System.out.println("-----------------------------------------\n");
    }   // End of TEST5

    // TEST6 - REPLACE
    private static void testRepalce() {

        // Instantiation of the MyString object
        MyString str1 = new MyString(new char[]{'h', 'e', 'l', 'l', 'o'});

        // Test method by entering in required parameters
        // and printing the results to screen.
        System.out.println("---------- testRepalce -----------");
        System.out.println("Calling method to replace h with y");
        System.out.println("Array Contents: ");
        System.out.println(str1.getStrValues());
        str1.replace('h', 'y');
        System.out.println("Array Contents: ");
        System.out.println(str1.getStrValues());
        System.out.println("------------------------------------\n");

    }   // End of TEST6

    // TEST7 - FIND CHAR
    private static void testFindChar() {

        // Instantiation of the MyString object
        MyString str1 = new MyString(new char[]{'h', 'e', 'l', 'l', 'o'});

        // Test method by entering in required parameter
        // and printing the results to screen.
        System.out.println("---------- testFindChar -----------");
        System.out.println("Calling method to find a given char");
        System.out.println("Array Contents: ");
        System.out.println(str1.getStrValues());
        System.out.println("Postion of letter O: "  + str1.findChar('o'));
        System.out.println("-----------------------------------\n");

    }   // End of TEST7

    // TEST8 - REV ORDER
    private static void testRevOrder() {

        // Instantiation of the MyString object
        MyString str1 = new MyString(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println("------------- testRevOrder --------------");
        System.out.println("Current state of array");
        System.out.println("Array Contents: ");
        System.out.println(str1.getStrValues());
        System.out.println("-----------------------------------------");
        System.out.println("Calling method to reverse order of string");
        str1.revOrder();
        System.out.println("State of array, after reverse");
        System.out.println("Array Contents: ");
        System.out.println(str1.getStrValues());
        System.out.println("-----------------------------------------\n");

    }   // End of TEST8

    // TEST9 - COPY STRING
    private static void testCopyStr() {

        // Using try/catch again to collect an expected error
        try {
            // Instantiation of the MyString objects
            MyString str1 = new MyString(new char[]{'h', 'e', 'l', 'l', 'o'});
            MyString str2 = str1.copyString();

            // Testing method by calling it to copy a populated array
            // and printing the results to screen.
            System.out.println("------------- testCopyStr --------------");
            System.out.println("Current state of array");
            System.out.println("Array Contents: ");
            System.out.println(str1.getStrValues());
            System.out.println("----------------------------------------");
            System.out.println("Original array Contents: ");
            System.out.println(str1.getStrValues());
            System.out.println("Copied array Contents: ");
            System.out.println(str2.getStrValues());
            System.out.println("----------------------------------------");

            // Testing validation by calling method to copy an empty array.
            MyString str3 = new MyString(new char[]{});
            str3.copyString();

        } catch (NullPointerException n) {
            // Catching error and printing to the screen
            System.out.println("When trying to copy an empty array\n");
            System.out.println(n);
        }

    }   // End of TEST9

    // TEST10 - APPEND
    private static void testAppend() {

        // Instantiation of the MyString object
        MyString str1 = new MyString(new char[]{'h', 'e', 'l', 'l', 'o'});

        // Displaying the start state of the array, before method call.
        System.out.println("------------- testAppend --------------");
        System.out.println("Current state of array");
        System.out.println("Array Contents: ");
        System.out.println(str1.getStrValues());
        System.out.println("---------------------------------------");
        // Testing the method by calling it, adding the required parameters
        // and displaying the results to the screen.
        str1.append(new char[] {' ', 't', 'h', 'e', 'r', 'e', '!'});
        System.out.println("Calling method to apply append method");
        System.out.println("State of array after calling append");
        System.out.println("Array Contents: ");
        System.out.println(str1.getStrValues());
        System.out.println("---------------------------------------");

    }   // End of TEST10

}   // End of TESTSTRING
