package com.bvks.lc;

public class LC876MiddleOfLinkedList {

	class ListNode {
		int data;
		ListNode next;
	}

	public static void main(String[] args) {

	}

	// O(N)
	public ListNode middleNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	// O(N)
	public ListNode middleNodeV2(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast.next != null) { // Missed to Add edge case and hence failed
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

}
