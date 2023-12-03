class Assignment
{
	void area()
	{
		final double pi=3.142;
		double aa=0.5;
		double the=36.8;
		int a=7;
		int b=3;
		int h=9;
		int r=4;
		int w=6;
		double circle=pi*r*r;
		double triangle=aa*b*h;
		int square=a*a;
		int rectangle=w*h;
		int parallelogram=b*h;
		double trapezoid=aa*(a+b)*h;
		double ellipse=pi*a*b;
		double sector=aa*r*r*the;
		System.out.println(circle);
		System.out.println("Area of Triangle");
		System.out.println(triangle);
		System.out.println("Area of Square");
		System.out.println(square);
		System.out.println("Area of Rectangle");
		System.out.println(rectangle);
		System.out.println("Area of Parallelogram");
		System.out.println(parallelogram);
		System.out.println("Area of Trapezoid");
		System.out.println(trapezoid);
		System.out.println("Area of Ellipse");
		System.out.println(ellipse);
		System.out.println("Area of Sector");
		System.out.println(sector);
	}
	public static void main(String[] args)
	{
		System.out.println("Area of Circle");
		new Assignment().area();
	}
}