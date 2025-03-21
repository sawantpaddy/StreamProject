import java.util.Arrays;
import java.util.List;

public class startWithString {

	public static void main(String args[])
	{
		List <String> fruitList= Arrays.asList("Banana","Peru","Mango","Apple","Grapes","AMM");
		long fruit = fruitList.stream().filter(n->n.startsWith("A")).count();
		System.out.println(fruit);
	}
}
