package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BusTest {

    /*
    Passes the tests
    Reveals intention
    No duplication
    Fewest elements
    */

    @Test
    public void defaultValueOfInitialToll() {
        Assertions.assertEquals(50000, Bus.INITIAL_TOLL);
    }
}
