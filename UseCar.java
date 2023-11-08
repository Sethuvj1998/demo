package functionsCall;

public class UseCar {
	public static void main(String[] args) {
		Car c=new Car();
		c.brand="Benz";
		c.color="Black";
		c.price=100000;
		
		Car c1=new Car();
		c1.brand="Audi";
		c1.color="Red";
		c1.price=500000;
		
		Car c2=new Car();
		c2.brand="Hundai";
		c2.color="Blue";
		c2.price=200000;
		Car[] cars= {c,c1,c2};
		System.out.println(c1.maxPriceBrand(cars));
		System.out.println(c1.maxLengthBrandName(cars));
	}

}
