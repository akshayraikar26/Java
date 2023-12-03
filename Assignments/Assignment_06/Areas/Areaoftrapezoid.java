class Areaoftrapezoid
{
	static void area(int a,int b,int h)
	{
		double area=0.5*(a+b)*h;
		System.out.println(area);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Area of trapezoid is");
		area(10,18,5);
	}
}