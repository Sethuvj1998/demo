package functionsCall;

public class UseCalculator {
	public static void main(String[] args)
	{
		Calculator c=new Calculator();
		c.add();
		c.mul(10,20);
		System.out.println(c.sub());
		System.out.println(c.div(20, 10));
	}
}
