package com.goit.popov.math;

/**
 * Universal implementation of numeric Operation interface.
 *
 * May lose some type-specific information.
 *
 * @author Andrey Popov
 * @version 1.0
 */
public class OperationUniversal implements OperationNumeric<Number, Number, Number> {

        public Number add(Number n1, Number n2) {
                return (n1.doubleValue() + n2.doubleValue());
        }

        public Number subtract(Number n1, Number n2) {
                return (n1.doubleValue() - n2.doubleValue());
        }

        public Number multiply(Number n1, Number n2) {
                return (n1.doubleValue() * n2.doubleValue());
        }

        public Number divide(Number n1, Number n2) {
                return (n1.doubleValue() / n2.doubleValue());
        }
}
