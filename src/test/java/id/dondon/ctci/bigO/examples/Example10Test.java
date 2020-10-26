package id.dondon.ctci.bigO.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Example10Test {

  @Test
  public void prime_whenInputPrime_thenReturnTrue() {
    boolean result = Example10.isPrime(31);
    assertTrue(result);
  }

  @Test
  public void primeSqrt_whenInputPrime_thenReturnTrue() {
    boolean result = Example10.isPrimeSqrt(31);
    assertTrue(result);
  }

  @Test
  public void prime_whenInputNotPrime_thenReturnFalse() {
    boolean result = Example10.isPrime(32);
    assertFalse(result);
  }

  @Test
  public void primeSqrt_whenInputNotPrime_thenReturnFalse() {
    boolean result = Example10.isPrimeSqrt(32);
    assertFalse(result);
  }

}
