class Areaofcircle
{ 

	static void area(int r)
	{
		final double pi=3.142;
		double area=pi*r*r;
		System.out.println(area);
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Area of circle is");
		area(5);
		

	}
}