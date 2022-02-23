package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntStackInterface;

public class FIFORhymer extends defaultCountingOutRhymer {

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(IntArrayStack intArrayStack) {
		super(intArrayStack);
	}

	public final IntStackInterface temp = new IntArrayStack();
	
	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());
		
		int ret = temp.pop();
		
		while (!temp.isEmpty())
					countIn(temp.pop());
		
		return ret;
	}
}
