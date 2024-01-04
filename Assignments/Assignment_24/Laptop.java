package tostring;

public class Laptop {
	String brand;
	String name;
	double cost;
	Laptop(String brand, String name, double cost)
	{
		this.brand=brand;
		this.name=name;
		this.cost=cost;
	}
	public String toString()
	{
		return this.brand+" "+this.name+" "+this.cost;
	}
	public static void main(String[] args) {
		Laptop l=new Laptop("Lenovo", "Yoga Slim7", 85999.99);
		System.out.println(l);
	}
}
