package functionaljava;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;


public class SumDoubleEvens {

	static void imperativeSumDoubleOfEvens(List<Integer> numbers) {

		int result = 0;

		for (int e : numbers) {
			if (e % 2 == 0) {
				result += e * 2;
			}
		}
		System.out.println(result);
	}

	static void declarativeSumDoubleOfEvens(List<Integer> numbers) {
		System.out.println(numbers.stream()
				.filter(e -> e % 2 == 0)
				.mapToInt(e -> e * 2).sum());
	}

	static void declarativeParallelSumDoubleOfEvens(List<Integer> numbers) {
		System.out.println(numbers.parallelStream()
				.filter(e -> e % 2 == 0)
				.mapToInt(e -> e * 2).sum());
	}
	
	static void declarativeDoubleEvensList(List<Integer> numbers) {
		System.out.println(numbers.parallelStream().filter(e -> e % 2 == 0).map(e -> e * 2).collect(toList()));
	}
	
	

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		imperativeSumDoubleOfEvens(numbers);

		declarativeSumDoubleOfEvens(numbers);

		declarativeParallelSumDoubleOfEvens(numbers);
		
		declarativeDoubleEvensList(numbers);

	}

}
