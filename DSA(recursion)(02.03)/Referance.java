class Referance
{
	void passByRef(int a[])
	{
		
		a[3]=7;
		
		a[1]=0;
	}
	
	public static void main(String[] args)
	{
		int ar[] = {1,2,3,4,5,9};
		Referance obj = new Referance();
		obj.passByRef(ar);
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+",");
		}
	}
}