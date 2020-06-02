package ru.netology.unit;

import static org.junit.Assert.assertEquals;

class CashbackHackServiceTest {
    @org.junit.jupiter.api.Test
    void testAmount100Expected900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain( 100 );
        assertEquals( 900, result );
    }

    @org.junit.jupiter.api.Test
    void testAmount2000Expected0() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain( 2000 );
        assertEquals( 0, result );
    }

    @org.junit.jupiter.api.Test
    void testAmount1000Expected0() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain( 1000 );
        assertEquals( 0, result );
    }
}