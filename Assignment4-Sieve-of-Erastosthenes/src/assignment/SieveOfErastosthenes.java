package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Test4
public class SieveOfErastosthenes {
	private ArrayList<Integer> arrayOfPrimes = new ArrayList<Integer>();
	
	public boolean isPrime(int num) 
	{ 
	    /**
	     * Is the num less than or equal
	     * to one? If it is than it is
	     * not a prime number 
	     */
	    if (num <= 1) 
	    {
	        return false; 
	    }
	  
	    /**
	     * Iterate each number until we are 
	     * equal to the num then break loop
	     * 
	     * A prime number is a number that has
	     * exactly 2 positive divisors
	     * (Ex. 2 is divisible by only 1 and itself)
	     */
	    for (int i = 2; i < num; i++) 
	    {
	        if (num % i == 0) 
	        {
	            return false; 
	        }
	    }
	  
	    return true; 
	} 
	
	/**
	 * Prints out all of the prime numbers 
	 * up to a given input
	 * @param input - the user input
	 */
	public ArrayList<Integer> findPrimes(int input)
	{
		/**
		 * Fill map with nums 2 -> input
		 * and map value to whether or
		 * not it is prime
		 */
		for(int i = 2; i <= input; i++)
		{
			if(isPrime(i))
			{
				arrayOfPrimes.add(i);
			}
		}
		
		System.out.println("Prime Nums: ");
		
		/**
		 * Loop through map and printout
		 * the numbers that are prime
		 */
		for(int i = 0; i < arrayOfPrimes.size(); i++)
		{
			if((i + 1) < arrayOfPrimes.size())
			{
				System.out.print(arrayOfPrimes.get(i) + ",");
			} else
			{
				System.out.print(arrayOfPrimes.get(i));
			}
		}
		return arrayOfPrimes;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SieveOfErastosthenes soe = new SieveOfErastosthenes();
		
		BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
		
		int testNum = 0;
		try {
			System.out.println("Input number: ");
			testNum = Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			System.out.println("Caught IOException: ");
			e.printStackTrace();
		}
		
		soe.findPrimes(testNum);

	}

}
