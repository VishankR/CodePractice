package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int size  = arr.length;
        for(int i = 0; (size - (1+i))-i >=1; i++){
            int str = arr[i];
            arr[i] = arr[size - (1 + i)];
            arr[size - (1 + i)] = str;
        }
        Arrays.stream(arr).forEach(System.out::print);
	}

}
