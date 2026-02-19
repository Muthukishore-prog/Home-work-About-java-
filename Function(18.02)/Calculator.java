class Calculator
{
	public static void main(String[] args)
	{
		// to create a object for the user
		Calculator cal = new Calculator();
		
		//call function like add,sub.... and then declear the value in the ()..
		int res1=cal.add(2000,5);
		int res2=cal.sub(3,1);
		int res3=cal.pro(9,2);
		int res4=cal.div(100,5);
		
		System.out.println("Addition : "+res1);
		System.out.println("subraction : "+res2);
		System.out.println("Multiplication : "+res3);
		System.out.println("Division : "+res4);
		
	}
	//addition
	int add (int a,int b)
	{
		int c = a+b;
		return c;
	}
	//subraction
	int sub (int d,int e)
	{
		int f = d-e;
		return f;
	}
	//Multiplication
	int pro (int g,int h)
	{
		int i = g*h;
		return i;
	}
	//Division
	int div (int j,int k)
	{
		int l = j/k;
		return l;
	}
	
	
}