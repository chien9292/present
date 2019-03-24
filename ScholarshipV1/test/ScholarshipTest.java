/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import scholarshipv1.Scholarship;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author giao-lang
 */
public class ScholarshipTest {
    
    public ScholarshipTest() {
    }
    
    @Test
    public void testGetAward() {
        assertEquals(-1, Scholarship.getAward(5.0));
        assertEquals(100, Scholarship.getAward(4.0));
        assertEquals(100, Scholarship.getAward(3.9));
        assertEquals(100, Scholarship.getAward(3.8)); //red, do co tinh bo test sai
        assertEquals(80, Scholarship.getAward(3.6));
        assertEquals(80, Scholarship.getAward(3.7));
        assertEquals(70, Scholarship.getAward(3.4));
        assertEquals(70, Scholarship.getAward(3.5));
        assertEquals(0, Scholarship.getAward(3.3));
        assertEquals(0, Scholarship.getAward(2.0));
        assertEquals(0, Scholarship.getAward(0));
        assertEquals(-1, Scholarship.getAward(-5.0));
    }
    
}
