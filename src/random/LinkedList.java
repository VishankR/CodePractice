package random;

public class LinkedList<T extends Node> {
	Node head = null;
	public void addNode(T node) {
		Node temp = head;
		if( head == null) {
			head = node;
		}else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void printLinkedList() {
		Node temp = head;
		if(head == null)
			System.out.println("List is empty.");
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
