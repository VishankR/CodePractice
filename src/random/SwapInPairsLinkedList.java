package random;

import java.util.stream.IntStream;

public class SwapInPairsLinkedList {

	public static void main(String[] args) {
		LinkedList<Node> list = new LinkedList<>();
		SwapInPairsLinkedList _instance = new SwapInPairsLinkedList();
		IntStream.range(0, 4).forEach(i -> {
			list.addNode(new Node(i));
		});
		list.head = _instance.swapPairs(list.head);
		list.printLinkedList();
	}

    public Node swapPairs(Node head) {
        if(head == null)
            return head;
        else if(head.next == null)
        	return head;
        Node lastPairHead = swapPairs(head.next.next);
        Node temp = head.next;
        head.next = lastPairHead;
        temp.next = head;
        head = temp;
        return head;
    }
}