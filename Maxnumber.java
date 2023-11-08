package functionsCall;

public class Maxnumber {
	//TO find maximum number
	public int maxnum(int a,int b) {
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	//To find maximum length string
	public String maxname(String a,String b)
	{
		if(a.length()>b.length())
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	//To find max number in array
	public String maxinArray(int[] nums) {
		int max=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>max)
			{
				max=nums[i];
			}
		}
		return "Maximum value is "+max;
	}
	//To find wheather the number is prime or not
	public String findPrime(int a)
	{
		boolean b=true;
		for(int i=0;i<a;i++)
		{
			if(a%2==0)
			{
				b=false;
			}
		}
			if(b==true)
			{
				return "Prime "+a;
			}
			else
			{
				return "Not Prime "+a;
			}
	}
	//To find the given string is palindrome or not
	public String palindrome(String a)
	{
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(b.equals(a))
		{
			return "Palindrome";
		}
		else
		{
			return "Not Palindrome";
		}
	}
	//String reverseing
	public String reverse(String a)
	{
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		return a+" Reverse string is "+b;
	}
}
