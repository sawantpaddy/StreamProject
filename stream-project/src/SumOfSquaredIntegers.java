import java.util.Arrays;
import java.util.List;

public class SumOfSquaredIntegers {

	public static void main(String[] args) {
List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7);
int num=numbers.stream().mapToInt(n->n*n).sum();
System.out.println(num);
	}

}
