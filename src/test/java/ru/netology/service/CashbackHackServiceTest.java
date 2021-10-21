package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTest {

    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldRemainIfAmountLessThen1000() {
        int executed = 100;
        int actual = cashback.remain(900);
        assertEquals(executed, actual);
    }

    @Test
    public void shouldRemainIfAmountEgual1000() {
        int executed = 0;
        int actual = cashback.remain(1000);
        assertEquals(executed, actual);
    }
}