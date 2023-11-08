package collection3;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UsingMap {
	public static void main(String[] args) {
		Employee e1=new Employee(01,"Sethu",30000,"Morning","Developer","Male",25);
		Employee e2=new Employee(02,"Narayanan",35000,"Night","MD","Male",27);
		Employee e3=new Employee(03,"Naval",40000,"Evenig","QC","Male",26);
		Employee e4=new Employee(04,"Hari",30000,"Night","Tester","Male",20);
		Employee e5=new Employee(05,"Priya",50000,"Morning","TL","Female",25);
		Employee e6=new Employee(06,"Sai",25000,"Evening","Developer","Male",20);
		Employee e7=new Employee(07,"Jayanthi",80000,"Night","Manager","Female",35);
		HashMap<Integer,Employee> emp=new HashMap<>();
		emp.put(e1.getId(), e1);
		emp.put(e2.getId(), e2);
		emp.put(e3.getId(), e3);
		emp.put(e4.getId(), e4);
		emp.put(e5.getId(), e5);
		emp.put(e6.getId(), e6);
		emp.put(e7.getId(), e7);
		
		
		emp.forEach((x,y) -> System.out.println(x+" "+y));
		
		//Map to List // also using limit() method //
		
		List<Employee> var=emp.values().stream().filter(a -> a.getGender().equals("Male")).limit(2).collect(Collectors.toList());
		var.forEach(y -> System.out.println(y));
	}

}
