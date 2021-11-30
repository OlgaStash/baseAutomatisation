package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTestJ4 {

    @Test
    public void shouldTestRemainFrom0() {
        CashbackHackService service = new CashbackHackService();
        int payment = 0;

        int actual = service.remain(payment);
        int expected = 1000;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldTestRemainFrom1() {
        CashbackHackService service = new CashbackHackService();
        int payment = 1;

        int actual = service.remain(payment);
        int expected = 999;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldTestRemainFrom1000() {
        CashbackHackService service = new CashbackHackService();
        int payment = 1000;

        int actual = service.remain(payment);
        int expected = 1000;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldTestRemainFrom500() {
        CashbackHackService service = new CashbackHackService();
        int payment = 500;

        int actual = service.remain(payment);
        int expected = 500;
        assertEquals(actual, expected);

    }
}