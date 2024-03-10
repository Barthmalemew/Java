package linkedlist;

public class LinkedList{
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void insertAfter(int b, int a) { 		
		Node newNode = new Node(a);
		Node tempNode = head;
	
		while (tempNode != null) {
			if(tempNode.data == b) {
				newNode.next = tempNode.next;
				tempNode.next = newNode;
				return;
			}
			tempNode = tempNode.next;
		}
		if(tempNode == null){
			System.err.println("Cannot insert after a non existent element");
			return;
		}
	}
	
	public void remove(int a) {
		Node tempNode = head;
		Node previousNode = null;
		
		if(tempNode != null && tempNode.data == a) {
			head = tempNode.next;
			return;
		}
		
		while (tempNode != null && tempNode.data != a) {
			previousNode = tempNode;
			tempNode = tempNode.next;
		}
		
		if(tempNode == null) {
			System.err.println("cannot remove nonexistant element");
			return;
		}
		previousNode.next = tempNode.next;
	}
	
	public void append(int a) {
		Node newNode = new Node(a);
	
		if(head == null) {
			head = new Node(a);
			return;
		}
		
		newNode.next = null;
		
		Node lastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			
		}
		
		lastNode.next = newNode;
		return;
	}
	
	public void prepend(int a) {
		Node newNode = new Node(a);
		
		newNode.next = head;
		
		head = newNode;
	}
	
	public boolean contains(int a) {
		Node tempNode = head;
		
		while(tempNode.next != null) {
			if(tempNode.data == a) {
				System.out.println("data found.");
				return true;
			}
			tempNode = tempNode.next;
		}
		System.out.println("data cannot be found.");
		return false;
	}
	
	public int getLength() {
		int size = 0;
		
		while (head != null) {
			head = head.next;
			size++;
		}
		System.out.print("Length of list is: " + size);
		return size;
	}
	
	public boolean isEmpty() {
		if(head == null) {
			System.out.println("List is empty");
			return true;
		}else {
			System.out.println("List is not empty");
			return false;
		}
	}
	
	public void clear() {
		head = null;
		return;
	}
	
	public void display() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println("end");
	}
}