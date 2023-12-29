package abstraction;

interface B_Tech
{
	void stream();
}
class Cse implements B_Tech
{
	public void stream()
	{
		System.out.println("CSE");
	}
}
class Ece implements B_Tech
{
	public void stream()
	{
		System.out.println("ECE");
	}
}
class EEE implements B_Tech
{
	public void stream()
	{
		System.out.println("EEE");
	}
}
class Student
{
	public static void engineering(B_Tech b1)
	{
		b1.stream();
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		Cse c=new Cse();
		Ece ec=new Ece();
		EEE ee=new EEE();
		Student.engineering(ee);
		Student.engineering(ec);
		Student.engineering(c);
	}

}
