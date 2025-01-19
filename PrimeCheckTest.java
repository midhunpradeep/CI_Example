import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertEquals("Test 1", true, PrimeCheck.isPrime(3));
    assertEquals("Test 2", true, PrimeCheck.isPrime(5));
    assertEquals("Test 3", true, PrimeCheck.isPrime(19));
    assertEquals("Test 4", true, PrimeCheck.isPrime(7919));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(4));
    assertEquals("Test 1", false, PrimeCheck.isPrime(6));
    assertEquals("Test 2", false, PrimeCheck.isPrime(9));
    assertEquals("Test 3", false, PrimeCheck.isPrime(100));
    assertEquals("Test 4", false, PrimeCheck.isPrime(7909));
  }
}
