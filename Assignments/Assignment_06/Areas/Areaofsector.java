class Areaofsector
{ 

	static void area(int r)
	{
		double t=30.5;
		double area=0.5*r*r*t;
		System.out.println(area);
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Area of sector is");
		area(5);
		

	}
}