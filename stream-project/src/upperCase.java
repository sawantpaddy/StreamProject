import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class upperCase {

	public static void main(String args[])
	{
		List <String> Fruits = Arrays.asList("pomogranade","apple","banana","grapes","custordapple");
		List <String> Fruitslist= Fruits.stream().map(n -> n.toString().toUpperCase()).collect(Collectors.toList());
		System.out.println(Fruitslist);
	}
}
