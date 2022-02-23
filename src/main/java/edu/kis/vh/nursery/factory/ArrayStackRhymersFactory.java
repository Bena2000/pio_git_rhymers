package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.list.IntArrayStack;

public class ArrayStackRhymersFactory implements Rhymersfactory {

	@Override
	public defaultCountingOutRhymer GetStandardRhymer() {
		return new defaultCountingOutRhymer(new IntArrayStack());
	}

	@Override
	public defaultCountingOutRhymer GetFalseRhymer() {
		return new defaultCountingOutRhymer(new IntArrayStack());
	}

	@Override
	public defaultCountingOutRhymer GetFIFORhymer() {
		return new FIFORhymer(new IntArrayStack());
	}

	@Override
	public defaultCountingOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer(new IntArrayStack());
	}

}
