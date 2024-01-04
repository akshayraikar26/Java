package tostring;

public class Mobile {
	String Modelname;
	String color;
	double cost;
	Mobile(String Modelname, String color, double cost)
	{
		this.Modelname=Modelname;
		this.color=color;
		this.cost=cost;
	}
	public String toString()
	{
		return this.Modelname+" "+this.color+" "+this.cost;
	}
	public static void main(String[] args) {
		Mobile m=new Mobile("I phone 14", "Black", 79999.99);
		System.out.println(m);
		Mobile m2=new Mobile("I phone 15", "Orange", 79999.99);
		System.out.println(m2);
	}
}
