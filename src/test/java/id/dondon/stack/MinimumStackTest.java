package id.dondon.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumStackTest {

  @Test
  public void getMinimumValue() throws StackOverflowException, StackUnderflowException {
    MinimumStack minimumStack = new MinimumStack();
    minimumStack.push(2);
    minimumStack.push(4);
    minimumStack.push(10);

    assertEquals(2, minimumStack.getMinimum());

    minimumStack.push(1);
    assertEquals(1, minimumStack.getMinimum());

    minimumStack.push(0);
    assertEquals(0, minimumStack.getMinimum());

    minimumStack.pop();
    assertEquals(1, minimumStack.getMinimum());

    minimumStack.pop();
    assertEquals(2, minimumStack.getMinimum());

    minimumStack.pop();
    assertEquals(2, minimumStack.getMinimum());
  }

}
