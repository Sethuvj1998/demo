package collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Col3 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Sethu");
		name.add("Raju");
		name.add("Viji");
		name.add("Dinesh");
		name.stream().forEach(x -> System.out.println(x));
		List<String> name1 = name.stream().filter(x -> x.endsWith("u") && x.startsWith("R"))
				.collect(Collectors.toList());
		name1.forEach(x -> System.out.println("Name starts with R and ends with u " + x));
		List<String> nameOrder=name.stream().sorted().collect(Collectors.toList());
		nameOrder.forEach(x ->System.out.print(x));
	}

}
