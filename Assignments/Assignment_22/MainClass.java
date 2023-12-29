package abstraction;

interface Seasons
{
	  void weather();
}
class Summer implements Seasons
{
	public void weather()
	{
		System.out.println("Summer");
	}
}
class Rainy implements Seasons
{
	public void weather()
	{
		System.out.println("Rainy");
	}
}
class Winter implements Seasons
{
	public void weather()
	{
		System.out.println("Winter");
	}
}
class Climate
{
	static void season(Seasons s1)
	{
		s1.weather();
	}
}
public class MainClass {
	public static void main(String[] args) {
		Summer s=new Summer();
		Rainy r=new Rainy();
		Winter w=new Winter();
		Climate.season(s);
		Climate.season(w);
		Climate.season(r);
	}
}
