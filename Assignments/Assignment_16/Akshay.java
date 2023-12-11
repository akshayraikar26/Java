class Xpulse4v
{
	void bike()
	{
		System.out.println("Bike Ordered");
	}
}
class Hero
{
	static void company(Xpulse4v x2)
	{
		x2.bike();
	}
}
class Akshay
{
	public static void main(String[] args)
	{
		Xpulse4v x1=new Xpulse4v();
		Hero.company(x1);
	}
}