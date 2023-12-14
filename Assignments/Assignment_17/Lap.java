class Lenovo
{
	static void slim(String Mod)
	{
		System.out.println("Laptop Model is "+Mod);
	}
	static void slim(int cost)
	{
		System.out.println("Laptop cost is "+cost);
	}
	static void slim(String colour,int windows)
	{
		System.out.println("Laptop colour is "+colour+" Opearting windows "+windows);
	}
}
class Lap
{
	public static void main(String[] args)
	{
		Lenovo.slim("Yoga Slim 7");
		Lenovo.slim(85990);
		Lenovo.slim("Metal Grey",11);
	}
}