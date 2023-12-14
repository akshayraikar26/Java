class Myntra
{
	void filter(String brand)
	{
		System.out.println("T-shirt brand "+brand);
	}
	void filter(char size)
	{
		System.out.println("T-shirt Size "+size);
	}
	void filter(int cost)
	{
		System.out.println("T-Shirt Cost "+cost);
	}
}
class Clothshopping
{ 
	public static void main(String[] args)
	{
		Myntra m1=new Myntra();
		m1.filter("Nike");
		m1.filter('L');
		m1.filter(500);
		
	}
}