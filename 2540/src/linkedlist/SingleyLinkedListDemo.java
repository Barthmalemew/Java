package linkedlist;



public class SingleyLinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		System.out.println("Append deminstration:");
		list.append(0);
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.display();
		
		System.out.println("Removal demonstration:");
		list.remove(2);
		list.remove(0);
		list.display();
		
		System.out.println("Prepend demonstration:");
		list.prepend(5);
		list.display();
		
		System.out.println("Insert After demonstration:");	
		list.insertAfter(1, 6);
		list.display();
		
		System.out.println("search for 3");
		list.contains(3);	
		
		System.out.println("clear and if empty demonstration:");
		list.clear();
		list.isEmpty();
		
		System.out.println("Refill list and check if empty again:");
		list.append(0);
		list.append(1);
		list.append(2);
		list.display();
		list.isEmpty();
		list.getLength();
	}
}