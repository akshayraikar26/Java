package tostring;

public class School {
	String name;
	char grade;
	int strength;
	School(String name, char grade, int strength)
	{
		this.name=name;
		this.grade=grade;
		this.strength=strength;
	}
	public String toString()
	{
		return this.name+" "+this.grade+" "+this.strength;
	}
	public static void main(String[] args) {
		School s=new School("AES", 'A', 2000);
		System.out.println(s);
	}
}
