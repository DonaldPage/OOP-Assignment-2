package Stack;

/* MY STACK CLASS
 *
 * Designed be suitable for the development of a Forth environment.
 * The stack accepts integers only and supports Push and Pop operations.
 * The arithmetic operators Add, Sub, Mul, Div, and Mod are included.
 * With a number of the standard Forth stack based operations, e.g Dup, Swap and Drop.
 * Each method has a form validation and error handling.
 *
 */

public class MyStack {

    // Class Variables
    private int topOfStack;
    private int sizeOfStack;
    private int[] stackArray;

    // Class Constructor
    // When instanciated, will require a value to specify size of stack (arrey)
    public MyStack(int size) {
        this.sizeOfStack = size;                    // Argument within constructor, to set sizeOfStack
        stackArray = new int[sizeOfStack];          // New instance of stackArray to the value of sizeOfStack
        topOfStack = 0;                             // Sets the possition of initial entry to stack to 0

    }   // End of CONSTRUCTOR


    // ENABLING PUSH AND POP OPERATIONS
    // PUSH operator - Requires an integer, checks if the stack is full
    //                 and inserts an integer to the top of the stack.
    public void push(int data) {
        System.out.println("\nPUSH REQUEST");                      // Print details of operation to screen
        // Validation
        if (topOfStack == sizeOfStack) {                         // Equates to the stack beinf full
            enlargeStack();
        }
        stackArray[topOfStack] = data;                           // Insert data to top of stack
        System.out.println("Push value: " + data                 // Prints the value to screen
                + " to position " + topOfStack);                 // Prints the position to screen
        ++topOfStack;                                            // Increment insertion pointer (topOfStack)


    }   // End of PUSH

    // POP operator - Remove a value from the stack, check if the stack is empty
    //                and deduce the size of the stack, once value is popped.
    public int pop() {
        System.out.println("\nPOPPED VALUE DETAILS");           // Print details of operation to screen
        // Validation
        if (topOfStack == 0) {
            int stackEmpty = 0;                                 // Set stackEmpty to 0, so can be returned
            try {
                throw new IndexOutOfBoundsException             // Thows an error if the stack is already empty
                        ("MyStack is empty, there are "
                                + stackEmpty + " to pop!");     // Includes the empty stack value in error message
            } catch (IndexOutOfBoundsException e) {             // Catches the error, assigns it to a variable
                System.out.println(e.getMessage());             // Prints error to screen
            }
            return stackEmpty;                                  // Return value of stackEmpty
        } else {
            --topOfStack;                                       // Moves top of stack pointer to previous value
            int popppedData = stackArray[topOfStack];           // Retrieves the value at the top of the stack
            System.out.println("Popped Value: " + popppedData); // Prints the popped value to screen
            --sizeOfStack;                                      // Reduces the size of the stack
            return popppedData;                                 // Returns
        }

    }   // End of POP

    // ARITHMATIC OPERATORS

    // ADD operator - Pop two values from top of stack, add both values
    //                and push the result back onto the stack.
    public void addOperator() {
        System.out.println("\nADD OPERATION IN PROGRESS");            // Print details of operation to screen
        if (topOfStack <= 1) {
            try {
                throw new IndexOutOfBoundsException                   // Thows an error if not enough values
                        ("ERROR! " +
                                "Two values needed - Add not completed");         // Empty error message
            } catch (IndexOutOfBoundsException e) {                   // Catches the error, assigns it to a variable
                System.out.println(e.getMessage());                   // Prints error to screen
            }
        } else {
            int x = pop();                                            // Store popped value in x
            int y = pop();                                            // Store popped value in y
            int z = x + y;                                            // Add x and y values and store result in z
            System.out.println("\n  Addition Details");               // Print contect to screen
            System.out.println("  -------------------------");        // Prints seporating line
            System.out.println("  Value " + x +
                    " + value " + y + " = " + z);         // Print details of sum to screen
            System.out.println("  -------------------------\n");      // Prints seporating line
            sizeOfStack++;                                            // Increase stack size to accomdate result
            push(z);                                                  // Push the result onto the stack
        }
    }   // End of ADD

