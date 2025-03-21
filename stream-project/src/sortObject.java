import java.util.Arrays;
import java.util.List;

public class sortObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Person> mens = Arrays.asList(new Person("Pandurang",29),new Person("Sachin",30),new Person("Ram",25));
	List <Person> SortedByAge=mens.stream().sorted((P1,P2)->Integer.compare(P1.getAge(), P2.getAge())).toList();
	 System.out.println(SortedByAge );
	}

}