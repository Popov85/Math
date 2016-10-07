package com.goit.popov.math.floatp;

import com.goit.popov.math.OperationNumeric;

/**
 * Created by Andrey on 30.09.2016.
 */
public class OperationFloatInteger implements OperationNumeric<Float, Float, Integer> {

        public Float add(Float number1, Integer number2) {
                return number1+number2;
        }

        public Float subtract(Float number1, Integer number2) {
                return number1-number2;
        }

        public Float multiply(Float number1, Integer number2) {
                return number1*number2;
        }

        public Float divide(Float number1, Integer number2) {
                return number1/number2;
        }
}
