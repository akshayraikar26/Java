package encap;
class Flipkart
{
	private int pass=1234;
	public int getPassword()
	{
		return pass;
	}
	public void setpassword(int pass)
	{
		this.pass=pass;
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		Flipkart f=new Flipkart();
		System.out.println(f.getPassword());
		f.setpassword(222);
		System.out.println(f.getPassword());
	}
}
