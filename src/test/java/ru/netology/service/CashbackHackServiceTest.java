package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldRemainIfAmountLessThen1000() {
        int executed=100;
        int actual = cashback.remain(900);
        assertEquals(actual, executed);
    }

    @Test
    public void shouldRemainIfAmountMoreThen1000() {
        int executed=900;
        int actual = cashback.remain(1100);
        assertEquals(actual, executed);
    }

    @Test
    public void shouldRemainIfAmountEgual1000() {
        int executed=1000;
        int actual = cashback.remain(1000);
        assertEquals(actual, executed);
    }
}