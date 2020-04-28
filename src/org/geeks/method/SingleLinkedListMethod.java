package org.geeks.method;

import org.geeks.entity.SingleNode;

public class SingleLinkedListMethod {
	
	private SingleNode head;
	public SingleNode getHead() {
		return head;
	}


	public void setHead(SingleNode head) {
		this.head = head;
	}


	public SingleNode getTail() {
		return tail;
	}


	public void setTail(SingleNode tail) {
		this.tail = tail;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}



	private SingleNode tail;
	
	private int size = 0;
	
	 public SingleLinkedListMethod() {
		 
	 }
	 
	 
	 //create  a node linked list
	  public void createList(int value) {
		  
		  SingleNode newNode = new SingleNode();
		  newNode.setValue(value);
		  head = newNode;
		  tail = newNode;
		  size = 1;  		  
	  }
	  
	  //insert linked list
	  public void insertList(int value, int location) {
		  
		  SingleNode newNode = new SingleNode();
		  newNode.setValue(value);

		  if(isEmpty()) {
			 createList(value);
			 return;
		  }
		  
		  // insert location
		  
		  if(location == 0) { //insert before a header
			  newNode.setNext(head);
			  head = newNode;
		  }
		  
		  else if(location >= size) { // location is the last position
			  tail.setNext(newNode);
			  tail = newNode;
		  }
		  
		  else { //insert at specified location
			  SingleNode temp = head;
			  for(int i = 0; i < location -1; i++) {
				  temp = temp.getNext();
			  }
			  newNode.setNext(temp.getNext());
			  temp.setNext(newNode);
		  }
		  
		  size++;
	  }
	  
	  
	  //delete a given key
	  /**
	   *  void deleteNode(int key) 
    { 
        // Store head node 
        Node temp = head, prev = null; 
  
        // If head node itself holds the key to be deleted 
        if (temp != null && temp.data == key) 
        { 
            head = temp.next; // Changed head 
            return; 
        } 
  
        // Search for the key to be deleted, keep track of the 
        // previous node as we need to change temp.next 
        while (temp != null && temp.data != key) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
  
        // If key was not present in linked list 
        if (temp == null) return; 
  
        // Unlink the node from linked list 
        prev.next = temp.next; 
    } 
  
	   * @param node
	   */
	  
	 public void printList(SingleNode node) {
		  SingleNode current = node;
		  
		  while(current != null) {
			  System.out.print(current.getValue() +" -->");
			  current = current.getNext();
		  }
		  
		  
	  }
	  
	  
	  
	  private boolean isEmpty() {
		  return head == null;
	  }

	 

}
