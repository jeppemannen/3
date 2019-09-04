package jeppe.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverter {
    @Test
    void shouldReturnIfor1() {
        assertEquals("I", toRoman(1));
    }

    private String toRoman(int number) {
        return "I";
    }
}
