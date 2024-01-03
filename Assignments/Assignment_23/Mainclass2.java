package encap;
class Atm
{
	private int pin=2618;
	public int getpassword()
	{
		return pin;
	}
	public void setpassword(int pin)
	{
		this.pin=pin;
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		Atm a=new Atm();
		System.out.println(a.getpassword());
		a.setpassword(2603);
		System.out.println(a.getpassword());
	}

}
