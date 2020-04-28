package org.geeks.linkedlist;

import org.geeks.entity.SingleNode;
import org.geeks.method.SingleLinkedListMethod;

public class TestInsertLinkedList {
	
	public static void main(String args[]) {
		
		SingleLinkedListMethod singleLinkedListMethod = new SingleLinkedListMethod();
		singleLinkedListMethod.createList(1);
		singleLinkedListMethod.insertList(7, singleLinkedListMethod.getSize() +1);
		singleLinkedListMethod.insertList(8, singleLinkedListMethod.getSize() +1);
		singleLinkedListMethod.insertList(6, singleLinkedListMethod.getSize() +1);
		singleLinkedListMethod.insertList(4, singleLinkedListMethod.getSize() +1);
		
		 singleLinkedListMethod.printList(singleLinkedListMethod.getHead());
		
		System.out.println(); 
		System.out.println("After deleting");
		SingleNode deletNode = singleLinkedListMethod.deleteGivenKey(singleLinkedListMethod.getHead(), 5);
		
		 //singleLinkedListMethod.printList(deletNode);
		
		
	}

}
