package com.goit.popov.math;

/**
 * Operation interface for arithmetic operations on different dataTypes
 *
 * @author Andrey Popov
 * @version 1.0
 */
public interface Operation<R, O1, O2> {

        R add(O1 object1, O2 object2);

        R subtract(O1 object1, O2 object2);

        R multiply(O1 object1, O2 object2);

        R divide(O1 object1, O2 object2);
}
