package com.goit.popov.math.longp;

import com.goit.popov.math.OperationNumeric;

/**
 * Created by Andrey on 30.09.2016.
 */
public class OperationLongInteger implements OperationNumeric<Long, Long, Integer> {

        public Long add(Long number1, Integer number2) {
                return number1+number2;
        }

        public Long subtract(Long number1, Integer number2) {
                return number1-number2;
        }

        public Long multiply(Long number1, Integer number2) {
                return number1*number2;
        }

        public Long divide(Long number1, Integer number2) {
                return number1/number2;
        }
}
