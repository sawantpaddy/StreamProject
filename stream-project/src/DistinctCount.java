import java.util.Arrays;
import java.util.List;

public class DistinctCount {

	public static void main(String[] args) {
List <Integer> numbers =Arrays.asList(1,2,3,3,4,5,5,6,6,7,8);
long num = numbers.stream().distinct().count();
System.out.println(num);
	}

}
