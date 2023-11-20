class calci								//new class 	
{										//properties and behaviour
	int x;							 	//it is instence variable 
	public int add(int a1,int a2)		//its is local variable	   and    //it will pointing c.add(a,b)
	{
		int c = a1 + a2;				
		return c;
	}
}
class B3oops  //oops     //mainclass	//object oriented progaraming 
{
	public static void main(String[] args)	
	{
		int a = 12837;
		int b = 20872;

		calci c = new calci();			//object creation	

		int result = c.add(a,b);		//we need to declare like this 

		System.out.println(result);	
	}
}