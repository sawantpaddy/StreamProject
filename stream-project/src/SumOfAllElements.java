import java.util.Arrays;
import java.util.List;

public class SumOfAllElements {

	public static void main (String [] args)
	{
	List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	int sum = numbers.stream().mapToInt(Integer::intValue).sum(); // or .mapToInt(n -> n.intValue()) this is equivalent to ::;
	System.out.print(sum);  
	}
}
