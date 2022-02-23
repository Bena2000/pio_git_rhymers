package edu.kis.vh.nursery.list;

public class IntArrayStack implements IntStackInterface {
    private static final int SIZE = 12;
    private static final int TOTALBEGIN = -1;
    private final int[] numbers = new int[SIZE];
    private int total = TOTALBEGIN;

    public void push(int in){
        numbers[++total] = in;
    }

    public int pop(){
        return numbers[total--];
    }

    public int getError() {
        return ERROR;
    }

    public boolean isEmpty(){
        return total == TOTALBEGIN;
    }

    public boolean isFull(){
        return total == SIZE - 1;
    }

    public int checkLast(){
        return numbers[total];
    }
}
