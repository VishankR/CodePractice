package arraysRecursive;

import java.util.Arrays;

public class ReverseArrayRecur {

	public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        reverseArray(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::print);
	}
	
	public static int[] myReverseArray(int[] arr, int start, int end) {
		if(start == end -1) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			return arr;
		}else if(start == end) {
			return arr;
		}
		int[] returnedArr = myReverseArray(arr, start+1, end-1);
		int temp = returnedArr[start];
		returnedArr[start] = returnedArr[end];
		returnedArr[end] = temp;
		return returnedArr;
		
	}
	//GFG
	static void reverseArray(int arr[], int start, int end)
	{
	    if (start >= end)
	    return;     
	    int temp = arr[start];
	    arr[start] = arr[end];
	    arr[end] = temp;	     
	    // Recursive Function calling
	    reverseArray(arr, start + 1, end - 1);
	}
}
