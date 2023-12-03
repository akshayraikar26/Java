class Circle
{
	static void area(int r)
	{
		final double pi=3.142;
		double re=pi*r*r;
		System.out.println(re);
	}
}
class Triangle
{
	static void area(int b, int h)
	{
		double aa=0.5;
	    double re=aa*b*h;
	System.out.println(re);	
	}
}
class Square
{
	static void area(int a)
	{
		int re=a*a;
		System.out.println(re);
	}
}
class Rectangle
{
	static void area(int w, int h)
	{
		int re=w*h;
		System.out.println(re);
	}
}
class Parallelogram
{
	static void area(int b, int h)
	{
		int re=b*h;
		System.out.println(re);
	}
}
class Ellipse
{
	static void area(int a, int b)
	{
		final double pi=3.142;
		double re=pi*a*b;
		System.out.println(re);
	}
}
class Sector
{
	static void area(double aa, int r, double the)
	{
		double re=aa*r*r*the;
		System.out.println(re);
	}
}
class Trapezoid
{
	static void area(double aa, int a, int b, int h)
	{
		double re=aa*(a+b)*h;
		System.out.println(re);
	}
}
class Assignment_2
{
	public static void main(String[] args)
	{
		System.out.println("Area of Circle");
		Circle.area(5);
		System.out.println("Area of Triangle");
		Triangle.area(5,10);
		System.out.println("Area of Square");
		Square.area(20);
		System.out.println("Area of Rectangle");
		Rectangle.area(20,40);
		System.out.println("Area of Parallelogram");
		Parallelogram.area(2,4);
		System.out.println("Area of Ellipse");
		Ellipse.area(4,8);
		System.out.println("Area of Sector");
		Sector.area(0.5,6,38.7);
		System.out.println("Area of Trapezoid");
		Trapezoid.area(0.5,6,3,8);
	}
}