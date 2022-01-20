package utilities;

import java.util.Arrays;

public class CreateMaxHeapFromArray {
	static int[] maxHeap;
	static int heapSize;
	public static void main(String[] args) {
        int[] arr = {6,2,7,4,5,1,2};
        createMaxHeap(arr);
	}

	public static int[] createMaxHeap(int[] arr) {
        int len  = arr.length;
        int startIndx = len/2 -1;
        for(int i = startIndx ; i >= 0; i--) {
        	heapify(arr, len, i);
        }
        maxHeap = arr;
        heapSize = arr.length;
        return arr;
	}
	private static void heapify(int[] arr, int len, int index) {
		int currentNodeIndx = index;
		int largestValueIndx = index;
		int leftChildIndx = 2 * index + 1;
		int rightChildIndx = 2 * index + 2;
		if(leftChildIndx < len && arr[leftChildIndx] > arr[largestValueIndx]) {
			largestValueIndx = leftChildIndx;
		}
		if(rightChildIndx < len && arr[rightChildIndx] > arr[largestValueIndx]) {
			largestValueIndx = rightChildIndx;
		}
		if(largestValueIndx!=currentNodeIndx) {
			int temp = arr[currentNodeIndx];
			arr[currentNodeIndx] = arr[largestValueIndx];
			arr[largestValueIndx] = temp;
			heapify(arr, len, largestValueIndx);
		}
	}
	public static int getMax() {
		return maxHeap[0];
	}
	public static int extractMax() {
		int max = maxHeap[0];
		maxHeap[0] = maxHeap[--heapSize];
		maxHeap = Arrays.copyOf(maxHeap, heapSize);
        int startIndx = heapSize/2 -1;
        for(int i = startIndx ; i >= 0; i--) {
        	heapify(maxHeap, heapSize, i);
        }
		return max;
	}
	public static void insert(int[] arr, int len, int index) {
	}
    public static void printHeap()
    {
        for (int i = 0; i < heapSize; ++i)
            System.out.print(maxHeap[i] + " ");
        System.out.println();
    }
}
