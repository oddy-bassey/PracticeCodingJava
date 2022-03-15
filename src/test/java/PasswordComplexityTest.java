import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordComplexityTest {

    @Test
    public void isPasswordComplexTrue(){
        assertTrue(PasswordComplexity.isPasswordCompex("Happy12"));
        assertTrue(PasswordComplexity.isPasswordCompex("welCome2"));
        assertTrue(PasswordComplexity.isPasswordCompex("Baddes1t"));
        assertTrue(PasswordComplexity.isPasswordCompex("rickY09"));
        assertTrue(PasswordComplexity.isPasswordCompex("10Truity"));
        assertTrue(PasswordComplexity.isPasswordCompexOptimized("dBest006"));
        assertTrue(PasswordComplexity.isPasswordCompexOptimized("stOp101"));
    }

    @Test
    public void isPasswordComplexFalse(){
        assertFalse(PasswordComplexity.isPasswordCompex(""));
        assertFalse(PasswordComplexity.isPasswordCompex("stop09"));
        assertFalse(PasswordComplexity.isPasswordCompex("xxccvv"));
        assertFalse(PasswordComplexity.isPasswordCompex("sdfghwty78"));
        assertFalse(PasswordComplexity.isPasswordCompex("34567890"));
        assertFalse(PasswordComplexity.isPasswordCompexOptimized("WERTYUI"));
        assertFalse(PasswordComplexity.isPasswordCompexOptimized("-098y"));
    }
}
