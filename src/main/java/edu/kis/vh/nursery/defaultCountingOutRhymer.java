package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntStackInterface;

public class defaultCountingOutRhymer {

	private IntStackInterface numbers;
    private final static int EMPTYERR = 0;

    public defaultCountingOutRhymer() {
        numbers = new IntArrayStack();
    }

    public defaultCountingOutRhymer(IntStackInterface numbers) {
        this.numbers = numbers;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers.push(in);
    }
    public int countOut() {
    	if (callCheck())
    		return EMPTYERR;
    	return numbers.pop();
    }

    public boolean callCheck() {
        return numbers.isEmpty();
    }

    public boolean isFull() {
        return numbers.isFull();
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTYERR;
        return numbers.checkLast();
    }

}
