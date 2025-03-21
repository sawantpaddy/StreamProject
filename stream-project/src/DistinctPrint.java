import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,2,3,8);
List <Integer> nunmers = nums.stream().distinct().collect(Collectors.toList());
System.out.println(nunmers);
	}

}
