import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatinate {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("Chiku","Piku","Tiku","Miku");
		String con = str.stream().collect(Collectors.joining());
		System.out.println(con);
	}

}
