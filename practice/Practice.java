package practice;

class CircularLinkedList {

	Node head;
	Node tail;

	private class Node {
		int data;
		Node next;

		Node(int val) {
			this.data = val;
			this.next = null;
		}
	}

	void insert(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		newNode.next = head;
		tail = newNode;
	}

	void display() {
		Node temp = head;
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head);
	}

	void delete(int val) {

		Node temp = head;

		if (head == null) {
			return;
		}
		if (head == tail) {
			head = null;
			tail = null;
			return;
		}
		if (head.data == val) {
			head = head.next;
			tail = head;
			return;
		}

		while (temp.next.data != val) {
			temp = temp.next;
		}
		temp.next = temp.next.next;

	}

}

class Practice {
	public static void main(String[] args) {

		CircularLinkedList circularLinkedList = new CircularLinkedList();

		circularLinkedList.insert(0);
		circularLinkedList.insert(1);
		circularLinkedList.insert(2);
		circularLinkedList.insert(3);
		circularLinkedList.delete(3);
		circularLinkedList.display();
	}

}
