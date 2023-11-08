package collection3;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String shift;
	private String role;
	private String gender;
	private int age;
	public Employee(int id, String name, int salary, String shift, String role, String gender, int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.shift = shift;
		this.role = role;
		this.gender = gender;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "Id= "+id+", "+"Name= "+name+", "+"Salary= "+salary+", "+"Shift= "+shift+", "+"Role= "+role+", "+"Gender= "+gender+", "+"Age= "+age;
	}
}
