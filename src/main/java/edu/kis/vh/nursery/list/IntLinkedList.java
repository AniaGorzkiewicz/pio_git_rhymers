package edu.kis.vh.nursery.list;

/**
 * Ta klasa jest dwukierunkową listą wiazaną zwracajacą wartość typu Int
 */
public class IntLinkedList {
	/**
	 * Ta klasa przechowuje następnik i poprzednik klasy IntLinkedList
	 */
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

	/**
	 * Metoda dodaje element do listy dwukierunkowej
	 * @param i przechowuje wartość, która zostanie dodana do listy
	 */
	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().next = new Node(i);
			getLast().next.prev = getLast();
			setLast(getLast().next);
		}
	}

	/**
	 * Metoda sprawdza czy
	 * @return zwraca wartość logiczną zgodnie z wynikiem funkcji getLast
	 */
	public boolean isEmpty() {
		return getLast() == null;
	}

	/**
	 *Metoda sprawdza czy lista jest pelna
	 * @return zwraca wartosc logiczna false
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Metoda sprawdza czy lista jest pusta, jesli tak to zwraca ERRO_RETURN
	 * @return zwraca wartosc ostatniego elementu w liscie
	 */
	public int top() {
		if (isEmpty())
			return ERRO_RETURN;
		return getLast().value;
	}

	/**
	 * Metoda najpierw sprawdza czy lista jest pusta, jesli nie to ustawia wartosc ostatniego elementu
	 * @return zwraca wartosc ostatniego elementu listy
	 */
	public int pop() {
		if (isEmpty())
			return ERRO_RETURN;
		int ret = getLast().value;
		setLast(getLast().prev);
		return ret;
	}

	/**
	 * Metoda zwraca ostani element listy
	 * @return zwraca element
	 */
	public Node getLast() {
		return last;
	}

	/**
	 * Metoda dodaje element na koniec listy dwukierunkowej
	 * @param last to element, ktory doda sie na koniec listy
	 */

	public void setLast(Node last) {
		this.last = last;
	}

}
