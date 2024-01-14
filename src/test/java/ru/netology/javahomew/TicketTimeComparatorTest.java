package ru.netology.javahomew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class TicketTimeComparatorTest {

    @Test
    public void testComparatorFirstMore() {
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "SPB", 100, 11, 14);

        int expected = comparator.compare(ticket1, ticket2);
        Assertions.assertTrue(expected < 0);
    }

    @Test
    public void testComparatorSecondMore() {
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket ticket1 = new Ticket("MSK", "SPB", 100, 11, 14);
        Ticket ticket2 = new Ticket("MSK", "SPB", 200, 9, 10);

        int expected = comparator.compare(ticket1, ticket2);
        Assertions.assertTrue(expected > 0);
    }

    @Test
    public void testComparatorEquals() {
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "SPB", 200, 10, 12);

        int expected = comparator.compare(ticket1, ticket2);
        Assertions.assertTrue(expected == 0);

    }


}
