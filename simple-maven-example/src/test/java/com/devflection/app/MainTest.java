package com.devflection.app;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MainTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testReverseArray_nullArray_expectException() {
        // Arrange
        long[] array = null;

        // Assert
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array has to have at least 2 elements to be reversed..");

        // Act
        Main.reverseArray(array);
    }

    @Test
    public void testReverseArray_arrayWithOneItem_expectException() {
        // Arrange
        long[] array = {1L};

        // Assert
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array has to have at least 2 elements to be reversed..");

        // Act
        Main.reverseArray(array);
    }

    @Test
    public void testReverseArray_arrayWithMultipleItems_expectReversedArray() {
        // Arrange
        long[] array = {1L, 2L, 3L};

        // Act
        Main.reverseArray(array);

        // Assert
        assertArrayEquals(new long[]{3L, 2L, 1L}, array);
    }
}