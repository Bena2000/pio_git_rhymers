package edu.kis.vh.nursery.list;

public interface IntArrayStackInterface {

	static final int ERROR = -1;

    public void push(int in);

    public int pop();

    public int getError();

    public boolean isEmpty();

    public boolean isFull();

    public int checkLast();
}
