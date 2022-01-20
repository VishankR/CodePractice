package random;

import java.util.stream.IntStream;

public class ReorderList {

	public static void main(String[] args) {
		LinkedList<Node> list = new LinkedList<>();
		ReorderList _instance = new ReorderList();
		IntStream.range(0, 4).forEach(i -> {
			list.addNode(new Node(i));
		});
		_instance.reorderList(list.head);
		list.printLinkedList();
	}

	Node firstNode = null;
	Node tempNode = null;
   public void reorderList(Node head) {
       firstNode = head;
       tempNode = head;
       backtrackList(head);
   }
   public Node backtrackList(Node head){
       if(head.next == null)
           return head;
      Node returnedNode = backtrackList(head.next);
       if(head == tempNode) {
    	   head.next = null;
           return head; 
       }
       Node temp = tempNode.next;
       tempNode.next = returnedNode;
       head.next = null;
       returnedNode.next = temp;
       tempNode = temp;
       return returnedNode;
   }
}
