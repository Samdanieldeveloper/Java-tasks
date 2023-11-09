class fibonacciSerFor
{
	void fiboSer()
	{
		int a=0,b=1,i;
		//System.out.println(a);
		//System.out.println(b);
		for(i=0;i<=20;++i)
		{
			i=a+b;
			a=b;
			b=i;
			System.out.println(a+"+"+b+"="+i);
			
		}
	}
	public static void main(String args[])
	{
		fibonacciSerFor fsf=new fibonacciSerFor();
		fsf.fiboSer();
	}
}
class fibonacciSeriesRec
{
	void defaultSer()
	{
		System.out.println("   default "+" (a) "+a);
		System.out.println("   default "+" (b) "+b);
	}
	int a=0,b=1,i=2;
	void fiboRecu()
	{
		if(i<=20)
		{
			i=a+b;
			a=b;
			b=i;
			System.out.println(" (a) "+a+" = "+" (b) "+b+" = "+" (i) "+i);
			fiboRecu();
			
		}
	}
	public static void main(String args[])
	{
		fibonacciSeriesRec fsrc=new fibonacciSeriesRec();
		fsrc.defaultSer();
		fsrc.fiboRecu();
	}
}
/*
Output

default  (a) 0
   default  (b) 1
 (a) 1 =  (b) 1 =  (i) 1
 (a) 1 =  (b) 2 =  (i) 2
 (a) 2 =  (b) 3 =  (i) 3
 (a) 3 =  (b) 5 =  (i) 5
 (a) 5 =  (b) 8 =  (i) 8
 (a) 8 =  (b) 13 =  (i) 13
 (a) 13 =  (b) 21 =  (i) 21

*/