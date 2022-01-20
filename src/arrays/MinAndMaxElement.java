package arrays;

import java.util.Arrays;

public class MinAndMaxElement {

	public static void main(String[] args) {
        int[] arr = {6,2,7,4,5,1,2};
        int[] max = {Integer.MIN_VALUE};
        int[] min = {Integer.MAX_VALUE};
        Arrays.stream(arr).forEach(element -> {
        	if(element < min[0])
        		min[0] = element;
        	if(element > max[0])
        		max[0] = element;
        });
        System.out.println("Max :" + max[0] + " and Min :" + min[0]);
	}

}
