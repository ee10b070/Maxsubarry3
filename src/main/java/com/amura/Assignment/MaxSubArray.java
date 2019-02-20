package com.amura.Assignment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.amura.Assignment.model.Response;

/**
 * 
 * Class to find maximum sum of the sub array from given array.
 * 
 * @author ravinder_k
 *
 */
public class MaxSubArray {

    // private static final Logger LOGGER = LoggerFactory.getLogger(MaxSubArray.class);

    /**
     * 
     * Method to find max sub array.
     * 
     * @param input
     */
    static Response findMaxSubArray(String[] input) {
        // LOGGER.info("Start of the " + LOGGER.getName());
        System.out.println("Started the findMaxSubArray()");
        int len = input.length;
        int tempMax = 0;
        int max = 0;
        int startIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < len; i++) {
            tempMax = tempMax + Integer.parseInt(input[i]);
            if (tempMax < 0) {
                tempMax = 0;
                startIndex = i;
            } else if (tempMax > max) {
                max = tempMax;
                lastIndex = i;
            }
        }
        System.out.println("Start Index :" + (startIndex + 1));
        System.out.println("Last Index: " + lastIndex);
        System.out.println("Length :" + (lastIndex - startIndex));
        System.out.println("Sum :" + max);
        for (int j = startIndex + 1; j <= lastIndex; j++) {
            System.out.print(input[j] + " ");
        }
        System.out.println("\n");
        System.out.println("Completted findMaxSubArray()");
        
        return new Response(startIndex+1,lastIndex,(lastIndex - startIndex),max);

    }

}
