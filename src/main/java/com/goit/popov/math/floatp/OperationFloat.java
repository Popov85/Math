package com.goit.popov.math.floatp;

import com.goit.popov.math.OperationNumeric;

/**
 * Created by Andrey on 29.09.2016.
 */
public class OperationFloat implements OperationNumeric<Float, Float, Float> {

        public Float add(Float number1, Float number2) {
                return number1+number2;
        }

        public Float subtract(Float number1, Float number2) {
                return number1-number2;
        }

        public Float multiply(Float number1, Float number2) {
                return number1*number2;
        }

        public Float divide(Float number1, Float number2) {
                return number1/number2;
        }



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
