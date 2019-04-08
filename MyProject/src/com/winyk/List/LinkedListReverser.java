package com.winyk.List;

import java.util.Arrays;

//����ת(�ǵݹ�)

public class LinkedListReverser {
	
	//����һ���������ϴ������
	public Node createLargeLinkedList(int size){
		Node prev = null ;
		Node head = null ;
		
		for(int i = 1 ; i <= size ; i++){
			Node node = new Node(i);
			if(prev != null){
				prev.setNext(node);
			}else{
				head = node ;
			}
			prev = node ;
		}
		return head ;
	}
	
	public Node reserverLinkedList(Node head){
		Node newHead = null ;
		Node curHead = head ;
		
		while(curHead != null){
			Node next = curHead.getNext() ;
			curHead.setNext(newHead) ;
			newHead = curHead ;
			curHead = next ;
		}
		return newHead ;
	}
	
	public static void main(String[] args) {
		LinkedListReverser reverser = new LinkedListReverser() ;
		LinkedListCreator creator = new LinkedListCreator() ;
		Node.printLinkedList(reverser.reserverLinkedList(creator.createLinkedList(Arrays.asList(1,2,3,4,5))));
		Node.printLinkedList(reverser.reserverLinkedList(reverser.createLargeLinkedList(20)));
	}

}
