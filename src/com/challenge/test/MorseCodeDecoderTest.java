package com.challenge.test;

import com.challenge.morsecodedecoder.MorseCodeDecoder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        assertEquals("HEY JUDE", MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
    }

    @Test
    public void testMoreComplexTests() {
        assertEquals("E", MorseCodeDecoder.decode(" . "));
        assertEquals("E E", MorseCodeDecoder.decode("   .   . "));
        assertEquals("SOS THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", MorseCodeDecoder.decode("      ... --- ...   - .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -.   ..-. --- -..-   .--- ..- -- .--. ...   --- ...- . .-.   - .... .   .-.. .- --.. -.--   -.. --- --. "));
    }
}
