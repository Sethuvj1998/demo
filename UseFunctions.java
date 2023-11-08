package functionsCall;

public class UseFunctions {
	public static void main(String[] args) {
		Functions fun=new Functions();
		System.out.println(fun.add("Sethu", "Raman"));
		System.out.println(fun.div(10, 20));
		System.out.println(fun.sub(10.5f, 12.5f));
		System.out.print(fun.max(10, 20));
	}

}
