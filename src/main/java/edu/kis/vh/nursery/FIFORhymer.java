package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.IntStackInterface;

public class FIFORhymer extends defaultCountingOutRhymer {

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(IntStackInterface intArrayStack) {
		super(intArrayStack);
	}

	public final IntStackInterface temp = new IntLinkedList();
	
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
