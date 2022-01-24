package edu.kis.vh.nursery.list;

public class IntLinkedList {
	private static class Node
	{
		public int value;
		public Node prev, next;

		public Node(int i) {
			value = i;
		}
	}


	public static final int ERRO_RETURN = -1;
	private Node last;
	int i;

	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().next = new Node(i);
			getLast().next.prev = getLast();
			setLast(getLast().next);
		}
	}

	public boolean isEmpty() {
		return getLast() == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return ERRO_RETURN;
		return getLast().value;
	}

	public int pop() {
		if (isEmpty())
			return ERRO_RETURN;
		int ret = getLast().value;
		setLast(getLast().prev);
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

}
