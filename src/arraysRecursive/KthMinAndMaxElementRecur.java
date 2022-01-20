package arraysRecursive;

import utilities.CreateMaxHeapFromArray;

public class KthMinAndMaxElementRecur {

	public static void main(String[] args) {
        int[] arr = {6,2,7,4,5,1,2};
        CreateMaxHeapFromArray.createMaxHeap(arr);
        int k = 5;
        int kthMaxElement = getKthminAndMax(k-1);
        System.out.println(kthMaxElement);
	}

	public static int getKthminAndMax(int k) {
		if(k == 0) {
			return CreateMaxHeapFromArray.extractMax();
		}
		CreateMaxHeapFromArray.extractMax();
		return getKthminAndMax(k - 1);
	}
}
