package functionaljava;

import static java.util.stream.IntStream.rangeClosed;;

public class FizzBuzz {
	
	static void printFizzBuzz(final int i) {
		if (i % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
	}
	
	
	
	static void imperativeFizzBuzz() {
		 for (int i = 1; i <= 100; i++) {
			 printFizzBuzz(i);
	        }
	}
	
	
	static void declarativeFizzBuzz() {
		rangeClosed(1, 100).forEach(FizzBuzz::printFizzBuzz);
	}
	
	

	
    public static void main(String[] args) {
    	
    	imperativeFizzBuzz();
    	
    	declarativeFizzBuzz();
        
        
        
    }
}
