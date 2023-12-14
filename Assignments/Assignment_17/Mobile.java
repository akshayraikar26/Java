class Apple
{
	void ios(String model)
	{
		System.out.println("Model Name "+model);
	}
	void ios(double cost)
	{
		System.out.println("Cost is "+cost);
	}
	void ios(String colour, String warranty)
	{
		System.out.println("Colour is "+colour+" Warranty "+warranty);
	}
}
class Mobile
{
	public static void main(String[] args)
	{
		Apple a1=new Apple();
		a1.ios("I Phone 14");
		a1.ios(79999.99);
		a1.ios("Midnight Black","1 Year");
	}
}