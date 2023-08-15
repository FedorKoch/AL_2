public class Node {
	int data;
	Node prev;
	Node next;

	public Node(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

class DoublyLinkedList {
	Node head;
	Node tail;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

    public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

    public void reverseList() {
		if (head == null || head.next == null) {
			return;
		}
		Node previous = null;
		Node current = head;
		while (current != null) {
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		head = previous;
	}
}