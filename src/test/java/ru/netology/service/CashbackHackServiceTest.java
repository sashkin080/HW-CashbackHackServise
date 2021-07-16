package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {

    @Test
   public void ShouldBeOfferToBuyInAdditionFor100Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
   public void ShouldBeOfferToBuyInAdditionFor1Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }



    @Test
    public void ShouldntOfferToBuy() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);


    }
}