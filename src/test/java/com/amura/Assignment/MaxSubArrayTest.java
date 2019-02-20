package com.amura.Assignment;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import com.amura.Assignment.model.Response;

public class MaxSubArrayTest {

    @InjectMocks
    MaxSubArray maxSubArray;

    String[] input1 = {"-2", "1", "-3", "4", "-1", "2", "1", "-5", "4"};
    String[] input2 = {"-3", "4", "-2", "1", "5", "6", "-3"};

    @Before
    public void setup() {

    }

    @Test
    public void testMaxSubArrayInput1() {
        Response response = maxSubArray.findMaxSubArray(input1);
        assertEquals(response.getSum(), 6);
        assertEquals(response.getLength(), 4);
        assertEquals(response.getStartIndex(), 3);
    }


    @Test
    public void testMaxSubArrayInput2() {
        Response response = maxSubArray.findMaxSubArray(input2);
        assertEquals(response.getSum(), 14);
        assertEquals(response.getLength(), 5);
        assertEquals(response.getStartIndex(), 1);
    }

}
