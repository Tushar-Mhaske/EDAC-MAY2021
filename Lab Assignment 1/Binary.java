class binary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long a, b;
		int i=0, r=0;
		int sum[] = new int[9];
		System.out.print(" first number: ");
		a = sc.nextLong();
		System.out.print("second binary: ");
		b = sc.nextLong();

		while (a!=0||b!=0) 
		{
			sum[i++] = (int)((a%10+b%10+r)%2);
			r=(int)((a%10+b%10+r)/2);
			a = a/10;
			b = b/10;
		}
		if (r!=0) 
		{
			sum[i++] = r;
		}
		    --i;
		System.out.print("Sum");
		while (i>=0) 
		{
			System.out.print(sum[i--]);
		} 
	}
}
