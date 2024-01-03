package encap;
class lap
{
	private String pass="Aks26@18";
	public String getpassword()
	{
		return pass;
	}
	public void setpassword(String pass)
	{
		this.pass=pass;
	}
}
public class Mainclass5 {
	public static void main(String[] args) {
		lap l=new lap();
		System.out.println(l.getpassword());
		l.setpassword("AMG!");
		System.out.println(l.getpassword());
	}
}
