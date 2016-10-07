package com.goit.popov.math;

/**
 * Operation interface for arithmetic operations on numeric dataTypes
 *
 * @author Andrey Popov
 * @version 1.0
 */
public interface OperationNumeric<R extends Number, O1 extends Number, O2 extends Number> extends Operation<R , O1 , O2> {

        R add(O1 object1, O2 object2);

        R subtract(O1 object1, O2 object2);

        R multiply(O1 object1, O2 object2);

        R divide(O1 object1, O2 object2);
}
