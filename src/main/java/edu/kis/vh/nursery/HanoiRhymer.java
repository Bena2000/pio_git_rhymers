package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntStackInterface;

public class HanoiRhymer extends defaultCountingOutRhymer {
	
	private int totalRejected = 0;

	public HanoiRhymer() {
    }

    public HanoiRhymer(IntStackInterface numbers) {
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