    // SUB operator - Pop two values from top of stack, subtract first value
    //                from the second and push the result back onto the stack
    public void subOperator() {
        System.out.println("\nSUBTRACTION OPERATION IN PROGRESS");    // Print details of operation to screen
        if (topOfStack <= 1) {
            try {
                throw new IndexOutOfBoundsException                   // Thows an error if not enough values
                        ("ERROR! " + "Two values needed - " +
                                "subtraction not completed");         // Empty error message
            } catch (IndexOutOfBoundsException e) {                   // Catches the error, assigns it to a variable
                System.out.println(e.getMessage());                   // Prints error to screen
            }
        } else {
            int x = pop();                                            // Store popped value in x
            int y = pop();                                            // Store popped value in y
            int z = x - y;                                            // Subtract x from y and store result in z
            System.out.println("\n  Subtration Details");             // Print contect to screen
            System.out.println("  -------------------------");        // Prints seporating line
            System.out.println("  Value " + x +
                    " - value " + y + " = " + z);                     // Print details of sum to screen
            System.out.println("  -------------------------\n");      // Prints seporating line
            sizeOfStack++;                                            // Increase stack size to accomdate result
            push(z);                                                  // Push the result onto the stack
        }
    }   // End of SUB

    // MUL operator - Pop two values from top of stack, multiply first value
    //                by the second and push the result back onto the stack
    public void mulOperator() {
        System.out.println("\nMULTIPLICATION OPERATION IN PROGRESS"); // Print details of operation to screen
        if (topOfStack <= 1) {
            try {
                throw new IndexOutOfBoundsException                   // Thows an error if not enough values
                        ("ERROR! " + "Two values needed - " +
                                "multiplication not completed");      // Empty error message
            } catch (IndexOutOfBoundsException e) {                   // Catches the error, assigns it to a variable
                System.out.println(e.getMessage());                   // Prints error to screen
            }
        } else {
            int x = pop();                                            // Store popped value in x
            int y = pop();                                            // Store popped value in y
            int z = x * y;                                            // Multiply x by y and store result in z
            System.out.println("\n  Multiplication Details");         // Print contect to screen
            System.out.println("  -------------------------");        // Prints seporating line
            System.out.println("  Value " + x +
                    " X value " + y + " = " + z);                     // Print details of sum to screen
            System.out.println("  -------------------------\n");      // Prints seporating line
            sizeOfStack++;                                            // Increase stack size to accomdate result
            push(z);                                                  // Push the result onto the stack
        }

    }   // End of MUL

    // DIV operator - Pop two values from top of stack, divide first value
    //                by the second and push the result back onto the stack
    public void divOperator() {
        System.out.println("\nDIVISION OPERATION IN PROGRESS");       // Print details of operation to screen
        if (topOfStack <= 1) {
            try {
                throw new IndexOutOfBoundsException                   // Thows an error if not enough values
                        ("ERROR! " + "Two values needed - " +
                                "Division not completed");            // Empty error message
            } catch (IndexOutOfBoundsException e) {                   // Catches the error, assigns it to a variable
                System.out.println(e.getMessage());                   // Prints error to screen
            }
        } else {
            int x = pop();                                            // Store popped value in x
            int y = pop();                                            // Store popped value in y
            int z = y / x;                                            // Divide x by y and store result in z
            System.out.println("\n  Division Details");               // Print contect to screen
            System.out.println("  -------------------------");        // Prints seporating line
            System.out.println("  Value " + y +
                    " / value " + x + " = " + z);                     // Print details of sum to screen
            System.out.println("  -------------------------\n");      // Prints seporating line
            sizeOfStack++;                                            // Increase stack size to accomdate result
            push(z);                                                  // Push the result onto the stack
        }

    }   // End of DIV

    // MOD operator - Pop two values from top of stack, devide first value by the
    //                second and push the modulo (remaining number) back onto the stack
    public void modOperator() {
        System.out.println("\nMODULO OPERATION IN PROGRESS");         // Print details of operation to screen
        if (topOfStack <= 1) {
            try {
                throw new IndexOutOfBoundsException                   // Thows an error if not enough values
                        ("ERROR! " + "Two values needed - " +
                                "Modulo not completed");              // Empty error message
            } catch (IndexOutOfBoundsException e) {                   // Catches the error, assigns it to a variable
                System.out.println(e.getMessage());                   // Prints error to screen
            }
        } else {
            int x = pop();                                            // Store popped value in x
            int y = pop();                                            // Store popped value in y
            int z = y % x;                                            // Divide y by x and store modulo in z
            System.out.println("\n  Modulo Details");                 // Print contect to screen
            System.out.println("  -------------------------");        // Prints seporating line
            System.out.println("  Value " + y +
                    " / value " + x + " modulo " + z);                // Print details of sum to screen
            System.out.println("  -------------------------\n");      // Prints seporating line
            sizeOfStack++;                                            // Increase stack size to accomdate result
            push(z);                                                  // Push the result onto the stack
        }

    }   // End of MOD

