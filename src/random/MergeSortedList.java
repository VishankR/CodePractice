package random;

import java.util.stream.IntStream;

public class MergeSortedList {

	public static void main(String[] args) {
		LinkedList<Node> list = new LinkedList<>();
		MergeSortedList _instance = new MergeSortedList();
		IntStream.range(0, 4).forEach(i -> {
			list.addNode(new Node(i));
		});
		//list.head = _instance.mergeSortedList(list.head);
		list.printLinkedList();
	}

	private Node mergeSortedList(Node first, Node second) {
		if(first == null) {
			return first;
		}
		if(second == null) {
			return second;
		}
		mergeSortedList(first.next, second.next);
		if(first.val < second.val) {
			second.next = first;
			first.next = null;
		}
		return null;
	}

}
