import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class Test1JavaStreams {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Aslam");
		names.add("Akram");
		names.add("Danis");
		names.add("Wasim");
		names.add("Waqar");
		names.add("Akhter");

		/*
		 * int count = 0; for (int i = 0; i < names.size(); i++) {
		 * 
		 * if (names.get(i).startsWith("A")) { count++; } }
		 */
		
		List<String>names1 = Arrays.asList("Atif","Bashir","Muneer","Khalid");

		long count = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(count);
		//sorting the array list which starts with A, changing their case to uppper case and printing them
		names.stream().filter(s ->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Merging two strings and printing them
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		//newStream.forEach(s ->System.out.println(s));
		
		//Finding match 
		
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Khalid"));
		Assert.assertTrue(flag);
		
		//Printing unique numbers 
		List<Integer> values = Arrays.asList(1, 2, 3, 3, 4, 5 ,6, 0);
		values.stream().distinct().forEach(s->System.out.println(s));
		//List<Integer> li= values.stream().
	}
}
