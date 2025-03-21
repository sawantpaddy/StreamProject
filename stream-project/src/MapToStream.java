import java.util.HashMap;
import java.util.Map;

public class MapToStream {

	public static void main(String[] args) {

		Map <Integer,String> myMap= new HashMap<>();
		myMap.put(1, "Pandurang");
		myMap.put(2, "Sachin");
		myMap.put(3, "Sagar");
		
		myMap.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+ "" + entry.getValue())); 
		
		//OR
		
		/*
		 * map.entrySet().stream() .map(entry -> entry.getKey() + " " +
		 * entry.getValue()) .forEach(System.out::println);
		 */
		
		
	}

}
