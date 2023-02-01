import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test 
  public void reverseInPlace1(){
    int[] input1 = {0,1,2,3}; 
    ArrayExamples.reverseInPlace(input1); 
    assertArrayEquals(new int[] {3,2,1,0}, input1);
  }
  @Test 
  public void testReversed1(){
    int[] input1 = { 3 , 4 , 5 , 6 }; 
    assertArrayEquals(new int[] { 6 , 5 , 4 , 3 }, ArrayExamples.reversed(input1));
  }
  @Test 
  public void testaverageWithoutLowest(){
    double[] input1 = {3.0, 3.0, 5.0, 9.0, 9.0}; 
    assertEquals(6.5, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
}
