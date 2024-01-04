package tostring;

public class Home {
	String name;
	String color;
	double cost;
	Home(String name, String color, double cost)
	{
		this.name=name;
		this.color=color;
		this.cost=cost;
	}
	public String toString()
	{
		return this.name+" "+this.color+" "+this.cost;
	}
	public static void main(String[] args) {
		Home h=new Home("AMG", "Smokey grey", 10000000.11);
		System.out.println(h);
	}
}
