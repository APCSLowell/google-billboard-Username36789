public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		System.out.println("Replace this string with your answer!");
	}
	
	//Finish this function
	public boolean isPrime(double d){
	  // convert the double to an integer with long
	  long number = (long) dNum;
	
	  // all cases below 5
	  if (number < 2) return false;
	  if (number == 2 || number == 3) return true;
	
	  // factors of 2 or 3 means not prime
	  if (number % 2 == 0 || number % 3 == 0) return false;
	
	  // check for factors from 5 to sqrt(number)
	  for (long i = 5; i * i <= number; i += 6) {
	    if (number % i == 0 || number % (i + 2) == 0) {
	      return false;
	    }
	  }

	  return true;
	}
}
