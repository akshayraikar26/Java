package methodoverriding;

class Uber_v1
{
	void book()
	{
		System.out.println("Book Cab");
	}
}
class Uber_v2 extends Uber_v1
{
	void book()
	{
		super.book();
		System.out.println("Order Food");
	}
}
public class UberUpdated 
{
	public static void main(String[] args) 
	{
		Uber_v2 v3=new Uber_v2();
		v3.book();
	}

}
