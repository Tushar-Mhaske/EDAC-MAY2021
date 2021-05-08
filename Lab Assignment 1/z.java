class Operation
{
	static int sum(int i, int j)
	{
		return i+j;	
	}
	static double sum(int i, float j)
	{
		return i+j;	
	}
	static void show(int res)
	{
		System.out.println(res);
	}
	static void show1(double res)
	{
		System.out.println(res);
	}
}

class calculate4
{
	public static void main(String args[])
	{
		int r = Operation.sum(11,22);
		Operation.show1(r);
		double r1 = Operation.sum(11,22.3f);
		Operation.show1(r1);
	}
}
