package com.challenge.test;

import com.challenge.josephus.Josephus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JosephusTest {

    @Test
    public void getSurvivorEveryThirdKilledOutOfTen() {
        int actualSurvivor = Josephus.getSurvivor(10, 3);
        Assertions.assertEquals(4, actualSurvivor);
    }

    @Test
    public void getSurvivorEverySecondKilledOutOfFive() {
        int actualSurvivor = Josephus.getSurvivor(5, 2);
        Assertions.assertEquals(3, actualSurvivor);
    }

    @Test
    public void getSurvivorEveryThirdKilledOutOfFifteen() {
        int actualSurvivor = Josephus.getSurvivor(15, 3);
        Assertions.assertEquals(5, actualSurvivor);
    }
}
