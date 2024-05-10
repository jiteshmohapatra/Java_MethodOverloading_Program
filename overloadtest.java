class overload
{
	int add(int a, int b)
	{
		return (a+b);
	}
	
	float add(float a, float b)
	{
		return (a+b);
	}
	
	String add(String a, String b)
	{
		return (a+b);
	
	}

}	

class overloadtest
{

	public static void main(String args[])
	{
		
		int a =10, b = 20;
		float c=23.75f, d=78.98f;
		String g ="Java", h= "class";
		overload ovd = new overload();
		
		System.out.println ("Integer version: a+b =" + ovd.add(a,b));
		System.out.println ("Float version: a+b =" + ovd.add(c,d));
		System.out.println ("String version: a+b =" + ovd.add(g,h));
	}
	
}