/**
 * 
 */
package functionaljava;

import java.util.Arrays;
import java.util.List;

/**
 * @author geeth.narayanan
 *
 */
public class Iteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		imperativeIteration(numList);
		
		declarativeIteration(numList);
		
		

	}

	static void imperativeIteration(List<Integer> numList) {
		for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}
	}
	
	
	
	static void declarativeIteration(List<Integer> numList) {
		
		numList.forEach((value) -> System.out.println(value));
//			
		numList.forEach(value -> System.out.println(value));
//		
		numList.forEach(System.out::println);
	
		
	}
	
	
	

}
