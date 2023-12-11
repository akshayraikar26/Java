class Electronics
{
	void mobile()
	{
		System.out.println("Apple Iphone 14");
	}
}
class Flipkart
{
	static void order(Electronics e1)
	{
		e1.mobile();
	}


}
class Customer
{
	public static void main(String[] args)
	{
		Electronics e2=new Electronics();
			Flipkart.order(e2);
	}
}