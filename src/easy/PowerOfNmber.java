package easy;

public class PowerOfNmber {
	
	
	public static void main(String[] args) {
		
		System.out.println(power2(12, 21));
	}
	
	
	static long power(long n, long r)
	{
		long mod =  1000000007;
		long num=1;
		for(int i=1; i<=r; i++)
		{
			num=(num*n)%mod;
		}
		return num;
	}
	
	static long power2(long n, long r)
	{
		long mod =  1000000007;
		long num= (long) (Math.pow(n, r)%mod);
		return num;
	}

}
