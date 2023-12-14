class Hero
{
	void vehicle(String mod)
	{
		System.out.println("Bike Modelname is "+mod);
	}
	void vehicle(int cost)
	{
		System.out.println("Cost is "+cost);
	}
	void vehicle(String colour, String type)
	{
		System.out.println("Bike Colour is "+colour+" Type is "+type);
	}
}
class Bike
{
	public static void main(String[] args)
	{
		Hero h1=new Hero();
	    h1.vehicle("X Pulse 4v");
	    h1.vehicle(195000);
	    h1.vehicle("Sporty Red","Petrol");
	}
}