    // FOURTH BASED STACK OPERATIONS

    // DUP Operator - Pop Value from top of stack, duplicate the value
    //                and Push both values back onto the stack.
    public void dupOperator() {
        if (topOfStack == 0) {
            int stackEmpty = 0;                                 // Set stackEmpty to 0, so can be returned
            try {
                throw new IndexOutOfBoundsException             // Thows an error if the stack is already empty
                        ("MyStack is empty, there are "
                                + stackEmpty +
                                " values to duplicate!");             // Includes the empty stack value in error message
            } catch (IndexOutOfBoundsException e) {             // Catches the error, assigns it to a variable
                System.out.println(e.getMessage());             // Prints error to screen
            }
        } else {
            System.out.println("\nDUPLICATION OPERATION " +
                    "IN PROGRESS");                     // Print details of operation to screen
            int x = pop();                                          // Pops the value from top of stack
            push(x);                                                // Pushes the popped value back onto the stack
            push(x);                                                // Repeats the push to "duplicate" the value
        }

    }   // End of DUP

    // SWAP operator - Swap the position of the two top
    //                 values in the stack.
    public void swapOperator() {
        System.out.println("\nSWAP OPERATION IN PROGRESS");     // Print details of operation to screen
        if (topOfStack <= 1) {
            try {
                throw new IndexOutOfBoundsException             // Thows an error if not enough values
                        ("ERROR! " + "Two values needed - " +
                                "Swap not completed");          // Empty error message
            } catch (IndexOutOfBoundsException e) {             // Catches the error, assigns it to a variable
                System.out.println(e.getMessage());             // Prints error to screen
            }
        } else {
            int x = pop();
            int y = pop();
            push(x);
            push(y);
        }

    } // End of SWAP

    // DROP operator - Drop the value held at the top of the stack
    public void dropOperator() {
        System.out.println("\nDROP OPERATION IN PROGRESS");     // Print details of operation to screen
        if (topOfStack <= 1) {
            try {
                throw new IndexOutOfBoundsException             // Thows an error if not enough values
                        ("ERROR! " + "No Values to drop" +
                                " - Drop not completed");       // Empty error message
            } catch (IndexOutOfBoundsException e) {             // Catches the error, assigns it to a variable
                System.out.println(e.getMessage());             // Prints error to screen
            }
        } else {
            --topOfStack;                                       // Moves top of stack pointer to previous value
            System.out.println("\nDropping value " +
                    stackArray[topOfStack] +
                    " from top of stack");                    // Print details of operation to screen
            --sizeOfStack;                                      // Reduces the size of the stack
        }

    }   // End of DROP

    // UTILITIES

    // OUTPUT - Displays the details of the current stack to screen,
    //          formatted to show relevant details.
    public void outputStack() {
        System.out.println("\n  DETAILS FOR CURRENT STACK");
        System.out.println("  " + sizeOfStack
                + " positions available in stack");  // Prints the size of the stack
        System.out.println(" " + "--------------------------"); // Prints seporating line
        for (int i = sizeOfStack -1; i > -1; i--) {             // Loop through array
            System.out.println("|" + "\tposition: " + i +       // Prints the stack position
                    "\tValue: " + stackArray[i] + "   |");      // Prints the value in that position
        }
        System.out.println(" " + "--------------------------"); // Prints seporating line

    }   // End of OUTPUT

    // ENLARGE STACK - When stack is full (or empty) enlarges the stack size,
    //                 by copying old array and pasting into a new array.
    public void enlargeStack() {
        int newStackSize = sizeOfStack + 1;             // take the old sizeOfStack and increment by 1
        int[] newStackArray = new int[newStackSize];    // Declare new stackArray with increased stack size
        for(int i = 0; i < newStackSize - 1; i++) {     // Loop through array
            newStackArray[i] = stackArray[i];           // Copy stackArray values to newStackArray
        }
        stackArray = newStackArray;                     // Overwrite old array with newStackArray
        sizeOfStack = newStackArray.length;             // Set new sizeOfStack length

    } // End of ENLARGE STACK


}   // End of BESPOKE STACK
