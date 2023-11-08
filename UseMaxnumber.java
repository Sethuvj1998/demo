package functionsCall;

public class UseMaxnumber {
	public static void main(String[] args) {
		Maxnumber max=new Maxnumber();
		
		System.out.println(max.maxnum(100, 200));
		
		System.out.println(max.maxname("Sethuraman", "Narayanan"));
		
		int[] a= {20,30,50,5,40};
		System.out.println(max.maxinArray(a));
		
		System.out.println(max.findPrime(8));
		
		System.out.println(max.palindrome("sethu"));
		
		System.out.println(max.reverse("Sethuraman"));
	}

}
