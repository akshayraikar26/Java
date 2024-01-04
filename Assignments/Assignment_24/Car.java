package tostring;

public class Car {
	String Model;
	char type;
	int cost;
	Car(String Model, char type, int cost)
	{
		this.Model=Model;
		this.type=type;
		this.cost=cost;
	}
	public String toString()
	{
		return this.Model+" "+this.type+" "+this.cost;
	}
	public static void main(String[] args) {
		Car c=new Car("I20", 'P', 1500000);
		System.out.println(c);
	}
}
