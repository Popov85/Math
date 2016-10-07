package com.goit.popov.math.longp;

import com.goit.popov.math.OperationNumeric;

/**
 * Created by Andrey on 30.09.2016.
 */
public class OperationIntegerLong implements OperationNumeric<Long, Integer, Long> {

        public Long add(Integer number1, Long number2) {
                return number1+number2;
        }

        public Long subtract(Integer number1, Long number2) {
                return number1-number2;
        }

        public Long multiply(Integer number1, Long number2) {
                return number1*number2;
        }

        public Long divide(Integer number1, Long number2) {
                return number1/number2;
        }
}
