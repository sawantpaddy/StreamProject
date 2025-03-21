import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String args[])

	{
		List<Integer> numbers=Arrays.asList(10,3,4,5,6,10,8,2,6,7,8,9,2,1);
		
	Integer nun =	numbers.stream().sorted((a,b)->b.compareTo(a)).distinct().skip(1).findFirst().get();
	System.out.println(nun);
		
	}

}
