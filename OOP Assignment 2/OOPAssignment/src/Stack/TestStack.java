package Stack;

public class TestStack {

    public static void main(String[] args) {                    // Entry point, needed to run class

                    /* CALLING THE TESTING METHODS FOR ALL METHODS IN BESPOKE STACK
                       ============================================================ */

        // Test One - PUSH Operation:                      Test Two - POP Operation, empty stack:
        //  * Create a new stack                            * Create a new stack
        //  * Set a value to size of stack                  * Try and pop from an empty stack
        //  * Push values to every position                 * Push two values to the stack
        //                                                  * Pop one value off the stack
        //                                                  * Test whether the stack size is reduced
        //testPush();
       //                                                  testPopOne();

        // Test Three - POP Operation, full stack           Test Four - ADD Operation:
        //  * Push two values to the stack                   * Create a new stack
        //  * Pop one value off of the stack                 * Push two values to the stack
        //  * Test whether the stack size is reduced         * Display stack details
        //  * Show stack gets shorter everytime you pop      * Perform Add funtion
        //  * Pop another value off of the stack             * View results and stack details
        //  * Try to pop one more value off of the stack
        //  * Show error handling, via message
       //                                                  testAdd();
        //testPopTwo();

        // Test Five - SUBTRACT Operation:                 Test Six - MULTIPLY Operation:
        //  * Create a new stack                            * Create a new stack
        //  * Push two values to the stack                  * Push two values to the stack
        //  * Display stack details                         * Display stack details
        //  * Perform Subtract funtion                      * Perform Multiply funtion
        //  * View results and stack details                * View results and stack details
        //                                                 testMul();
        //testSub();

        // Test Seven - DIVIDE Operation:                  Test Eight - MODULO Operation:
        //  * Create a new stack                            * Create a new stack
        //  * Push two values to the stack                  * Push two values to the stack
        //  * Display stack details                         * Display stack details
        //  * Perform Subtract funtion                      * Perform Subtract funtion
        //  * View results and stack details                * View results and stack details
        //                                                  testMod();
        testDiv();

        // Test Nine - DUPLICATE Operation:                Test Ten - MODULO Operation:
        //  * Create a new stack                            * Create a new stack
        //  * Show stack is empty                           * Test validation by attempting mod
        //  * Push a value onto the stack                   * Push values to the stack
        //  * Show the value has been added                 * Display current stack details
        //  * Perform Duplicate function                    * Perform Modulo function
        //  * Show both value added to stack                * Display stack details after modulo
        //testDup();
        //                                                  testSwap();

        // Test Eleven - DROP Operation:                    Test Twelve - Multiple Operation:
        //  * Create new stack                               * Create a new stack
        //  * Test validation by tempting drop               * Test Validation
        //  * Push values to the stack                       * Perform multiple operations in sequence
        //  * Perform Drop function                          * Display results after each operation
        //  * Display results of the test                    * Confirm multiple operations can be
        //                                                     performed in random sequence without
        //                                                     throwing unexpected errors
                                                             //multiTest();
        //testDrop();
    }

    // TEST ONE
    private static void testPush() {

        MyStack test1 = new MyStack(3);

        test1.outputStack();
        test1.push(32);
        test1.push(507);
        test1.push(21);
        test1.push(21);
        test1.outputStack();
    }

    // TEST TWO
    private static void testPopOne() {

        MyStack test2 = new MyStack(2);

        test2.outputStack();
        test2.pop();
        test2.outputStack();
        test2.push(32);
        test2.push(50);
        test2.outputStack();
        test2.pop();
        test2.outputStack();

    }

    // TEST THREE
    private static void testPopTwo() {

        MyStack test3 = new MyStack(2);

        test3.push(100);
        test3.push(75);
        test3.outputStack();
        test3.pop();
        test3.outputStack();
        test3.pop();
        test3.pop();
        test3.outputStack();

    }

    // TEST FOUR
    private static void testAdd() {

        MyStack test4 = new MyStack(2);

        test4.push(10);
        test4.push(15);
        test4.outputStack();
        test4.addOperator();
        test4.outputStack();

    }

    // TEST FIVE
    private static void testSub() {

        MyStack test5 = new MyStack(2);

        test5.push(20);
        test5.push(15);
        test5.outputStack();
        test5.subOperator();
        test5.outputStack();

    }

    // TEST SIX
    private static void testMul() {

        MyStack test6 = new MyStack(2);

        test6.push(20);
        test6.push(15);
        test6.outputStack();
        test6.mulOperator();
        test6.outputStack();

    }

    // TEST SEVEN
    private static void testDiv() {

        MyStack test7 = new MyStack(2);

        test7.push(100);
        test7.push(4);
        test7.outputStack();
        test7.divOperator();
        test7.outputStack();

    }

    // TEST EIGHT
    private static void testMod() {

        MyStack test8 = new MyStack(2);

        test8.push(64);
        test8.push(19);
        test8.outputStack();
        test8.modOperator();
        test8.outputStack();
    }

    // TEST NINE
    private static void testDup() {

        MyStack test9 = new MyStack(0);

        test9.outputStack();
        test9.push(12);
        test9.outputStack();
        test9.dupOperator();
        test9.outputStack();

    }

    // TEST TEN
    private static void testSwap() {

        MyStack test10 = new MyStack(0);

        test10.swapOperator();
        test10.outputStack();
        test10.push(139);
        test10.push(58);
        test10.push(808);
        test10.push(32);
        test10.outputStack();
        test10.swapOperator();
        test10.outputStack();

    }

    // TEST ELEVEN
    private static void testDrop() {

        MyStack test11 = new MyStack(0);

        test11.dropOperator();
        test11.push(34);
        test11.push(4665);
        test11.push(56);
        test11.push(657);
        test11.outputStack();
        test11.dropOperator();
        test11.outputStack();

    }

    // TEST TWELVE
    private static void multiTest() {

        MyStack test12 = new MyStack(0);

        test12.pop();
        test12.push(467);
        test12.push(28);
        test12.outputStack();
        test12.divOperator();
        test12.outputStack();
        test12.push(65);
        test12.outputStack();
        test12.swapOperator();
        test12.outputStack();
        test12.addOperator();
        test12.outputStack();
        test12.push(543);
        test12.push(56);
        test12.outputStack();
        test12.dropOperator();
        test12.outputStack();

    }
}
