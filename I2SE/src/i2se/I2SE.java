/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i2se;

/**
 *
 * @author ib.enrique
 */
public class I2SE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GradeChecker checker = new GradeChecker();
        System.out.println("10: " + checker.checkPassed(10));
        System.out.println("5: " + checker.checkPassed(5));
        System.out.println("1: " + checker.checkPassed(1));
        System.out.println("11: " + checker.checkPassed(11));
        
    }
    
}
