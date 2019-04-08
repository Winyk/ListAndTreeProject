package com.winyk.List;

import java.util.Arrays;
import java.util.List;

//  递归控制-链表创建

public class LinkedListCreator {

	public Node createLinkedList(List<Integer>data){
		if(data.isEmpty())
			return null ;
		Node firstNode = new Node(data.get(0)) ;
		Node headOfSubList = createLinkedList(data.subList(1, data.size()));
		firstNode.setNext(headOfSubList);
		return firstNode ;
	}
	
	public static void main(String[] args) {
		LinkedListCreator creator = new LinkedListCreator();
		Node.printLinkedList(creator.createLinkedList(Arrays.asList(1,2,3,4,5)));
	}

}
