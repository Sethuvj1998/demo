package functionsCall;

public class UseObjectReturn {
	public static void main(String[] args) {
		ObjectReturn obj1=new ObjectReturn();
		obj1.brand="Benz";
		obj1.color="Black";
		obj1.price=100000;
		
		ObjectReturn obj2=new ObjectReturn();
		obj2.brand="Audi";
		obj2.color="Red";
		obj2.price=500000;
		obj1.obj(obj2);
		ObjectReturn obj=obj1.obj(obj2);
		}

}
