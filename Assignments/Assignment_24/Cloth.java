package tostring;

public class Cloth {
	String color;
	int cost;
	char size;
	Cloth(String color, int cost, char size)
	{
		this.color=color;
		this.cost=cost;
		this.size=size;
	}
	public String toString()
	{
		return this.color+" "+this.cost+" "+this.size;
	}
	public static void main(String[] args) {
		Cloth c=new Cloth("Black", 599, 'L');
		System.out.println(c);
	}
}
