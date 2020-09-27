package id.dondon.stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StackMatchParenthesisTest {

    @Test
    public void matching() {
        boolean resA = StackMatchParenthesis.hasMatchingParenthesis("(abcd)");
        assertTrue(resA);

        boolean resB = StackMatchParenthesis.hasMatchingParenthesis("{{{{}}");
        assertFalse(resB);

        boolean resC = StackMatchParenthesis.hasMatchingParenthesis("{{{{}}})");
        assertFalse(resC);

        boolean resD = StackMatchParenthesis.hasMatchingParenthesis("{{{}}}()");
        assertTrue(resD);

        boolean resE = StackMatchParenthesis.hasMatchingParenthesis("{{{}}]()");
        assertFalse(resE);

        boolean resF = StackMatchParenthesis.hasMatchingParenthesis("{{}}([]){}{}{}{}{[[[[]]]]}");
        assertTrue(resF);
    }

}
