package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int ARRAY_ELEMENTS = 12;

    private final int FULL_NUMBER = 11;

    private int[] numbers = new int[ARRAY_ELEMENTS];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull()) numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == FULL_NUMBER;
    }

    protected int peekaboo() {
        if (callCheck()) return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) return -1;
        return numbers[total--];
    }

}
