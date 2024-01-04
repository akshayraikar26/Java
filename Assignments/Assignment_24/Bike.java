package tostring;

public class Bike {
	String brand;
	String color;
	double cost;
	Bike(String brand, String color, double cost)
	{
		this.brand=brand;
		this.color=color;
		this.cost=cost;
	}
	public String toString()
	{
		return this.brand+" "+this.color+" "+this.cost;
	}
	public static void main(String[] args) {
		Bike b=new Bike("X Pulse", "Sporty Red", 195000.23);
		System.out.println(b);
	}
}
