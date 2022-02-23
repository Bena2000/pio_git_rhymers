package edu.kis.vh.nursery.list;

public class IntArrayStack implements IntArrayStackInterface {
    private final int SIZE = 12;
    private final int TOTALBEGIN = -1;
    private final int[] NUMBERS = new int[SIZE];
    private int TOTAL = TOTALBEGIN;

    public void push(int in){
        NUMBERS[++TOTAL] = in;
    }

    public int pop(){
        return NUMBERS[TOTAL--];
    }

    public int getError() {
        return ERROR;
    }

    public boolean isEmpty(){
        return TOTAL == TOTALBEGIN;
    }

    public boolean isFull(){
        return TOTAL == SIZE - 1;
    }

    public int checkLast(){
        return NUMBERS[TOTAL];
    }
}
