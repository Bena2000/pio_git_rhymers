package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStackInterface;

public class HanoiRhymer extends defaultCountingOutRhymer {
	
	private int totalRejected = 0;

	public HanoiRhymer() {
    }

    public HanoiRhymer(IntArrayStackInterface numbers) {
        super(numbers);
    }


    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
