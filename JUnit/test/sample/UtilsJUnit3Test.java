/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.Scanner;
import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class UtilsJUnit3Test {

    public UtilsJUnit3Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
//        super.setUp();
        System.out.println("* UtilsJUnit3Test: setUp() method");
    }
//

    @After
    public void tearDown() {
//        super.tearDown();
        System.out.println("* UtilsJUnit3Test: tearDown() method");
    }

//    @Before
//    public void setUp() {
//        super.setUp();
//        System.out.println("* UtilsJUnit3Test: setUp() method");
//    }
//
//    @After
//    public void tearDown() {
//        super.tearDown();
//        System.out.println("* UtilsJUnit3Test: tearDown() method");
//    }
    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void testHelloWorld() {
        System.out.println("* UtilsJUnit3Test: test method 1 - testHelloWorld()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }
//    @Tes
//    public void testConcatWords() {
//        System.out.println("concatWords");
//        String[] words = null;
//        String expResult = "";
//        String result = Utils.concatWords(words);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test
    public void testWithTimeout() throws InterruptedException, TimeoutException {
        System.out.println("* UtilsJUnit3Test: test method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + '!');

        Thread testThread = new Thread() {
            @Override
            public void run() {
                System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
            }
        };
        testThread.start();
        Thread.sleep(1000);
        testThread.interrupt();

        if (testThread.isInterrupted()) {
            throw new TimeoutException("the test took too long to complete");
        }
    }

    @Test
    public void testExpectedException() {
        System.out.println("* UtilsJUnit3Test: test method 3 - testExpectedException()");
        try {
            final int factorialOf = -5;
            System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
            fail("IllegalArgumentException was expected");
        } catch (IllegalArgumentException ex) {
        }
    }
//    @Test
//    public void testComputeFactorial() {
//        System.out.println("computeFactorial");
//        int number = 0;
//        String expResult = "";
//        String result = Utils.computeFactorial(number);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of normalizeWord method, of class Utils.
     */
//    @Test
//    public void testNormalizeWord() {
//        System.out.println("normalizeWord");
//        String word = "";
//        String expResult = "";
//        String result = Utils.normalizeWord(word);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    @Test
    public void testTemporarilyDisabled() throws Exception {
        System.out.println("* UtilsJUnit3Test: test method 4 - checkExpectedException()");
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }

    @Test
    public void DISABLED_testTemporarilyDisabled() throws Exception {
        System.out.println("* UtilsJUnit3Test: test method 4 - checkExpectedException()");
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }

    @Test
    public void callMyTeam() throws Exception {
        System.out.println("Call my Team method 5 - checkExpectedException");
        System.out.println("1. Duong");
        System.out.println("2. Hung");
        System.out.println("3. Thang");
        System.out.println("4. Tuan");
        System.out.println("5. Chien");
    }

//    @Test
//    public void checkInteger() throws Exception {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            Thread th = new Thread() {
//                @Override
//                public void run() {
//                    System.out.println("Enter number for you check");
//                    String s = sc.nextLine();
//                    if (Integer.parseInt(s) > 0) {
//                        System.out.println("A number");
//                    } else {
//                        System.out.println("Not a number");
//                    }
//                }
//            };
//            th.start();
//            th.sleep(10000);
//        }
//    }
}
