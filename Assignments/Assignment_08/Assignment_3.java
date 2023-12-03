class Circle
{
	static void area()
	{
		final double pi=3.142;
		int r=6;
		double result=pi*r*r;
		System.out.println(result);
	}
}
class Triangle
{
	static void area()
	{
		double aa=0.5;
		int b=2;
		int h=4;
		double result1=aa*b*h;
		System.out.println(result1);
	}
}
class Rectangle
{
	static void area()
	{
		int w=10;
		int h=3;
		int result2=w*h;
		System.out.println(result2);
	}
}
class Square
{
	static void area()
	{
		int a=20;
		int result3=a*a;
		System.out.println(result3);
	}
}
class Parallelogram
{
	static void area()
	{
		int b=2;
		int h=30;
		int result4=b*h;
		System.out.println(result4);
	}
}
class Ellipse
{
	static void area()
	{
		final double pi=3.142;
		int a=25;
		int b=2;
		double result5=pi*a*b;
		System.out.println(result5);
	}
}
class Trapezoid
{
	static void area()
	{
		double aa=0.5;
		int a=2;
		int b=4;
		int h=10;
		double result6=aa*(a+b)*h;
		System.out.println(result6);
	}
}
class Sector
{
	static void area()
	{
		double aa=0.5;
		int r=2;
		double the=33.3;
		double result7=aa*r*r*the;
		System.out.println(result7);
	}
}
class Assignment_3
{
	public static void main(String[] args)
	{
		System.out.println("Area of Circle");
		Circle.area();
		System.out.println("Area of Triangle");
		Triangle.area();
		System.out.println("Area of Rectangle");
		Rectangle.area();
		System.out.println("Area of Square");
		Square.area();
		System.out.println("Area of Parallelogram");
		Parallelogram.area();
		System.out.println("Area of Ellipse");
		Ellipse.area();
		System.out.println("Area of Trapezoid");
		Trapezoid.area();
		System.out.println("Area of Sector");
		Sector.area();
	}
}