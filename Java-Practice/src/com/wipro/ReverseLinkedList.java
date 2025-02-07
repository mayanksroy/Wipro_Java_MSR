package com.wipro;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(12);
		ll.add(34);
		ll.add(98);
		ll.add(51);
		ll.add(51);
		System.out.println("LinkedList: " + ll);
		System.out.println("Reversed LinkedList: " + ll.reversed());
	}
}
