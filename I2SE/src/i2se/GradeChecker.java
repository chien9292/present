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
public class GradeChecker {
    
    public int checkPassed(double grade) {
        if (grade > 10)
            return 2;
        else if (grade >= 5)
            return 1;
        else if (grade >= 0)
            return 0;
        return 2;
    }
}
