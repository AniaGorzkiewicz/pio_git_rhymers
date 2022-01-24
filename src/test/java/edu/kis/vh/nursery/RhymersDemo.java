package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    private static final int END_VALUE = 15;
    private static final int BOUND = 20;
    private static final int INT1 = 3;
    private static final int FIRST_ELEM = 0;
    private static final int SECOND_ELEM = 1;

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        extracted(factory);

    }
    

    private static void extracted(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = SECOND_ELEM; i < END_VALUE; i++)
            for (int j = FIRST_ELEM; j < INT1; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = SECOND_ELEM; i < END_VALUE; i++)
            rhymers[INT1].countIn(rn.nextInt(BOUND));

        for (int i = FIRST_ELEM; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[INT1]).reportRejected());
    }

}