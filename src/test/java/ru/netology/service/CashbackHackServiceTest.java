package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {

    @Test
   public void ShouldBeOfferToBuyInAdditionFor100Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
   public void ShouldBeOfferToBuyInAdditionFor1Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }



    @Test
    public void ShouldntOfferToBuy() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);


    }
}