/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import i2se.GradeChecker;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ib.enrique
 */
public class GradeTest {
    
    @Test
    public void testGrade() {
        GradeChecker checker = new GradeChecker();
        assertEquals(1, checker.checkPassed(10));
        assertEquals(1, checker.checkPassed(5));
        assertEquals(0, checker.checkPassed(4.99999999999));
        assertEquals(2, checker.checkPassed(11));
    }
}
