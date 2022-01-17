package edu.kis.vh.nursery;

/**
 * HanoiRhymer - klasa licząca
 */
public class HanoiRhymer extends defaultCountingOutRhymer {

int totalRejected = 0;

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
