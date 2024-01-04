package tostring;

public class Course {
	String name;
	String uni;
	int fee;
	Course(String name, String uni, int fee)
	{
		this.name=name;
		this.uni=uni;
		this.fee=fee;
	}
	public String toString()
	{
		return this.name+" "+this.uni+" "+this.fee;
	}
	public static void main(String[] args) {
		Course c=new Course("BE", "VTU", 1650);
		System.out.println(c);
	}
}
