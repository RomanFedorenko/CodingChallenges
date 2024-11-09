package com.challenge.morsecodedecoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split("   ")).
                map(word -> Arrays.stream(word.split(" ")).map(MorseCode::get).collect(Collectors.joining())).
                collect(Collectors.joining(" "));
    }

    class MorseCode {
        private static final Map<String, String> MORSE_CODE_DICT = new HashMap<>();

        static {
            MORSE_CODE_DICT.put(".-", "A");
            MORSE_CODE_DICT.put("-...", "B");
            MORSE_CODE_DICT.put("-.-.", "C");
            MORSE_CODE_DICT.put("-..", "D");
            MORSE_CODE_DICT.put(".", "E");
            MORSE_CODE_DICT.put("..-.", "F");
            MORSE_CODE_DICT.put("--.", "G");
            MORSE_CODE_DICT.put("....", "H");
            MORSE_CODE_DICT.put("..", "I");
            MORSE_CODE_DICT.put(".---", "J");
            MORSE_CODE_DICT.put("-.-", "K");
            MORSE_CODE_DICT.put(".-..", "L");
            MORSE_CODE_DICT.put("--", "M");
            MORSE_CODE_DICT.put("-.", "N");
            MORSE_CODE_DICT.put("---", "O");
            MORSE_CODE_DICT.put(".--.", "P");
            MORSE_CODE_DICT.put("--.-", "Q");
            MORSE_CODE_DICT.put(".-.", "R");
            MORSE_CODE_DICT.put("...", "S");
            MORSE_CODE_DICT.put("-", "T");
            MORSE_CODE_DICT.put("..-", "U");
            MORSE_CODE_DICT.put("...-", "V");
            MORSE_CODE_DICT.put(".--", "W");
            MORSE_CODE_DICT.put("-..-", "X");
            MORSE_CODE_DICT.put("-.--", "Y");
            MORSE_CODE_DICT.put("--..", "Z");
            MORSE_CODE_DICT.put("-----", "0");
            MORSE_CODE_DICT.put(".----", "1");
            MORSE_CODE_DICT.put("..---", "2");
            MORSE_CODE_DICT.put("...--", "3");
            MORSE_CODE_DICT.put("....-", "4");
            MORSE_CODE_DICT.put(".....", "5");
            MORSE_CODE_DICT.put("-....", "6");
            MORSE_CODE_DICT.put("--...", "7");
            MORSE_CODE_DICT.put("---..", "8");
            MORSE_CODE_DICT.put("----.", "9");
        }

        public static String get(String code) {
            return MORSE_CODE_DICT.get(code);
        }
    }
}
