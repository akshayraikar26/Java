class Cars
{
	static void kia(String Mod)
	{
		System.out.println("Car Model is "+Mod);
	}
	static void kia(int cost)
	{
		System.out.println("Car cost is "+cost);
	}
	static void kia(char type)
	{
		System.out.println("Fuel Type is "+type);
	}
}
class Car
{
	public static void main(String[] args)
	{
		Cars.kia("Carnival");
		Cars.kia(4500000);
		Cars.kia('P');
	}
}