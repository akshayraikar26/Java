package tostring;

public class Employee {
	String name;
	int id;
	double sal;
	Employee(String name, int id, double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public String toString()
	{
		return this.name+" "+this.id+" "+this.sal;
	}
	public static void main(String[] args) {
		Employee e=new Employee("Akshay", 95174846, 1200000.23);
		System.out.println(e);
	}
}
