class Areaofellipse
{
	static void area(int a,int b)
	{
		final double pi=3.142;
		double area=pi*a*b;
		System.out.println(area);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Area of ellipse is");
		area(5,5);
	}
}