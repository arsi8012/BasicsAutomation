package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldRemainIfAmountLessThen1000() {
        int executed = 100;
        int actual = cashback.remain(900);
        assertEquals(actual, executed);
    }

    @Test
    public void shouldRemainIfAmountEgual1000() {
        int executed = 0;
        int actual = cashback.remain(1010);
        assertEquals(actual, executed);
    }
}