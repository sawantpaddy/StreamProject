import java.util.Arrays;
import java.util.List;

/**
 * 
 */

/**
 * Given a list of double values, 
 * how would you convert them to integers and then 
 * calculate the sum of those integers using the Stream API?
 * @author Pandurang
 *
 */
public class ConvertaAndSumDoubleToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Double> Numbers = Arrays.asList(1.2,2.3,3.4,4.5);
int sum =Numbers.stream().mapToInt(n-> n.intValue()).sum();
System.out.println(sum);
	}

}
