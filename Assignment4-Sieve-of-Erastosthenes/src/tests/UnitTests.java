package tests;
import org.junit.Test;

import assignment.SieveOfErastosthenes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class UnitTests {
	@Test
	public void testFindPrimes() {
	   int testNum = 5;
	   SieveOfErastosthenes soe = new SieveOfErastosthenes();
	   ArrayList<Integer> arrayOfPrimes = new ArrayList<Integer>();
	   arrayOfPrimes = soe.findPrimes(testNum);
	   ArrayList<Integer> expectedArrayOfPrimes = new ArrayList<Integer>();
	   expectedArrayOfPrimes.add(2);
	   expectedArrayOfPrimes.add(3);
	   expectedArrayOfPrimes.add(5);
	   assertEquals(expectedArrayOfPrimes, arrayOfPrimes);
	   
	   arrayOfPrimes.clear();
	   expectedArrayOfPrimes.clear();
	   testNum = 20;
	   expectedArrayOfPrimes.add(2);
	   expectedArrayOfPrimes.add(3);
	   expectedArrayOfPrimes.add(5);
	   expectedArrayOfPrimes.add(7);
	   expectedArrayOfPrimes.add(11);
	   expectedArrayOfPrimes.add(13);
	   expectedArrayOfPrimes.add(17);
	   expectedArrayOfPrimes.add(19);
	   arrayOfPrimes = soe.findPrimes(testNum);
	   assertEquals(expectedArrayOfPrimes, arrayOfPrimes);
	
	}
	
	@Test
	public void testIsPrime()
	{
		SieveOfErastosthenes soe = new SieveOfErastosthenes();
		assertEquals(true, soe.isPrime(5));
		assertEquals(false, soe.isPrime(20));
		assertEquals(false, soe.isPrime(40));
	}
}
