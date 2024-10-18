package com.challenge.test;

import com.challenge.whatcentury.WhatCentury;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhatCenturyTest {
    @Test
    public void testSomething() {
        assertEquals("98th", WhatCentury.whatCentury(9800));
        assertEquals("20th", WhatCentury.whatCentury(1999));
        assertEquals("21st", WhatCentury.whatCentury(2011));
        assertEquals("22nd", WhatCentury.whatCentury(2154));
        assertEquals("23rd", WhatCentury.whatCentury(2259));
    }
}
