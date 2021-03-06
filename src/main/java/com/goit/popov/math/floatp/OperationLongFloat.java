package com.goit.popov.math.floatp;

import com.goit.popov.math.OperationNumeric;

/**
 * Created by Andrey on 30.09.2016.
 */
public class OperationLongFloat implements OperationNumeric<Float, Long, Float> {

        public Float add(Long number1, Float number2) {
                return number1+number2;
        }

        public Float subtract(Long number1, Float number2) {
                return number1-number2;
        }

        public Float multiply(Long number1, Float number2) {
                return number1*number2;
        }

        public Float divide(Long number1, Float number2) {
                return number1/number2;
        }
}
