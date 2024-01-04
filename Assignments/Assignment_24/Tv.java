package tostring;

public class Tv {
	String brand;
	String type;
	int cost;
	Tv(String brand, String type, int cost)
	{
		this.brand=brand;
		this.type=type;
		this.cost=cost;
	}
	public String toString()
	{
		return this.brand+" "+this.type+" "+this.cost;
	}
	public static void main(String[] args) {
		Tv t=new Tv("One Plus", "Smart Tv", 25000);
		System.out.println(t);
	}
}
