package functionsCall;

public class Car {
	String brand;
	int price;
	String color;
	public String maxPriceBrand(Car[] cars)
	{
		int max=0;
		String b="";
		for(int i=0;i<cars.length;i++)
		{
			if(cars[i].price>max)
			{
				max=cars[i].price;
				b=cars[i].brand;
			}
		}
		return "Maximum price brand is "+b;
	}
	//TO find maximum length brand name
	public String maxLengthBrandName(Car[] cars)
	{
		String maxBrand="";
		int max=0;
		for(int i=0;i<cars.length;i++)
		{
			max=cars[i].brand.length();
			maxBrand=cars[i].brand;
			if(cars[i].brand.length()>max)
			{
				maxBrand=cars[i].brand;
			}
		}
		return maxBrand+" is maxmimum length brand";
	}
}
