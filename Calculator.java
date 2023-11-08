package functionsCall;

public class Calculator {
	public void add() {
		int num=10;
		int num1=15;
		System.out.println(num+num1);
	}
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public int sub() {
		int a1=10;
		int b1=15;
		return a1-b1;
	}
	public int div(int a1,int b1)
	{
		return a1/b1;
	}
}
