package collection3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee(01,"Sethu",30000,"Morning","Developer","Male",25);
		Employee e2=new Employee(02,"Narayanan",35000,"Night","MD","Male",27);
		Employee e3=new Employee(03,"Naval",40000,"Evenig","QC","Male",26);
		Employee e4=new Employee(04,"Hari",30000,"Night","Tester","Male",20);
		Employee e5=new Employee(05,"Priya",50000,"Morning","TL","Female",25);
		Employee e6=new Employee(06,"Sai",25000,"Evening","Developer","Male",20);
		Employee e7=new Employee(07,"Jayanthi",80000,"Night","Manager","Female",35);
		ArrayList<Employee> emps=new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		emps.add(e6);
		emps.add(e7);
		
		//To print Values using Stream and filter method
		List<Employee> emps1=emps.stream().filter(x ->x.getAge()>23 && x.getGender().equals("Male")).collect(Collectors.toList());
		emps1.forEach(x ->System.out.println(x));
		
		List<Integer> nightemp=emps.stream().filter(x ->x.getShift().equalsIgnoreCase("Night")).map(a ->a.getAge()).collect(Collectors.toList());
	nightemp.forEach(x -> System.out.println(x));
	
	//List<String> name=emps.stream().filter(x-> x.getAge()>22).map(a -> a.getName()).collect(Collectors.toList());
	//name.forEach(x -> System.out.println(x));
	
	//List<String> nightname=emps.stream().filter(x -> x.getShift().equalsIgnoreCase("Night") && x.getGender().equalsIgnoreCase("female")).map(a -> a.getName()).collect(Collectors.toList());
	//nightname.forEach(x ->System.out.println(x));
	long emprole=emps.stream().filter(x-> x.getRole().equalsIgnoreCase("developer")).count();
	System.out.println(emprole);
		
	//List<Employee> orderName=emps.stream().sorted(Comparator.comparing(Employee :: getName)).collect(Collectors.toList());
		//orderName.forEach(x ->System.out.println(x));
	//Employee maxEmp=emps.stream().max(Comparator.comparing(Employee :: getSalary)).get();
	//System.out.println(maxEmp);
	
	//Employee minEmp=emps.stream().min(Comparator.comparing(Employee :: getSalary)).get();
	//System.out.println(minEmp);
	
	//List<Employee> orderName=emps.stream().sorted(Comparator.comparing(Employee :: getName).reversed()).collect(Collectors.toList());
	//orderName.forEach(x ->System.out.println(x));
	
	//List<Employee> peek=emps.stream().filter(x -> x.getShift().equalsIgnoreCase("Night")).peek(a -> a.setSalary(a.getSalary()*10)).collect(Collectors.toList());
	//peek.forEach(x -> System.out.println(x));
		
		//List to Map//
	
	Map<Integer,Employee> varMap=emps.stream().collect(Collectors.toMap(a ->a.getId(), b -> b));
	varMap.forEach((x,y) -> System.out.println(y));
	System.out.println("The End");
	
	}
	
}
