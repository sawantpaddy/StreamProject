import java.util.Arrays;
import java.util.List;

public class ProductOfNumbers {

	public static void main(String[] args) {
List <Integer> numbers=Arrays.asList(1,2,3,4);
int num =numbers.stream().reduce(1,(a,b) -> a*b) ;

System.out.println(num);
	}

}
