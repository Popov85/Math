package com.goit.popov.math.floatp;

import com.goit.popov.math.OperationNumeric;

/**
 * Created by Andrey on 30.09.2016.
 */
public class OperationIntegerFloat implements OperationNumeric<Float, Integer, Float> {

        public Float add(Integer number1, Float number2) {
                return number1+number2;
        }

        public Float subtract(Integer number1, Float number2) {
                return number1-number2;
        }

        public Float multiply(Integer number1, Float number2) {
                return number1*number2;
        }

        public Float divide(Integer number1, Float number2) {
                return number1/number2;
        }
}
