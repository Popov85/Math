package com.goit.popov.math.longp;

import com.goit.popov.math.OperationNumeric;

/**
 * Operation implementation for arithmetic operations on Longs
 *
 * @author Andrey Popov
 * @version 1.0
 */
public class OperationLong implements OperationNumeric<Long, Long, Long> {

        public Long add(Long number1, Long number2) {
                return number1+number2;
        }

        public Long subtract(Long number1, Long number2) {
                return number1-number2;
        }

        public Long multiply(Long number1, Long number2) {
                return number1*number2;
        }

        public Long divide(Long number1, Long number2) {
                return number1/number2;
        }

}
