package com.test;

import java.util.HashSet;
import java.util.LinkedList;

public class DetectLoop {
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int d){
			data =d;
			next = null;
		}
	}
	public void push(int d) {
		
	}
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.push(20);
		list.push(4);
		list.push(15);
		list.push(10);
		if(detectLoop(head)) {
			System.out.println("loop found");
		}else {
			System.out.println("no loop found");
		}
	}

	private static boolean detectLoop(Node head2) {
		HashSet<Node> set = new HashSet<>();
		while(head2 != null) {
			if(set.contains(head2)) {
				return true;
			}
			set.add(head2);
			head2 = head2.next;
		}
		return false;
	}
}
