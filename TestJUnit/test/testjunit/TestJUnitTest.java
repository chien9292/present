/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tran Minh Chien
 */
public class TestJUnitTest {
    
    public TestJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of checkGrade method, of class TestJUnit.
     */
    @Test
    public void testCheckGrade() {
        System.out.println("checkGrade");
        TestJUnit tj = new TestJUnit();
        assertEquals(1, tj.checkGrade(10));
        assertEquals(1, tj.checkGrade(5));
        assertEquals(0, tj.checkGrade(4.9));
        assertEquals(0, tj.checkGrade(0));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
