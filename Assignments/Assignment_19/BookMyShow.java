package methodoverriding;

class BookMyShow_v1
{
	void book()
	{
		System.out.println("Book Movies");
	}
}
class BookMyShow_v2 extends BookMyShow_v1
{
	void book()
	{
		super.book();
		System.out.println("Book Concerts and Shows");
	}
}
class BookMyShow_v3 extends BookMyShow_v2
{
	void book()
	{
		super.book();
		System.out.println("Book Sports Tickets");
	}
}
public class BookMyShow 
{
	public static void main(String[] args) 
	{
		BookMyShow_v3 v4=new BookMyShow_v3();
		v4.book();
	}
}
