package edu.kis.vh.nursery;
// linijka 5, 8, 12, 12, 13
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) totalRejected++;
        else super.countIn(in);
    }
}
