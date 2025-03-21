import java.util.Arrays;
import java.util.List;

public class MaximumValue {

	public static void main(String[] args) {
List <Integer> numbers= Arrays.asList(1,2,3,3,4,10,5,6,7,8,9);
int num =numbers.stream().max ((a,b) -> a.compareTo(b)).get();
System.out.println(num);
	}

}
