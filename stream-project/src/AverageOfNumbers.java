import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {

	public static void main(String[] args) {
List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        double num = numbers.stream().mapToInt(n-> n).average().getAsDouble();
        System.out.println(num);
	}

}
