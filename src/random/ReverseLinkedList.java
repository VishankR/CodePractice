package random;

import java.util.stream.IntStream;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Node> list = new LinkedList<>();
		ReverseLinkedList _instance = new ReverseLinkedList();
		IntStream.range(0, 4).forEach(i -> {
			list.addNode(new Node(i));
		});
		list.head = _instance.reverse(list.head);
		list.printLinkedList();
	}
	public Node reverse(Node head) {
		if(head == null || head.next == null)
			return head;
		Node returnedNode = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return returnedNode;
	}
}
