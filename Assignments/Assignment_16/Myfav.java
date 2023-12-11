class Nike
{
	void shoe()
	{
		System.out.println("Nike Air Jordan");
	}
}
class Myntra
{
	static void ecommerce(Nike n2)
	{
		n2.shoe();
	}
}
class Myfav
{
	public static void main(String[] args)
	{
		Nike n1=new Nike();
		Myntra.ecommerce(n1);
	}
}