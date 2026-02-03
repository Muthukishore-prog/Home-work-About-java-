class LogicalOperator
{
	public static void main(String[] args)
	{
		int a = 10,b = 5;
		
		boolean c = (a<=b)&&(b>a);
		boolean d = (b<=a)||(a>b);
		boolean f = !((a<=b)||!(b>a));
		
		System.out.println("AND:" + c);
		System.out.println("OR:" + d);
		System.out.println("NOR:" + f);
	}
}