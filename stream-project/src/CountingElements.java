import java.util.Arrays;
import java.util.List;

public class CountingElements {

	public static void main(String[] args) {
List <Integer> Numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
 
long num = Numbers.stream().count();
System.out.println(num);

	}

}
